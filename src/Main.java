import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int arr [] = new int[10];
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt( 10);
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
