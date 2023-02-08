import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> ints = new HashSet<>();        ints.add(1);
//        ints.add(10);
//        ints.add(4);
//        ints.add(53);
//        for(Integer integer: ints) {
//            System.out.println(integer);
//        }
//        Map<String,String> student = new HashMap<>();
//        student.put("412311241","Ivan");
//        student.put("355121231","Sasho");
//        student.put("555123123","Kiro");
//        student.put("723123124","Yoan");
//
//        for(String str: student.keySet())
//        {
//            System.out.println(str + " "+ student.get(str));
//        }

        Map<String, Map<Integer,String>> people = new TreeMap<>();
        people.put("12345", new HashMap<>());
        people.get("12345").put(1234,"Dimitar");
        people.put("123455", new HashMap<>());
        people.get("123455").put(123214,"Dimwwwwitar");
        people.put("12343124415", new HashMap<>());
        people.get("12343124415").put(1221112334,"Diwwwwqqqqqqqqqqmitar");
        for(String str: people.keySet())
        {
            Map<Integer, String> innerMap = people.get(str);
           for(Integer integer: innerMap.keySet())
           {
               System.out.println(str+" "+integer+" "+innerMap.get(integer));
           }
        }

        for(Map<Integer,String> values: people.values())
        {
            for(String innerValue: values.values())
            {
                System.out.println(innerValue);
            }
        }

        for(Map.Entry<String, Map<Integer, String>>entry : people.entrySet())
        {
            Map<Integer,String> innerMap = entry.getValue();
            for(Map.Entry<Integer,String> innerEntry: innerMap.entrySet())
            {
                System.out.println(entry.getKey()+" "+innerEntry.getKey()+" "+innerEntry.getValue());
            }
        }
    }
}
