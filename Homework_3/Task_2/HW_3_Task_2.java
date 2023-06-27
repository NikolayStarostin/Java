package Homework_3.Task_2;

import Homework_3.Task_2.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @param Массив записей с наименованием товара и его характеристиками.
 * @return тТовары заданного сорта с наименьшей ценой.
 * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class HW_3_Task_2 {
    public static void main(String[] args) {

        Item item1 = new Item("Мясо", "Russia", 12, 323, 1);
        Item item2 = new Item("Какао", "Belarus", 12, 346, 2);
        Item item3 = new Item("Хлеб", "Ukraine", 12, 32, 1);
        Item item4 = new Item("Мука", "Russia", 12, 214, 3);

        List<Item> listItem = new ArrayList<>();
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        listItem.add(item4);

        Scanner sc = new Scanner(System.in);
        String minPriceName = "";
        int min = Integer.MAX_VALUE;
        int variety = sc.nextInt();
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getVarieties() == variety) {
                if (listItem.get(i).getPrice() < min) {
                    min = listItem.get(i).getPrice();
                    minPriceName = listItem.get(i).getName();
                }
            }
        }
        sc.close();
        System.out.println(minPriceName);
    }

}