package MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<Character, String> hm = new HashMap<Character, String>();
        hm.put('S', "Sunday");
        hm.put('M', "Monday");
        hm.put('T', "Tuesday");
        hm.put('W', "Wednesday");
        hm.put('T', "Thruday");
        hm.put('F', "Friday");
        hm.put('S', "Saturday");

        for(Map.Entry<Character, String> mp: hm.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
