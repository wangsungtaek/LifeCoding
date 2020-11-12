package chapter2;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
		System.out.println(twoTimes("a", "*"));
		FileWriter tw = new FileWriter("out.txt");
		tw.write(twoTimes("b", "-"));
		tw.close();
	
	}

	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}

}
