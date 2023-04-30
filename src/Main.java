
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // #1
        ArrayList<ProductEx1> arrayProduct = getMaxCost();
        int maxCost = 0;

        for (ProductEx1 productEx1 : arrayProduct) {
            if (productEx1.name.endsWith("Высший") && productEx1.sort == 1 || productEx1.sort == 2) {
                if (maxCost < productEx1.cost) {
                    maxCost = productEx1.cost;
                }
            }
        }
        System.out.println(maxCost);

        // #2
        ArrayList<ProductEx2> allProducts = getProducts();
        System.out.println("Товары 1ого сорта с нименьшей ценой:");
        for (ProductEx2 productEx2 : allProducts) {
            if (productEx2.sort == 1 && productEx2.cost < productEx2.AverageCost(allProducts)) {
                System.out.println(productEx2.name + " " + productEx2.cost);
            }
        }
        // #3
        ArrayList<BookEx3> books = getBooks();
        for (BookEx3 nameBook : books) {
            if (nameBook.pages % 2 == 1 && nameBook.pages % 7 != 0 && nameBook.pages % 3 != 0 && nameBook.pages % 5 != 0
                    && nameBook.surname.matches("(.*)А(.*)") && nameBook.year >= 2010) {
                System.out.println(nameBook.nameBook);
            }
        }
        // #4
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {7, 55, 84, 12, 29, 36, 11};
        for (int i : array)
            list.add(i);
        System.out.println("Максимальный элемент: " + Collections.max(list));
        System.out.println("Минимальный элемент: " + Collections.min(list));
        System.out.println("Среднее арифметическое: " + IntArrayListEx4.AverageCost(list));

        // 5
        Ex5 Ex5 = new Ex5();
        Ex5.numbers();
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }


    public static ArrayList<ProductEx1> getMaxCost() {
        ArrayList<ProductEx1> arrayProductEx1 = new ArrayList<ProductEx1>();
        arrayProductEx1.add(new ProductEx1("Ламинат Высший", 1200, 1));
        arrayProductEx1.add(new ProductEx1("Обои", 1000, 3));
        arrayProductEx1.add(new ProductEx1("Плитка", 900, 3));
        arrayProductEx1.add(new ProductEx1("Стол Высший", 5000, 1));
        arrayProductEx1.add(new ProductEx1("Окно", 4500, 3));
        arrayProductEx1.add(new ProductEx1("Кафель Высший", 3500, 2));
        arrayProductEx1.add(new ProductEx1("Тумба", 2000, 1));
        return arrayProductEx1;
    }

    public static ArrayList<ProductEx2> getProducts() {
        ArrayList<ProductEx2> arrayProductEx2 = new ArrayList<ProductEx2>();
        arrayProductEx2.add(new ProductEx2("Стол", "Италия", 20, 25000, 1));
        arrayProductEx2.add(new ProductEx2("Стул", "Италия", 5, 5000, 1));
        arrayProductEx2.add(new ProductEx2("Тумба", "Италия", 7, 8500, 1));
        arrayProductEx2.add(new ProductEx2("Комод", "Германия", 20, 19000, 2));
        arrayProductEx2.add(new ProductEx2("Кровать", "Россия", 80, 50000, 1));
        arrayProductEx2.add(new ProductEx2("Полка", "Италия", 10, 10000, 1));
        arrayProductEx2.add(new ProductEx2("Шкаф", "Франция", 40, 30000, 2));
        return arrayProductEx2;
    }

    public static ArrayList<BookEx3> getBooks() {
        ArrayList<BookEx3> arrayBookEx3 = new ArrayList<>();
        arrayBookEx3.add(new BookEx3("Война и мир", "Толстой", 450, 1873, 1300));
        arrayBookEx3.add(new BookEx3("Шардик", "Адамс", 800, 2016, 479));
        arrayBookEx3.add(new BookEx3("Город Женщин", "Гилберт", 364, 2020, 464));
        arrayBookEx3.add(new BookEx3("Тайна русского путешественника", "Алейникова", 169, 2020, 443));
        arrayBookEx3.add(new BookEx3("Сборник стихов", "Асадов", 450, 1983, 809));
        return arrayBookEx3;
    }
}