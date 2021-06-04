/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 9, 5};
        String b = "Да";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5){
                b = "Да";
                break;
            } else {
                b = "Нет";
            }
        }
        System.out.println(b);
    }
}
