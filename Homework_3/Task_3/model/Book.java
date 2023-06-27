package Homework_3.Task_3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Book {
    private String name;
    private String lastname;
    private Integer price;
    private Integer year;
    private Integer numberPages;
}