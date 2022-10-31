package project_utils;

public class OddEven {

//    В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
//    возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
//
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”

    public static String oddEven(long num) {

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {

            return "unknown";
        }
        if (num % 2 == 0) {

            return "Even";
        } else {

            return "Odd";
        }
    }


}
