import java.io.*;
import java.util.*;
  public class SimpleIntrest{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Priciple amount:");
      int pa=sc.nextInt();
      System.out.println("Enter time:");
      int t=sc.nextInt();
      System.out.println("Enter Rate:");
      int r=sc.nextInt();
      System.out.println("SIMPLE INTREST:"+((pa*t*r)/100));
      }
    }  
      
