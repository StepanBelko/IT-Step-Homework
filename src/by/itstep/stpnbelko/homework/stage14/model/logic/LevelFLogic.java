package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelFLogic {
    private static int findFirstZeroElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastZeroElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -2;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void sortBeforeFirstZero(int[] array) throws ExceptionArrayIsNull {
//    Первый способ обработать некорректные данные
//    пробрасываем в main собственное исключение
        if (array == null) {
            throw new ExceptionArrayIsNull("Array can't be null");
        }
        int index = findFirstZeroElementIndex(array);
        sortBeforeIndex(array, index);
    }

    public static boolean sortBeforeLastZero(int[] array) {
//        Или второй способ
//        Я так понимаю в данном случае он предпочтительнее
//        Если массив null - возвращаем false
        if (array == null) {
            return false;
        }
        int index = findLastZeroElementIndex(array);
        sortBeforeIndex(array, index);
        return true;
    }

    private static void sortBeforeIndex(int[] array, int index) {
        if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j);
                    }
                }
            }

        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
