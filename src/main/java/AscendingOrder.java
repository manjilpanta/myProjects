import java.util.Scanner;
public class AscendingOrder{
    public static void main (String[] args) {
        int count, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of element you want in a array:");
        count = scan.nextInt();
        int num[] = new int[count];
        System.out.println("enter the elements you want in a array:");
        for( int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        for(int i = 0; i<count;i++){
            for( int j = i+1; j<count;j++){
                if(num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("numbers in Ascending order:");
        for(int i = 0; i < count - 1; i++){
            System.out.print(num[i] + ",");
        }
        System.out.print(num[count-1]);

    }
}
