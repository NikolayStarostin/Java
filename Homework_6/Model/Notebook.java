package Homework_6.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Notebook {
    public String manufacturer = "Lenovo";
    public Integer ram = 4;
    public Integer volumeVD = 256;
    public String OS = "Windows";
    public String color = "black";

    public void sortManufacturer() {
    }

}