class Function {
  String a = "   wwj ztq   ";
  public void methedSplit() {
    String[] b = a.split(" ");
    for (int i=0; i<b.length; i++) {
      System.out.println(b[i]);
    }
  }
  public void methedTrim() {
    String b = a.trim();
    System.out.println(a);
    System.out.println(b);
  }
  public void myTrim(String str) {
    int start = 0, end = str.length()-1;
    while(start <= end && str.charAt(start) == ' ')
    start++;
    while(start <= end && str.charAt(end) == ' ')
    end--;
    String str_0 = str.substring(start,end+1);
    System.out.println(str_0);
  }



  public void myReverse(String s) {
    int start = 0,end = s.length()-1;
    while(start == end) {
      swap(s.charAt(start),s.charAt(end));
      start++;
      end--;
    }
    String m = s.substring(start,end);
    System.out.println(m);
  }

public void swap(char a,char b) {
  char temp;
  temp = a;
  a = b;
  b = temp;
}

}

class Demo55 {
  public static void main(String[] args) {
    String a = "wwj";
    char[] b = a.toCharArray();
    Function f = new Function();
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i]);
    }
  }
}
