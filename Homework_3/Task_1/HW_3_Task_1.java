package Homework_3.Task_1;

import Homework_3.Task_1.model.Items;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @param массив записей с наименованием товара, ценой и сортом.
 * @return наибольшая цена товаров высшего сорта.
 * @apiNote Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
 */

public class HW_3_Task_1 {

    public static void main(String[] args) {
        Items items1 = new Items("Сосиски высшего сорта", 123, 1);
        Items items2 = new Items("Рыба обычного сорта", 123, 3);
        Items items3 = new Items("Вермишель высшего сорта", 112, 2);
        Items items4 = new Items("Крупа низшего сорта", 321, 4);

        List<Items> listItems = new ArrayList<>();
        listItems.add(items1);
        listItems.add(items2);
        listItems.add(items3);
        listItems.add(items4);

        int max = 0;
        for (int i = 0; i < listItems.size(); i++) {
            if (listItems.get(i).getName().contains("высшего")) {
                if (listItems.get(i).getPrice() > max) {
                    max = listItems.get(i).getPrice();
                }
            }
        }
        System.out.println(max);
    }
}