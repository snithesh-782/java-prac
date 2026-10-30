public class Secondlargest{
public static void main(String[]args){
int arr[]={7,8,15,17,91,15};
int max1=0;
int max2=0;
for(int i=0;i<arr.length;i++){
if(max1<arr[i]){
max2=max1;
max1=arr[i];
}else if(max2<arr[i]){
max2=arr[i];
}
System.out.println(max2);
}
}
}