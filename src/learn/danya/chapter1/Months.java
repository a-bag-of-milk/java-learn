package learn.danya.chapter1;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        var i = 0;

        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 12: ");

        if(number.hasNext()) {
            i = number.nextInt();
        } else {
            System.out.println("Вы ввели НЕ целое число, попробуйте еще раз!");
        } switch (i) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Сегодня " + MonthsEnum.values()[--i] + " месяц!");
                break;
            default:
                System.out.println("Что-то пошло не так..");
                break;
        }
    }
}
