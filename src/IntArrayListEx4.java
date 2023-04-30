import java.util.ArrayList;

/*
4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class IntArrayListEx4 {
    public static double AverageCost(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return (double) sum / arrayList.size();

    }
}
