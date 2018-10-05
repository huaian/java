package utils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {
	public static void main(String args[]){
	  String commentString = "评论数(55)条";
	  Pattern regexp = Pattern.compile("(\\d+)");
	  Matcher matcher = regexp.matcher(commentString);
	  if (matcher.find()) {
		  System.out.println(matcher.group(0));
	  }

      // 按指定模式在字符串查找
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(\\D*)(\\d+)(.*)";
 
      // 创建 Pattern 对象	  System.out.println(matcher.matches());

      Pattern r = Pattern.compile(pattern);
 
      // 现在创建 matcher 对象
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) ); 
      } else {
         System.out.println("NO MATCH");
      }
	}
}
