//For a given array of integers (positive and negative) find the largest sum of a contiguous sequence.
// unfinished- finding index of start and end elements.
import java.util.Scanner;
public class findTheSumOfContiguousSequence {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int count;
        int maxEndingHere = 0;
        int greaterSum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in a array:");
        count = scan.nextInt();
        int num[] = new int[count];
        System.out.println("Enter the elements you want to put in a array:");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) {

            maxEndingHere += num[i];
           if(maxEndingHere < 0){
               maxEndingHere = 0;
           }
           if(greaterSum < maxEndingHere){
               b = i;
               greaterSum = maxEndingHere;
           }
        }
        System.out.println(greaterSum);



    }
}