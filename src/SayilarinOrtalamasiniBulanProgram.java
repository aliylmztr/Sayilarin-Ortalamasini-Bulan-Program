import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, total = 0, number = 0, average;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                number++;
                total += i;
            }
        }
        average = total / number;
        System.out.print("Sayıların Ortalaması : " + average);
    }
}
