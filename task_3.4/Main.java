/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


public class Main {
    public static void main(String[] args) {
        System.out.println(comp(2, 6));
        }
        static boolean comp (int a, int b) {
        int sum = a+b;
        if (sum>10) {
            return true;
        }else{
            return false;
        }
    }
}

