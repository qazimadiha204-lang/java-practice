import java.util.*;
public class Arraysresult {
    public static void main(String[] args) {
        //input in arrays
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        //output in arrays 
        System.out.println(" phys:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);
        //update in arrays
        marks[2] = 100;
        System.out.println("math:" + marks[2]);
        double percentage = (marks[0] + marks[1] + marks[2]) / 3.0;
        System.out.println("percentage=" + percentage + "%");
        sc.close();
    }
}
