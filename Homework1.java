package JavaCourse;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        vichislenie();
    }

    public static void vichislenie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b1 = sc.nextInt();
        sc.close();
        System.out.println("Сумма чисел равна: " + (a1 + b1));
    }
}
