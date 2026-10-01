public class circle{
    public static void sumofinteger(int n){
    int sum=0;
    while(n>0){
      int lastdigit =n%10;
      n=n/10;
 sum=sum+lastdigit;
    }
 
 System.out.print(sum);
 }

    
    public static void main (String []args){
        sumofinteger(132);
    
}
}