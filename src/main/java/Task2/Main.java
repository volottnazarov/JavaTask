package Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int result = resultPrMinusSum(n);
        System.out.println("Результат:");
        System.out.println("pr - sum = " + result);
        System.out.printf("pr - sum = %s", result);  // можно так , аналог Phyton print(f'...{res}
    }

    public static int resultPrMinusSum(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return pr - sum;
    }

}