// Задание. Ввести n числе с консоли.
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask1_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some numbers");
        ArrayList numbersArray = new ArrayList();

        while (scan.hasNextInt() == true) {
            int number = scan.nextInt();
            numbersArray.add(number);
            System.out.println("You entered number: " + number + " Finish entering thw numbers by entering any character");
            if (scan.hasNextInt() == false){
                System.out.println("The input of the number is finished, the output of the numbers in ascending order of their length value");
                continue;
            }
        }
        Collections.sort(numbersArray);
        System.out.println("Sort in ascending order: " + numbersArray);
        Collections.sort(numbersArray, Collections.reverseOrder());
        System.out.println("Sort in descending order: " + numbersArray);
    }
}


