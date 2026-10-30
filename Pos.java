import java.util.*;
public class Pos{
  public static void main(String[] args){
    int[] arr={1,2,0};
    int missing=1;
    while(true){
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==missing){
          found=true;
          break;
        }
      }
      if(!found){
        System.out.println(missing);
        break;
      }
      missing++;
    }
  }
}