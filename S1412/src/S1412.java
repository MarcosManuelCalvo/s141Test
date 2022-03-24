
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class S1412 {
	
	public static void main(String[] args) {

			ArrayList<String> test = new ArrayList<String>();
			test.add("47773713E");
			test.add("47773714T");
			test.add("56754569E");
			test.add("15252425K");
			test.add("23143862C");
			test.add("49552078G");
			test.add("74078362P");
			test.add("56054772T");
			test.add("81269997A");
			test.add("81269997A");
		if(CalculoDni.test(test)) {
			System.out.println(CalculoDni.letraDni(47773713));
		}
		
		
		
	}
}	
		