/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 9, 5, 8, 9, 7, 6, 4};
        String b = "Да";
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]){
                b = "Да";
                break;
            } else {
                b = "Нет";
            }
        }
        System.out.println(b);
    }
}
