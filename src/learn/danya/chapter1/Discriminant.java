package learn.danya.chapter1;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        double a, b, c;
        double D;

        System.out.println("Введите a, b и c: ");

        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = Math.pow(b, 2) - 4 * a * c;

        if(D > 0) {
            double x1, x2;

            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println("Корни уравнения: x1 = " + x1);
            System.out.println("Корни уравнения: x2 = " + x2);
        } else if (D == 0) {
            double x;

            x = -b / (2 * a);

            System.out.println("Только один корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
