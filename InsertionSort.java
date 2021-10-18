import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
  public static ArrayList<Integer> sort(ArrayList<Integer> list) {
    for(int i = 1; i < list.size(); i++) {
      int insertIndex = i - 1;
      while(insertIndex >= 0 && list.get(i) < list.get(insertIndex)) {
        insertIndex--;
      }
      int removed = list.remove(i);
      list.add(insertIndex+1, removed);
    }
    return list;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(5, 2, 4, 6, 1, 3));
    System.out.println(sort(list));
  }
}
