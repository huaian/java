package utils;

import java.util.HashMap;
import java.util.stream.Stream;


class StreamUtil {
    public static void main(String args[]) {
        HashMap<String,String> configMap = new HashMap<String,String>();
        configMap.put("config1", "12");
        configMap.put("config2", "13");
        configMap.put("config3", "14");
        String[] keys = (new String[]{"config1", "config3"});
//        String[] keys = (new String[]{"commentDepth"});
//        String[] keys = (new String[]{"treeDepth", "securityLink"});
        Stream keysStream = Stream.of(keys);
        HashMap<String,String> resultMap = new HashMap<String,String>();
        keysStream.filter((key) -> configMap.containsKey(key)).forEach( (key) -> {
            resultMap.put((String) key,configMap.get((String) key));
        });
        System.out.println(resultMap);
    }
}
