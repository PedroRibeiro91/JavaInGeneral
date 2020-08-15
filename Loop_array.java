import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // create an array
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5,6};
    String[] names = new String[5];
    
    for (int i = 0; i < arr.length; i++){
      // start at i = 0, stops at i = 10, increment 1
      if (arr[i] == 5){
        System.out.println("Found an value 5 at index "+ i);
      }
    }
    int count = 0;
    for (int element:arr){
      System.out.println(element + " has index " + count);
      count++;
    }
    // lets populate our array names
    for (int i = 0; i < names.length; i++){
      System.out.print("name please: ");
      String name = sc.nextLine();
      names[i] = name;
      }
    for (String n:names){
      System.out.println(n);
    }
    // an example of of the break command
    for (String n:names){
      System.out.println(n);
      if (n == "Maria"){
        break;
      }
    }
  } 
}