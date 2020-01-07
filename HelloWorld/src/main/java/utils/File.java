package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(Paths.get("/opt/workspace/HelloWorld/src/main/java/utils/Junit.java"));
		PrintWriter out = new PrintWriter("./temp.txt");
		while(scan.hasNext()){
			String line = scan.next();
			System.out.println(line);
			out.println(line);
		}
		scan.close();
		out.flush();
		out.close();
	}

}
