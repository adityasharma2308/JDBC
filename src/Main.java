import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 to Add Student");
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to display Student");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(br.readLine());

            if(c==1){
                System.out.println("Enter Student Name: ");
                String name = br.readLine();
                System.out.println("Enter Student Phone: ");
                String phone =br.readLine();
                System.out.println("Enter Student City: ");
                String city = br.readLine();

                Student student = new Student(name,phone,city);
                StudentDB.insertData(student);
            } else if (c==2) {
                System.out.println("Enter Student id to delete: ");
                int a = Integer.parseInt(br.readLine());
                StudentDB.deleteData(a);
            }
            else if(c==3){
                StudentDB.AllStudents();
            } else if (c==4) {
                break;
            }
        }
    }
}