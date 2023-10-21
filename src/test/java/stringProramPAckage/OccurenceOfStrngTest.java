package stringProramPAckage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OccurenceOfStrngTest {
//@Test
public void stringpalindrome()
{	
String rev="";
			
	String str="olo";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
Assert.assertEquals(str, rev);
System.out.println("palindrome ");
	


}


@Test
public void occurence()
{

	String str="hello world";
	for(int i=0;i<str.length();i++)
	{	int c=0;
		char ch1=str.charAt(i);
		for(int j=0;j<str.length();j++)
		{
	

			char ch2=str.charAt(j);
			if(ch1==ch2&& i>j)
			{
				break;
			}
			if(ch1==ch2)
			{
				c++;
			}
				
		}
		if(c>1)
		System.out.println("occurence of "+ch1+"is :"+c);

	}
}

@Test
public void countwords()
{
	String str="this is soundarya";
int c=0;
String []s=str.split(" ");
for(int i=0;i<s.length;i++)
{
	c++;
	
}

System.out.println("No of words "+c);


}



}
