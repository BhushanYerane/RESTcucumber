package javaPrograms;

public class revString {

	public static void main(String[] args) {
		String str1 = "Capgemini Pune", str2="";
		char ch;
		
		System.out.println(str1);
		
		for(int i=0;i<str1.length();i++)
		{
			ch = str1.charAt(i);
			str2 = ch + str2;
			//str2 = str2+ch ;
		}
		System.out.println(str2);
		
		System.out.println("//------------");
		
		StringBuilder input1 = new StringBuilder();
		input1.append(str1);
		
		input1.reverse();
		System.out.println(str2);
		
		System.out.println("//------------");
		
		char[] str3 = str1.toCharArray();
		 for (int i = str3.length - 1; i >= 0; i--)
	        
			 System.out.print(str3[i]);
		 
					
		System.out.println("//------------");
		
		char[] temparray = str1.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
 
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
 
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
	}
}
