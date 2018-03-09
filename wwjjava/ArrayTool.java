//主要练习写帮助文档
/**
这个类的功能主要是，用于对数组取最大值，最小值
@author 王文洁
@version 1.8.0_151
*/
//这个工具类是公开可以直接使用的，所以定义成public
public class ArrayTool {

  /**获取一个整形数组的最大值。
  @param arr 接收一个int类型的数组。
  @return 返回该数组的最大值。
  */
  public static int getMax(int[] arr) {
    int max = 0;
    for (int x=1; x<arr.length; x++) {
      if (arr[x] > arr[max]) {
        max = x;
      }
    }
    return arr[max];
  }

  /**
  获取一个整形数组的最小值。
  @param arr 接收一个int类型的数组。
  @return 返回该数组的最小值。
  */
  public static int getMin(int[] arr) {
    int min = 0;
    for (int x=1; x<arr.length; x++) {
      if (arr[x] < arr[min]) {
        min = x;
      }
    }
    return arr[min];
  }

}
