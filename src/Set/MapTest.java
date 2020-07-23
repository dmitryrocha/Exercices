package Set;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("moza", "moça");

        for (String key : map.keySet()) {
            System.out.println(key);

        }
    }
}
