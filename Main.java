import java.util.*;

public class Main{
  public static void main(String[]args){
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    int number [] = new int [size];
    System.out.println("Enter the elements in the array=");

    for(int i = 0;i<size;i++){

      number[i] =sc.nextInt();

    }

    int max = number[0];
    for(int i = 0;i<size;i++){

      if(max<number[i]){
        max = number[i];
      }

    }

    System.out.print(max); 
  }
}