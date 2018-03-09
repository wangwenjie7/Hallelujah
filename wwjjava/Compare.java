/*
�ȽϹ������������Ա�����Ĵ�С��
ֱ�Ӹ��Ǹ���� equals()����
equals()�����������Ƚ϶����
*/
class Student {
  private int age;

  Student (int age){
    this.age = age;
  }
  /*���Ǹ��� Object������
  Object obj = new Student()*/
  public boolean equals(Object obj) {
    /*��ֹ��������Ͳ��� Student���ͣ�
    �� if����ж�һ�£��������ͬһ���ͣ�
    �������ñȽϣ��϶� false*/
    if(!(obj instanceof Student))
    return false;
    /*�� Object���͵� objת���� Student���ͣ�
    Ȼ���Ƹ�һ��Student���͵ı�������������������Լ����������*/
    Student s = (Student)obj;
    return this.age == s.age;
  }
}


class Compare {
  public static void main(String[] args) {
    Student wwj = new Student(23);
    Student ztq = new Student(23);
    System.out.println(wwj.equals(ztq));
  }
}
