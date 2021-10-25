import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  public static ArrayList<Integer> sort(ArrayList<Integer> list) {
    return list;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(5, 2, 4, 6, 1, 3));
    System.out.println(sort(list));
  }
}
