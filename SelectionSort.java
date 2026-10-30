import java.util.*;

public class SelectionSort{
  public static void main(String[]args){
    int a[]={63,25,12,22,11};
    for(int i=0;i<a.length-1;i++){
      int min=i;
      for(int j=0;j<a.length;j++){
        if(a[j]<a[min]){
          min=j;
        }
      }
      int temp=a[i];
      a[i]=a[min];
      a[min]=temp;
    }
    System.out.println("Sorted Array:");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}