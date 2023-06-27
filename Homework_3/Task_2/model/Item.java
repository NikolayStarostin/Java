package Homework_3.Task_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Item {
    private String name;
    private String country;
    private int weight;
    private int price;
    private int varieties;
}