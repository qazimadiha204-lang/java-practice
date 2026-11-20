public class printpairs{
public static void printpairs(int number[]){
    for (int i=0;i<number.length;i++){
        int current=number[i];//2,4,6,8,10
        for (int j=i+1;j<number.length;j++){
            System.out.print("("+current+","+number[j]+")");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        printpairs(number);
        }
    }
