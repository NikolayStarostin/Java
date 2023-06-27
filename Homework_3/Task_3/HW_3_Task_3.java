package Homework_3.Task_3;

import Homework_3.Task_3.model.Book;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param Массив записей с наименованиями книг.
 * @return Названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 * @apiNote Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

public class HW_3_Task_3 {
    public static void main(String[] args) {
        Book book1 = new Book("Гордость и предубеждение", "Остен", 220, 1813, 416);
        Book book2 = new Book("Азазель", "Аркади", 399, 2013, 230);
        Book book3 = new Book("Руслан и Людмила", "Пушкин", 712, 1820, 192);
        Book book4 = new Book("Лисьи бороды", "Старобинец", 1097, 2022, 720);

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);

        BigInteger bigInteger;
        for (Book book : listBook) {
            bigInteger = BigInteger.valueOf(book.getNumberPages());
            if (bigInteger.isProbablePrime((int) Math.log(book.getNumberPages())) && book.getLastname().contains("а")
                    && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }

}