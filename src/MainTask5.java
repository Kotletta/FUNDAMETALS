import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int number = n.nextInt();

        if (number == 1){
            System.out.println("Январь");
        }
        else if (number == 2 ){
            System.out.println("Февраль");
        }
        else if (number == 3 ){
            System.out.println("Март");
        }
        else if (number == 4 ){
            System.out.println("Апрель");
        }
        else if (number == 5 ){
            System.out.println("Май");
        }
        else if (number == 6 ){
            System.out.println("Июнь");
        }
        else if (number == 7 ){
            System.out.println("Июль");
        }
        else if (number == 8 ){
            System.out.println("Август");
        }
        else if (number == 9 ){
            System.out.println("Сентябрь");
        }
        else if (number == 10 ){
            System.out.println("Октябрь");
        }
        else if (number == 11 ){
            System.out.println("Ноябрь");
        }
        else if (number == 12 ){
            System.out.println("Декабрь");
        }
        else {
            System.out.println("Введено не верное число");
        }


    }
}
