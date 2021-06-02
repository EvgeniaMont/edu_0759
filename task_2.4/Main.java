/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите сумму вклада:");
        int a = scan.nextInt();
        System.out.println("Введите начисляемый процент:");
        int b = scan.nextInt();
        int sum=a;
        for(int i=0; i<5; i++) {
            sum += sum*b/100;
            System.out.println ("Размер вклада на "+(i+1)+" год: "+sum);
            }

    }
}
