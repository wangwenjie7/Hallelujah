/*
比较功能两个对象成员变量的大小，
直接覆盖父类的 equals()方法
equals()方法是用来比较对象的
*/
class Student {
  private int age;

  Student (int age){
    this.age = age;
  }
  /*覆盖父类 Object函数，
  Object obj = new Student()*/
  public boolean equals(Object obj) {
    /*防止传入的类型不是 Student类型，
    用 if语句判断一下，如果不是同一类型，
    根本不用比较，肯定 false*/
    if(!(obj instanceof Student))
    return false;
    /*把 Object类型的 obj转化成 Student类型，
    然后复制给一个Student类型的变量，这个变量名字是自己又重新起的*/
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
