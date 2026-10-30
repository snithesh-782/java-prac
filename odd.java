public class Main{
  public static void main(String[]args){
    int even=0;
    int odd=0;
    for(int i=1;i<=8;i++){
      if(i%2==0){
        even=even+i;
      }else{
        odd=odd+i;
      }
    }
    System.out.println("Even sum="+even);
    System.out.println("odd sum="+odd);
  }
}