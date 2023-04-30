/*
1. Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class ProductEx1 {
    public String name;
    public int cost;
    public int sort;

    public ProductEx1(String name, int cost, int sort) {
        this.name = name;
        this.cost = cost;
        this.sort = sort;

    }
}
