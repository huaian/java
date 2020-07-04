package utils;

import java.util.HashMap;
import java.util.stream.Stream;


class StreamUtil {
    private String name = "Jack";
    public static void main(String args[]) {
        HashMap<String,String> configMap = new HashMap<String,String>();
        HashMap<String,String> resultMap = new HashMap<String,String>();
        configMap.put("treeDepth", "12");
        configMap.put("commentDepth", "13");
        configMap.put("securityLink", "14");
        String[] keys = (new String[]{"treeDepth", "commentDepth"});
//        String[] keys = (new String[]{"commentDepth"});
//        String[] keys = (new String[]{"treeDepth", "securityLink"});

        Stream keysStream = Stream.of(keys);
        keysStream.filter((key) -> configMap.containsKey(key)).forEach( (key) -> {
            resultMap.put((String) key,configMap.get((String) key));
        });


        System.out.println(resultMap);
        PrivateChild privateChildInstance = new PrivateChild();
    }
}
