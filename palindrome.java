public class palindrome 
{
    public static void polindromenumber(int n){
    int reverse=0;
    int original=n;
    while (n>0){
    int lastdigit=n%10;
         reverse=reverse*10+lastdigit;
         n=n/10;
    }
    if (original==reverse){
System.out .println("given number is polindrome:"+original);
    }else{ 
        System.out.print("given number is not polindrome:"+original);
    }
}
    public static void main (String []args){
        polindromenumber(132);
        polindromenumber(121);
        polindromenumber(443);
}
}
