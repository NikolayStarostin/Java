package Homework_3.Task_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Integer price;
    private Integer grade;
}