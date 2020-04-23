package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDelete {
    public static void main(String[] args) {
        List<String> famous = new ArrayList<String>();
        famous.add("liudehua");
        famous.add("madehua");
        famous.add("liushishi");
        famous.add("tangwei");
        Iterator<String> iterator = famous.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("liudehua")) {
                iterator.remove();
                //famous.remove(iterator.next());
            }
        }
        System.out.println(famous.size());
    }
}
