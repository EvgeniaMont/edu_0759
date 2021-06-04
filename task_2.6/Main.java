/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int a = scan.nextInt();
        System.out.print("Введите делитель: ");
        int b = scan.nextInt();
        int mod = a%b;
        if (mod ==0) {
            System.out.print("Делится");
        } else {
            System.out.println("Делится с остатком");
            System.out.print("Остаток от деления: "+mod);
        }
    }
}
