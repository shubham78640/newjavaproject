package firstproject;
import com.firstproject.StudentDao;
import com.firstproject.students;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("hii");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

while(true) {
	
 System.out.println("press 1 to add");
 int c=Integer.parseInt(br.readLine());
 
 
 if(c==1) {
	 System.out.println("Enter user name: ");
	 String name= br.readLine();
	  
	 System.out.println("Enter user Phone: ");
	 String phone = br.readLine();
	 
	 
	 students st = new students (name, phone);
	boolean answer = StudentDao.insertStudentToDB(st);
	
	if(answer) {
		System.out.println("Student is added");
	}
	 System.out.println("1 row is added :" +st );
 }
 else {
	 
 }
}

	}

}
