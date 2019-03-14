//to give and execute multiple qurries............................ 
import java.sql.*;  
class FetchRecords{  
public static void main(String args[])throws Exception
{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
con.setAutoCommit(false);  
 Statement stmt=con.createStatement();  
stmt.addBatch("insert into employee values(101,'kiran',23,25000,'bihar')");  
stmt.addBatch("insert into employee values(102,'sunil',23,35000,'bihar')");  
  stmt.executeBatch();//executing the batch  
  con.commit();  
con.close();  
}}  