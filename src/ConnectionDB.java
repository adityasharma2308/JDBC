import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionDB {
   static Connection connect;
     public static Connection createC(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String user = "root";
             String pass = "@Myedu.com68";
             String url = "jdbc:mysql://localhost:3306/Students";

             connect = DriverManager.getConnection(url,user,pass);
         }
         catch (Exception e){
             e.printStackTrace();
         }
         return connect;
     }
}
