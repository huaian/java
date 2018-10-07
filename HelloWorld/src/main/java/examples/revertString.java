package examples;

public class revertString {
    public static void main (String args[]) {
        String sourceString = "hello world";
        String targetString = "";
//        for(String i: sourceString.split("")) {
//            System.out.println(i);
//            targetString += i;
//        }
        for (int i = sourceString.length() - 1; i >= 0;i--) {
            targetString += sourceString.charAt(i);
        }
        System.out.println(targetString);
    }
}
