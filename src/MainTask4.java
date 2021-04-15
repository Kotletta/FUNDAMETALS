

// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.


import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Eneter something number");
        int number1 = enter.nextInt();
        int number2 = enter.nextInt();

        System.out.println("Сумма: " + (number1 + number2));
        System.out.println("Произведение: " + (number1 * number2));


    }


}
