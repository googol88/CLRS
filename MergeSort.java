import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  public static ArrayList<Integer> sort(ArrayList<Integer> list) {
    split(list);
  }
  public static ArrayList<Integer> split(ArrayList<Integer> list) {
    if(list.size() > 1) {
      ArrayList<Integer> left = new ArrayList<>();
      for(int i = 0; i < list.size()/2-1; i++) {
        left.add(list.get(i));
      }
      sort(left);
      
      ArrayList<Integer> right = new ArrayList<>();
      for(int i = list.size()/2; i < list.size()-1; i++) {
        right.add(list.get(i));
      }
      sort(right);
    }
    return list;
  }
  /*public static ArrayList<Integer> merge(ArrayList<Integer> list) {
    
  }*/
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(5, 2, 4, 6, 1, 3));
    System.out.println(sort(list));
  }
}
