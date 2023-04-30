import java.util.Arrays;

public class Ex5 {
    public void numbers() {
        int[] array = {1, 2, 3};
        int count = Main.fuctorial(array.length);
        int max = array.length - 1;
        System.out.println("Возможно " + count + " вариантов:");
        int i = max;
        while (count > 0) {
            int x = array[i];
            array[i] = array[i - 1];
            array[i - 1] = x;
            Main.print(array);
            count--;
            if (i < 2) {
                i = max;
            } else {
                i--;
            }
        }
    }
}
