import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ArrayList
 */
public class ArrayListDemo {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter 5 numbers");
    for (int i = 0; i < 5; i++) {
      list.add(scan.nextInt());
    }
    System.out.println("The list is: ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
    Collections.sort(list);
    System.out.println("Sorted list:");
    for (int elem : list) {
      System.out.print(elem + " ");
    }
    System.out.println();
    int num;
    do {
      System.out.println("Enter a number to search. (0 to stop)");
      num = scan.nextInt();
      if (list.contains(num)) {
        System.out.println("Found");
      } else {
        System.out.println("Not found");
      }
    } while (num != 0);
    scan.close();

    ArrayList<Integer> newList = new ArrayList<Integer>();
    newList.add(1);
    newList.add(2);
    
  }
}
