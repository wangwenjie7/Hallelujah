/*
获取代码的运行时间
用到的函数：获取时间 System。currentTimeMillis();
子类父类名字起的不怎么好
*/
//父类 GetTime
abstract class GetTime {
//不让子类覆盖的方法 getTIme(),用 final修饰；
  public final void getTime() {
    long start = System.currentTimeMillis();
    runcode();
    long end = System.currentTimeMillis();
    System.out.println("运行时间是"+(end-start));
  }
/*一定让子类覆盖的方法 runcode(),用 abstract修饰。
因为 runcode()这个方法，是具体的运行代码，都不相同；
每次测试不同代码的运行时间，只需要新建一个子类，
在子类里覆盖父类的抽象方法 runcode(),添加具体的代码*/
  public abstract void runcode();

}
//子类 RunTime
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
