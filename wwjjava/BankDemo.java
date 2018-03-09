class Bank {
  private int sum;
  //Object obj = new Object();
  public synchronized void add (int m) {
    //synchronized (obj) {
      sum = sum + m;
      try {
        Thread.sleep(10);
      }
      catch (Exception e) {}
      System.out.println(Thread.currentThread().getName()+"sum ="+sum);
    //}
  }
}

class Depositor implements Runnable {
  private Bank b = new Bank();
  public void run() {
    for (int i=1; i<=3; i++) {
      b.add(100);
    }
  }
}

class BankDemo {
  public static void main(String[] args) {
    Depositor d = new Depositor();
    Thread t1 = new Thread(d,"wwj---");
    Thread t2 = new Thread(d,"ztq---");
    t1.start();
    t2.start();
  }
}
