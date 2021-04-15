import java.util.Scanner;


// Отобразить в окне консоли аргументы командной строки в обратном порядке.


public class MainTask2 {
    public static void main(String[] args) {
        Scanner enteredText = new Scanner(System.in);
        System.out.println("Enter something");
        String text = enteredText.nextLine();
        String textReverse = new StringBuffer(text).reverse().toString();
        System.out.println("You entered " + text + "! Reverse entered " + textReverse);

    }
}
