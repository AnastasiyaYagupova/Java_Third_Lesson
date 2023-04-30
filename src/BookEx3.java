import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

/*
3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц,
фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class BookEx3 {
    public String nameBook;
    public String surname;
    public float cost;
    public int year;
    public int pages;

    public BookEx3(String nameBook, String surname, float cost, int year, int pages) {
        this.nameBook = nameBook;
        this.surname = surname;
        this.cost = cost;
        this.year = year;
        this.pages = pages;
    }

//    public int CheckPrimeNum(ArrayList<BookEx3> arrayList){
//        int count = 0;
//        for(BookEx3 pages : arrayList){
//            for (int i = 1; i <= pages.pages; i++) {
//                if(pages.pages % i == 0){
//                    count++;
//                }
//            }if(count == 2){
//                return page;
//            }
//        }return 0;
//    }
}

