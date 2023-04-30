import java.util.Arrays;

public class Ex5 {
    public void numbers() {
        int[] array = {1, 2, 3};
        int count = factorial(array.length);
        int max = array.length - 1;
        System.out.println("Возможно " + count + " вариантов:");
        int i = max;
        while (count > 0) {
            int x = array[i];
            array[i] = array[i - 1];
            array[i - 1] = x;
            System.out.println(Arrays.toString(array));
            count--;
            if (i < 2) {
                i = max;
            } else {
                i--;
            }
        }
    }

    static int factorial(int n) {
        //return (n > 0) ? n * fuctorial(n - 1) : 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
