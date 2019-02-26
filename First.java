//class and object example
package mphasis.java;
import java.util.*;
public class First
{
	int empno;
	String name,address;
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter empno,name,address");
		empno=ob.nextInt();
		name=ob.next();
		address=ob.next();
	}
	void display()
	{
		System.out.println("the empno "+empno+"name is "+name+"address is "+address);
			}
public static void main(String[] args) 
{
	First obj=new First();
	obj.input();
	obj.display();	
}}
