package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "第一个");
        map.put(2, "第二个");
        map.put(3, "第三个");
        map.put(4, "第四个");
        System.out.println("第一种：遍历hashmap的key，然后根据key取value");
        for (Integer key : map.keySet()) {
            System.out.println("key是: " + key + "value是: " + map.get(key));
        }
        System.out.println("第二种：通过Iterator迭代器遍历循环Map.entrySet()");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> e = iterator.next();
            System.out.println("key是: " + e.getKey() + "value是: " + e.getValue());
        }
        System.out.println("第三种：直接遍历Entry");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("key是: " + e.getKey() + "value是: " + e.getValue());
        }

    }
}
