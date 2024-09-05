import java.sql.*;

public class StudentDB {

    static Connection connect;
    public static void insertData (Student st){
        try {
            connect = ConnectionDB.createC();

            String q = "insert into students(sname,sphone,scity) values(?,?,?)";

            PreparedStatement pstmt = connect.prepareStatement(q);

            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getGetStudentCity());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteData (int id){
        try {
            connect = ConnectionDB.createC();

            String q = "DELETE FROM students WHERE sid=?";

            PreparedStatement pstmt = connect.prepareStatement(q);
            pstmt.setString(1, String.valueOf(id));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void AllStudents() {
        try {
            connect = ConnectionDB.createC();
            String q = "SELECT * FROM students";
            Statement stmt = connect.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone: "+phone);
                System.out.println("City: "+city);
                System.out.println("++++++++++++++++++++++++++++++");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
