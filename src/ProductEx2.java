import java.util.ArrayList;

/*
2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class ProductEx2 {
    public String name;
    public String country;
    public float weight;
    public float cost;
    public int sort;

    public ProductEx2(String name, String country, float weight, float cost, int sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.cost = cost;
        this.sort = sort;
    }

    public float AverageCost(ArrayList<ProductEx2> arrayList) {
        float sum = 0;
        int count = 0;
        for (ProductEx2 product : arrayList) {
            if (product.sort == 1) {
                sum = sum + product.cost;
                count++;
            }
        }
        float result = sum / count;
        return result;

    }

}

