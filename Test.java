/*
内部类和匿名内部类的运用
*/
//接口，方法一定是 public abstract，可不写哒
interface Out {
  public abstract void method();
}

class Visit {
//下面是内部类，有名字的 In
/*
  static class In implements Out {
    public void method() {
      System.out.println("method run");
    }
  }

  static Out function() {
    return new In();
  }
*/
//下面是匿名的内部类
  static Out function() {
    return new Out() {
      public void method() {
        System.out.println("method run");
      }
    };
  }

}

class Test {
  public static void main(String[] args) {
    //Visit.function():Visit类中有一个静态的方法 function()
    //Visit.function()可以调用 method()方法，就是说
    //function()应该返回一个对象，而且是 Out类型的对象
    Visit.function().method();
  }
}
