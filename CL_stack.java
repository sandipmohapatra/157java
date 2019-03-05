package mphasis.java;
 import java.util.*;
class CL_stack
{
   public static void main(String args[]) 
{   Stack ss=new Stack();
    ss.push(10);    ss.push(20);    ss.push(30);    ss.push(40);    ss.push(50);    ss.push(60);    ss.push(70);
    ss.push(10);
System.out.println(ss);
System.out.println(ss.pop());//remove item from stack
System.out.println(ss);
System.out.println(ss.peek());//detect last item in stack but dont delete
System.out.println(ss);
System.out.println(ss.search(20));//display the index start from 1
System.out.println(ss.search(200));//display -1 if not there     
}}