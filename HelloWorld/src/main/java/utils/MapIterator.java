package utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MapIterator {
    public static void main(String[] args) {
        java.util.Map<String, String> t = new HashMap<String,String>();
        t.put("0","a");
        t.put("1","b");
        t.put("2","c");
        System.out.println(t.size());
        for (String key: t.keySet()) {
            System.out.println(key);
        }
        for (java.util.Map.Entry entry: t.entrySet()) {
            System.out.println(entry.getKey() + ":" +  entry.getValue());
        }
        Iterator<String> keySetIterator = t.keySet().iterator();
        while(keySetIterator.hasNext()){
           System.out.println(keySetIterator.next());
        }
        Iterator<java.util.Map.Entry<String,String>> entryIterator= t.entrySet().iterator();
        while(entryIterator.hasNext()) {
            java.util.Map.Entry entryItem = entryIterator.next();
            System.out.println(entryItem.getKey() + ":" + entryItem.getValue());
        }
        System.out.println(t);
    }
}
