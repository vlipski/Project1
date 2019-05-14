package Task14_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUnique {

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!set.add(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String,String> name = new HashMap<>();
        name.put("Marty","Stepp");
        name.put("Stuart","Reges");
        name.put("Jessica","Miller");
        name.put("Amanda","Rege");
        name.put("Hal","Perkins");
        System.out.println(isUnique(name));
    }
}
