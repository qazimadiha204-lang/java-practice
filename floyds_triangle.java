public class pattern{
    public static void floyds_triangle(int n){
    //outer loop
    int counter=1;
    for(int i=1;i<=n;i++){
      // inner how many time counter will be print
    
  for (int j=1;j<=i;j++){

       System.out.print(counter+" ");
       counter++;
      }
      System.out.println();
    }
  }
    public static void main (String []args){        
      floyds_triangle(5);
}
}
//
1
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
