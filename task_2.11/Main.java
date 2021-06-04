/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 6, 9, 7, 6, 4};
        int sum = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum > 10) {
                b = i;
                break;
            } else {
                sum += arr[i];
            }
        }
        System.out.println("Количество элементов с начала массива, сумма которых составляет больше 10: "+b);
    }
}
