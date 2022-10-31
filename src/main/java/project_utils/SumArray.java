package project_utils;

public class SumArray {

    //    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    public static int sumArray(int[] array) {

        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum;
    }

}
