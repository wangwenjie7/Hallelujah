/*
��ȡ���������ʱ��
�õ��ĺ�������ȡʱ�� System��currentTimeMillis();
���ุ��������Ĳ���ô��
*/
//���� GetTime
abstract class GetTime {
//�������า�ǵķ��� getTIme(),�� final���Σ�
  public final void getTime() {
    long start = System.currentTimeMillis();
    runcode();
    long end = System.currentTimeMillis();
    System.out.println("����ʱ����"+(end-start));
  }
/*һ�������า�ǵķ��� runcode(),�� abstract���Ρ�
��Ϊ runcode()����������Ǿ�������д��룬������ͬ��
ÿ�β��Բ�ͬ���������ʱ�䣬ֻ��Ҫ�½�һ�����࣬
�������︲�Ǹ���ĳ��󷽷� runcode(),��Ӿ���Ĵ���*/
  public abstract void runcode();

}
//���� RunTime
class RunTime extends GetTime {
  public void runcode() {
    for (int x=0; x<1000; x++) {
      System.out.print(x+" ");
    }
  }
}

class Time {
  public static void main(String[] args) {
    RunTime rt = new RunTime();
    rt.getTime();
  }
}
