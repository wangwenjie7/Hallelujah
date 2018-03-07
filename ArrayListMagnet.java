/*
这个程序在编译的时候会报错：
      编码gbk的不可映射字符
这是因为有中文注释的原因；
解决方法：
      这样编译 javac -encoding utf-8 ArrayListMagnet.java
@author 《head first Java》
@version “1.8.1_131”
*/

import java.util.*;//ArrayList这个类包含在java.util这个包中
//此程序的类名叫ArrayListMagnet
public class ArrayListMagnet{
  public static void main (String[] args){
    //创建ArrayList类，类型 String，对象是 a,
    ArrayList<String> a = new ArrayList<String>();
    //加入元素
    a.add(0,"zero");
    a.add(1,"one");
    a.add(2,"two");
    a.add(3,"three");
    printAL(a);

    if(a.contains("three")){
      a.add("four");
    }
    a.remove(2);
    printAL(a);

     if(a.indexOf("four") != 4){
       a.add(4,"4.2");
     }
    printAL(a);

    if(a.contains("two")){
      a.add("2.2");
    }
    printAL(a);
  }

  public static void printAL(ArrayList<String> al){
    //利用超级for循环，打印ArrayList的所有元素
    for(String element : al){
      System.out.println(element + " ");
    }

    System.out.println(" ");
  }

}
