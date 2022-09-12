package regular_expression;
import java.util.*;
import java.util.regex.*;
public class regex1_5 {
	 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
//		Pattern p=Pattern.compile("[^prq[0-9]]");
//		Matcher m=p.matcher(a);
//		if(m.find())
//		{
//			System.out.println(a.replaceAll("]]", ""));
//		}
//		else
//			System.out.println("invalid");
		String num=String.valueOf(a);
		//System.out.print(str);
		int len=num.length();
		System.out.print((num.substring(0, len-3)) + '#' + num.substring(len-3));
			 
		
		
		
	}

}
