public class pattern{
    public static void hollow_ractangle(int totrows,int totcolumn){
    //outer loop
    for(int rows=1;rows<=totrows;rows++){
      //inner column
      for (int column=1;column<=totcolumn;column++){
         //cell(row,column)
         if(rows==1||rows==totrows||column==1||column==totcolumn){
            //boundry cell
            System.out.print("*");
      }else{
         System.out.print(" ");

      }
    }
    System.out.println();

   }
 }

    
    public static void main (String []args){
        hollow_ractangle(4,5);
    
}
}
