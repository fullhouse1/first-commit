package SG5;

import java.util.Scanner;

public class No5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.nextLine();
        int number[] = new int[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int time = 0;

        for (int i = 0; i < alphabet.length(); i++) {
            time += number[alphabet.charAt(i) - 'A'];
        }
        System.out.print(time);
    }
}