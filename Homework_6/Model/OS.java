package Homework_6.Model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OS extends Notebook {
    public void sortOperative(List<Notebook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getOS().compareTo(o2.getOS());
            }
        });
    }
}