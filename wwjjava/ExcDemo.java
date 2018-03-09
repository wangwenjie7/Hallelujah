/*
异常处理
*/

//自定义异常处理 FuShuException，继承自 Exception
class FuShuException extends Exception {
  //覆盖父类的构造函数
  FuShuException(String message) {
    super(message);
  }
}
//类的功能是除法运算，两个异常处理
//一是内置的异常处理，除数等于零，抛出异常 ArithmeticException
//而是自定义的异常，除数等于负数，抛出异常 FuShuException
class function {
  public void div(int a,int b) throws ArithmeticException,FuShuException {
    if(b<0)
    throw new FuShuException("/ by minus");//手动通过throw关键字抛出一个自定义异常对象。
    System.out.println(a/b);
  }
}

class ExcDemo {
  public static void main(String[] args) {
    System.out.println("Start");
    function f = new function();

    try {
      f.div(7,-5);//可能抛出异常的代码
    }
    catch(ArithmeticException e) {
      System.out.println("除数不可以为零");
      System.out.println(e.toString());//toString()打印异常信息
    }
    catch(FuShuException e) {
      System.out.println("除数不可以为负数");
      System.out.println(e.toString());
    }

    System.out.println("End");
  }
}
