package mphasis.java;
import java.util.*;
class CArraylist
{
   public static void main(String args[]) 
{
     ArrayList al=new ArrayList();
     al.add(10);     al.add(50);     al.add(60);     al.add(100);      al.add(90);      al.add(80);
System.out.println(al);
al.add(3,500);                 //100 will move next position
System.out.println(al);
al.remove(2);                //remove 60
System.out.println(al);
al.set(4,1000);              //replace 90 with 1000
System.out.println(al);
}}