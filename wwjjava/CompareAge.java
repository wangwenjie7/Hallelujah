/*
本功能的函数是判断两个学生的年龄是否相等
*/

//学生类
class Student {
  private String name;
  private int age;
//学生类的构造函数，参数是年龄
  Student(int age) {
    this.age = age;//this就是调用这个构造函数的引用变量
  }
  public boolean compare (Student s) {
    return this.age == s.age;//this是调用这个成员函数的引用变量
  }
}

class CompareAge {
  public static void main(String[] args) {
    Student s1 = new Student(16);
    Student s2 = new Student(16);
    boolean b = s1.compare(s2);
    System.out.println(b);
  }
}
