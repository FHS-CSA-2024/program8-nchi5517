//import stuff here
import java.util.Scanner;
import java.lang.Math;
//Your code here
public class Program8{
     int a;
     int b;  
     double average;
     int product;
     int sum;
     int difference;
     int absoluteValue;
     int maximum;
     int minimum;
     
    
    public Program8(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a: ");
     int a = scanner.nextInt();
     System.out.print("Enter b: ");
     int b = scanner.nextInt();
      product = a*b;
      sum = a+b;
      difference = a-b;
      if (a>b){
          maximum = a;
          minimum = b;
      }
      if (b>a){
          maximum = b;
          minimum = a;
      }
      average = sum/2;
      absoluteValue = -1*difference;
    }
    
    public void getSum(){
        System.out.println("Sum = "+ sum);
    }
    public void getDifference(){
        System.out.println("Difference = "+ difference);
    }
    public void getProduct(){
        System.out.println("Product = "+ product);
    }
    public void getAverage(){
        System.out.println("Average = "+ average);
    }
    public void getAbsoluteValue(){
        System.out.println("Absolute value = "+ absoluteValue);
    }
    public void getMinimum(){
       System.out.println("Minimum = "+ minimum);
    }
    public void getMaximum(){
        System.out.println("Maximum = "+ maximum);
    }
}

