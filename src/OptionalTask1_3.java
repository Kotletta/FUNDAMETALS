// Задание. Ввести n числе с консоли.
// 3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

import java.util.Scanner;

public class OptionalTask1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        double average = 0;
        String[] arr = line.split(" ");
        for (String s : arr) {
            average += s.length();
        }
        if (arr.length > 0) average /= arr.length;
        System.out.printf("Average length of the entered numbers: %.2f", average);
        System.out.println("\nNumbers with a length greater than the average: ");
        for (String s : arr) {
            if (s.length() > average) System.out.println(s + " Length: " + s.length());
        }
        System.out.println("Numbers with s length less than the average");
        for (String s : arr) {
            if (s.length() < average) System.out.println(s + " Length: " + s.length());
        }
    }
}
