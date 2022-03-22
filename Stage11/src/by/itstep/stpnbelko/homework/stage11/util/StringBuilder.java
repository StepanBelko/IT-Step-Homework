package by.itstep.stpnbelko.homework.stage11.util;

import java.util.List;

public class StringBuilder {
    public static String buildMessage(List<Integer> list ){
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        stringBuilder.append("Armstrong number : ");
        for (var element : list) {
            stringBuilder.append(element).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
