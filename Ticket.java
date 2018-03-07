/*
���߳�
����߳�ִ��һ������
��Ʊ������̵Ĵ������Runnable�������У�
���伸���߳���ͬʱִ�������Ʊ����
�����ǣ�Runnable����Ķ�����Ϊ�������ݸ�Thread�Ĺ�����
*/
/*
���̵߳İ�ȫ���⣬������ͬ��������������
    synchronized (obj) {}
ÿ��ֻ��һ���߳�ȥִ�У�δִ���꣬��һ���̲߳��ܽ���
����ͼһ����һ�������п��ص������
�����ԸĽ���ֱ��ʹ��ͬ��������ͬ������������this
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
