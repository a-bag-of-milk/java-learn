package learn.danya.chapter1;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        var i = 0;

        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 12: ");

        if(number.hasNextInt()) {
            i = number.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        switch(i) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                System.out.println("Сегодня " + MonthsEnum.values()[--i] + " месяц");

                break;
        }
    }
}
