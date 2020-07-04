package utils;

import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Private {
    private String name = "Jack";
}

class PrivateChild extends Private {
    private String name = "Jack";
    public static void main(String args[]) {
        HashMap<String,String> configMap = new HashMap<String,String>();
        HashMap<String,String> resultMap = new HashMap<String,String>();
        configMap.put("treeDepth", "12");
        configMap.put("commentDepth", "13");
        configMap.put("securityLink", "14");
//        String[] keys = (new String[]{"treeDepth", "commentDepth"});
//        String[] keys = (new String[]{"commentDepth"});
        String[] keys = (new String[]{"treeDepth", "securityLink"});
        for(String key: keys) {
            if(configMap.containsKey(key)) {
                resultMap.put(key, configMap.get(key));
            }
        }
        System.out.println(resultMap);
        PrivateChild privateChildInstance = new PrivateChild();
        System.out.println(privateChildInstance.name);
    }
}
