import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    int n=1234;
    int reverse=0;
    for(int i=n;i>0;i/=10){
      reverse=reverse*10;
      reverse+=i%10;
    }
    System.out.println(reverse); 
  }
}