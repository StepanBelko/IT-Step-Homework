package by.itstep.stpnbelko.homework.stage13.control;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask05Logic.countMarkPercent;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask05Logic.markTableObj;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class MainTask05 {
    /*
    Необходимо написать программу, которая обрабатывает результаты экзамена.
    Для экзамена используется пятибалльная система оценивания знаний.
    Для каждой оценки программа должна вычислить процент от общего количества оценок.
    Далее приведен рекомендуемый вид экрана программы
    (данные, введенные пользователем, выделены полужирным):

    Exam Result Handling
    Marks: 5 4 4 5 3 4 3 4 5 3 4 4 3 4 4 3 5 3 3 4 5 5 5 5 4 5 5 5 2 5
    Exam Result:
    fives – 40% (12)
    fours – 33.3% (10)
    triplets – 23.3% (7)
    deuces – 3.4% (1)
    units – 0% (0)
    zeros – 0% (0)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
//        Здесь для разнообразия используем ввод оценок через пробел.
//        По-хорошему тогда надо сделать защиту от ввода букв
//        и обработать возможные NumberFormatException,
//        но мы ведь надеемся на адекватных пользователей)))
        print("Enter exam results separated by spaces");
        String stringArray = "5 4 4 5 3 4 3 4 5 3 4 4 3 4 4 3 5 3 3 4 5 5 5 5 4 5 5 5 2 5";
        int[] array = Arrays.stream(stringArray.split(" ")).mapToInt(Integer::parseInt).toArray();
//        print(Arrays.toString(array));
//        createMarkTable(array);
        countMarkPercent(array);
        for (var element : markTableObj) {
            stringBuilder.append(element.toString());
        }
        print("Exam Result Handling\n" + "Marks:\n" + Arrays.toString(array) + "\n" + stringBuilder);

    }
}
