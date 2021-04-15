import java.util.Scanner;


// Задание. Ввести n чисел с консоли.
// 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class OptionalTask1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String line = scan.nextLine();
        String longWord = " ", shortWord = line;
        for (String s : line.split(" ")){
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Самое длинное слово: " + longWord + ",");
        System.out.println(longWord.length());
        System.out.println(shortWord);
        System.out.println(shortWord.length());
    }
}
