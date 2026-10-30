import java.util.*;
public class Largest{
public static void main(String[]args){
int arr[]={7,8,15,17,91,15};
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<max){
max=arr[i];
}
}
System.out.println("largest:"+max);
}
}
