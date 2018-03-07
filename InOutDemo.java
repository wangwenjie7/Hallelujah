/*
�ȴ����ѻ���
*/
//��Ϣ�࣬������Ϣ�������Ա�
class Infor {
  String name;
  String sex;
  boolean flag = false;
//set���������������Ա𣬼��� synchronized ���Σ�����˵
//������������䶼ִ�����ˣ����˲ſ�������ִ��Ȩ
  public synchronized void set(String name,String sex) {
    if(this.flag)//true��ʱ�� wait ;
    //if�����ִ����һ�� wait();���ǻᷢ���쳣��try һ��
    //��Ҫע����ǣ�wait()һ���� synchronied һ��
    try {
      this.wait();
    }
    catch (Exception e) {

    }

    this.name = name;
    this.sex = sex;

    this.flag = true;
    //flagΪ true֮�󣬻���˯�ŵ� �̣߳�
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
//Input��Runnable���͵Ľӿ�
//�̵߳���һ���淨��ִ�������߳�Thread����������Thread�Ĳ�������
class Input implements Runnable {
  private Infor i;
  Input(Infor i){
    this.i = i;
  }
  int x = 0;
  //����Runnable���Ψһ����run()
  //run()�����Ҫִ�еĴ���
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
