package javaPrograms;

import java.util.Arrays;

public class typeCasts {

	public static void main(String[] args) {
		
		// char to String
		char ch1[] = {'N','E','T','W','O','R','K','1','8'};
		
		String st = String.valueOf(ch1);
		String st1 = new String(ch1);
		
		System.out.println(st);
		System.out.println(st1);
		
		System.out.println("//--------------------");
		
		//String to char
		String str1 = "This is Network18";
		char ch2[] = str1.toCharArray();
		
		System.out.println(Arrays.toString(ch2));
		
		System.out.println("//--------------------");
		
		//double to string using different
		double dnum1 = 998.876;
		String str2 = String.valueOf(dnum1);
		System.out.println("My String2 is: "+str2);
		
		double dnum2 = -1289.87;
		String str3 = Double.toString(dnum2);
		System.out.println("My String3 is: "+str3);
		
		double dnum3 = 99.98;
		String str4 = String.format("%f", dnum3);
		System.out.println("My String4 is: "+str4);
		
		// StringBuffer and StringBuilder
		double dnum4 = 89.891;
		double dnum5 = -66.89;
		
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		
		sb1.append(dnum4);
		sb2.append(dnum5);
		
		String str5 = sb1.toString();
		String str6 = sb2.toString();
		
		System.out.println("My String5 is: "+str5);
		System.out.println("My String6 is: "+str6);
		
		System.out.println("//--------------------");
		
		// String to double
		String st2 = "2033.12244";
		double s1 = Double.parseDouble(st2);
		
		double s2 = Double.valueOf(st2);
		
		System.out.println(s1 +"\t" +s2);
		
		System.out.println("//--------------------");
		
		String st3 = "Network18";
		//int num = Integer.parseInt(st3);
		//System.out.println(num);
		
		
	}
}
