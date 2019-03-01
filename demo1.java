class demo1
{	public static void main(String args[])
	{
	String s1="Mphasis and Global soft";
	System.out.println(s1);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.substring(5));
	System.out.println(s1.substring(5,10));
	System.out.println(s1.startsWith("Mp"));
	System.out.println(s1.endsWith("ft"));
	System.out.println(s1.replace("soft","software"));
	String ss="Mphasis and Global soft,mumbai";
	System.out.println(ss);
                  System.out.println("the length of string="+ss.length());
	System.out.println(ss.replace("mumbai","Bangalore"));
	char name[]=s1.toCharArray();//concert string to char array
	int leng=name.length;
	System.out.println("length of an array="+leng);
                  for(int i=0;i<leng;i++)
	{
		System.out.println(name[i]);
	}}}
