/*
多线程
多个线程执行一个进程
卖票这个进程的代码放在Runnable的子类中；
分配几个线程来同时执行这个卖票程序
方法是：Runnable子类的对象作为参数传递给Thread的构造器
*/
/*
多线程的安全问题，可以用同步代码块来解决，
    synchronized (obj) {}
每次只有一个线程去执行，未执行完，下一个线程不能进入
就如图一把锁一样，具有开关的形象感
还可以改进，直接使用同步函数，同步函数的锁是this
*/
class SaleTicket implements Runnable {
  private int count = 100;
  public void run () {
    while(true) {
      show();
    }
  }
  public synchronized void show() {
    if (count > 0) {
      try {
        Thread.sleep(10);
      }
      catch (Exception e) {}
      System.out.println(Thread.currentThread().getName()+"---sale:"+count);
      count--;
    }
  }
}

class Ticket {
  public static void main(String[] args) {
    SaleTicket t = new SaleTicket();
    Thread t0 = new Thread(t);
    Thread t1 = new Thread(t);
    Thread t2 = new Thread(t);
    t0.start();
    t1.start();
    t2.start();
  }
}
