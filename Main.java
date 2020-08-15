import java.util.Scanner; 

public class Main{
  public static void main(String[] args){
    System.out.println("Hello JAVA!");
    System.out.println("I'm here to learn!");
    int n = 5;
    double n2 = 5.0;
    boolean b = false;
    char c = 'c';
    String str = "These are our data types in Java";
    System.out.println(n);
    System.out.println(n2);
    System.out.println(b);
    System.out.println(c);
    System.out.println(str);
    System.out.println("Now let's check how operations work");
    int x = 8;
    int y = 9;
    int z = 6;
    int sum = x + y + z;
    int pr = x * y * z;
    int sub = x - y - z;
    double div = (x*y)/(double)z;
    double exp = Math.pow(z, 2);
    int rem = y % x;
    System.out.println(sum);
    System.out.println(pr);
    System.out.println(sub);
    System.out.println(div);
    System.out.println(exp);
    System.out.println(rem);
    
    Scanner sc = new Scanner(System.in);
    String scanned = sc.next();
    System.out.println(scanned);
    //int scannedInt = sc.nextInt();
    //boolean scannedBoolean = sc.nextBoolean();
    
    boolean compare = x < y;
    System.out.println(compare);
    
    boolean and = x < y && z > x;
    System.out.println("Returns true if both are true");
    System.out.println(and);
    
    boolean or = x < y || z > x;
    System.out.println("Returns true if one of the comparisons is true");
    System.out.println(or);

    boolean not = !(x < y);
    System.out.println("Returns the opposite of the boolean value");
    System.out.println(not);

  }
}

