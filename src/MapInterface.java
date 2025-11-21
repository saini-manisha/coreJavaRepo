import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args){
        Map<Integer,String> rollNumberVsNameMap=new HashMap<>();
        rollNumberVsNameMap.put(null,"TESt");
        rollNumberVsNameMap.put(0,null);
        rollNumberVsNameMap.put(1,"a");
        rollNumberVsNameMap.put(2,"b");

        //compute if present
        rollNumberVsNameMap.putIfAbsent(null,"Sdf");
        rollNumberVsNameMap.putIfAbsent(0,"zero");
        rollNumberVsNameMap.putIfAbsent(3,"c");
        rollNumberVsNameMap.putIfAbsent(2,"z");

        for(Map.Entry<Integer,String> entryMap:rollNumberVsNameMap.entrySet()){
            Integer key=entryMap.getKey();
            String value =entryMap.getValue();
            System.out.println("Key "+key+" valye "+value);

        }

        // isEmpty
        System.out.println("isEmpty(): "+rollNumberVsNameMap.isEmpty());

        // size

        System.out.println("size "+ rollNumberVsNameMap.size());

        // containsKey

        System.out.println("containsKey "+rollNumberVsNameMap.containsKey(3));

        // get(key)

        System.out.println("get(i) "+rollNumberVsNameMap.get(1));;

        // getOrDefault(key)

        System.out.println("get(9) "+ rollNumberVsNameMap.getOrDefault(9,"default"));




    }
}
