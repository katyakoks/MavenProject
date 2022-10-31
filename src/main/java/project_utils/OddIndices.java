package project_utils;

public class OddIndices {

    //    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    public static int[] oddIndices(int[] array) {

        int[] newArray = new int[array.length / 2];

        int index = 0;
        for (int i = 1; i < array.length; i += 2) {
            newArray[index] = array[i];
            index++;
        }

        return newArray;
    }


}
