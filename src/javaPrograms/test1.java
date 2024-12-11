package javaPrograms;

import java.util.Arrays;

public class test1 {

	// Remove duplicate character from string  without using array
	
	static void removeDuplicate(char str[], int length) {
		int index=0;
		
		for(int i=0;i<length;i++) {
			int j;
			for(j=0;j<=i;j++) {
				if(str[i]==str[j]) {
					break;
				}
			}
			if(j==i) {
				str[index++]=str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index))); 
	}

	public static void main(String[] args) {
		 String info = "9696657274"; 
		 char str[] = info.toCharArray();  
		 int len = str.length;   
		 removeDuplicate(str, len);   
	}
}
