public class Arraycc{
public static void reverse_an_array(int number[]){
int first=0;
int last= number.length-1;
while(first < last){
    //swap
    int temp= number[last];
    number[last]=number[first];
        number [first] =temp;
        first++;
        last--;
}
}
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        reverse_an_array(number);
        //print
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        }
    }
