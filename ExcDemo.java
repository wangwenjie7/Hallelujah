/*
�쳣����
*/

//�Զ����쳣���� FuShuException���̳��� Exception
class FuShuException extends Exception {
  //���Ǹ���Ĺ��캯��
  FuShuException(String message) {
    super(message);
  }
}
//��Ĺ����ǳ������㣬�����쳣����
//һ�����õ��쳣�������������㣬�׳��쳣 ArithmeticException
//�����Զ�����쳣���������ڸ������׳��쳣 FuShuException
class function {
  public void div(int a,int b) throws ArithmeticException,FuShuException {
    if(b<0)
    throw new FuShuException("/ by minus");//�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
    System.out.println(a/b);
  }
}

class ExcDemo {
  public static void main(String[] args) {
    System.out.println("Start");
    function f = new function();

    try {
      f.div(7,-5);//�����׳��쳣�Ĵ���
    }
    catch(ArithmeticException e) {
      System.out.println("����������Ϊ��");
      System.out.println(e.toString());//toString()��ӡ�쳣��Ϣ
    }
    catch(FuShuException e) {
      System.out.println("����������Ϊ����");
      System.out.println(e.toString());
    }

    System.out.println("End");
  }
}
