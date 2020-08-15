import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    System.out.println("What is your name?");
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    if (s.equals("Peter")){
      System.out.println("Peter is also my name");

    } 
    else if(s.equals("Hello")) {
      System.out.println("Hey, how are you?");
    } 
    else {
      System.out.println("Your name is " + s);
    }
    System.out.println("How old are you?");
    Scanner old = new Scanner(System.in);
    String a = sc.nextLine();
    int age = Integer.parseInt(a);

    if (age >= 18){
      System.out.println("you are an adult");
      System.out.println("Can you tell me your favorite music genre?");
      String music = sc.nextLine();
      if (music.equals("80s music or prior"))
      {
        System.out.println("You have great taste!");
      } 
      else{
        System.out.println("You should listen to 80s music or prior!");
      }

    } else if (age >= 13) {
      System.out.println("You are an teenager");
    } else {
      System.out.println("You aren't a teenager or an adult");
    }

  }
}