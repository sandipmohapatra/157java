/*create or replace procedure add12(i in number,j in number,k out number) is 
begin
k:=i+j;
end;*/

import java.sql.*;
class a
{
public static void main(String h[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
CallableStatement ps=con.prepareCall("call add12(?,?,?)");
ps.setInt(1,10);
ps.setInt(2,20);
ps.registerOutParameter(3,Types.INTEGER);
ps.execute();
int n=ps.getInt(3);
System.out.println(n);
}}

