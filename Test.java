/*
�ڲ���������ڲ��������
*/
//�ӿڣ�����һ���� public abstract���ɲ�д��
interface Out {
  public abstract void method();
}

class Visit {
//�������ڲ��࣬�����ֵ� In
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
//�������������ڲ���
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
    //Visit.function():Visit������һ����̬�ķ��� function()
    //Visit.function()���Ե��� method()����������˵
    //function()Ӧ�÷���һ�����󣬶����� Out���͵Ķ���
    Visit.function().method();
  }
}
