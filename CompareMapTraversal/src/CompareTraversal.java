import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CompareTraversal {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        String key, value;
        int num = (int) Math.pow(10, 7);
        for (int i = 1; i <= num; i++) {
            key = "" + i * 5;
            value = "value";
            map.put(key, value);

        }
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        Map.Entry<String, String> entry;
        long start = System.currentTimeMillis();
        while (iter.hasNext()) {
            entry = iter.next();
            key = entry.getKey();
            value = entry.getValue();

        }
        long end = System.currentTimeMillis();
        System.out.println("Iterator: " + (end - start) + "ms");
        System.out.println("++++++++++++++++++++++++++");

        start = System.currentTimeMillis();
        for (Map.Entry<String, String> entry1: map.entrySet()) {
            key = entry1.getKey();
            value = entry1.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("for each1: " + (end - start) + "ms");
        System.out.println("++++++++++++++++++++++++++");

        start = System.currentTimeMillis();
        map.forEach((k,v) -> {});
        end = System.currentTimeMillis();
        System.out.println("for each2: " + (end - start) + "ms");
    }
}
