/*
等待唤醒机制
*/
//信息类，基本信息姓名和性别
class Infor {
  String name;
  String sex;
  boolean flag = false;
//set方法设置姓名和性别，加上 synchronized 修饰，就是说
//这个方法里的语句都执行完了，别人才可以抢到执行权
  public synchronized void set(String name,String sex) {
    if(this.flag)//true的时候 wait ;
    //if后面就执行这一句 wait();但是会发生异常，try 一下
    //需要注意的是：wait()一定和 synchronied 一起
    try {
      this.wait();
    }
    catch (Exception e) {

    }

    this.name = name;
    this.sex = sex;

    this.flag = true;
    //flag为 true之后，唤醒睡着的 线程；
    this.notify();
  }
  public synchronized void out() {
    if (!this.flag) {
      try {
        this.wait();
      }
      catch (Exception e) {

      }
    }
    System.out.println(name+"***"+sex);
    this.flag = false;
    this.notify();
  }
}
//Input是Runnable类型的接口
//线程的另一种玩法，执行它用线程Thread，把它放在Thread的参数里面
class Input implements Runnable {
  private Infor i;
  Input(Infor i){
    this.i = i;
  }
  int x = 0;
  //覆盖Runnable里的唯一方法run()
  //run()里就是要执行的代码
  public void run() {
    while(true) {
      if(x == 0) i.set("           ztq---","---man---");
      else i.set("wwj","woman");
      x = (x+1)%2;
      }
    }
  }

class Output implements Runnable {
  private Infor i;
  Output(Infor i){
    this.i = i;
  }
  public void run() {
    while(true) {
      i.out();
    }
  }
}

class InOutDemo {
  public static void main(String[] args) {
    Infor i = new Infor();

    new Thread(new Input(i)).start();
    new Thread(new Output(i)).start();

  }
}
