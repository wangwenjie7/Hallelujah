//��Ҫ��ϰд�����ĵ�
/**
�����Ĺ�����Ҫ�ǣ����ڶ�����ȡ���ֵ����Сֵ
@author ���Ľ�
@version 1.8.0_151
*/
//����������ǹ�������ֱ��ʹ�õģ����Զ����public
public class ArrayTool {

  /**��ȡһ��������������ֵ��
  @param arr ����һ��int���͵����顣
  @return ���ظ���������ֵ��
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
  ��ȡһ�������������Сֵ��
  @param arr ����һ��int���͵����顣
  @return ���ظ��������Сֵ��
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
