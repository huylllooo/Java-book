package Chapter3;
import java.util.Scanner; //program uses Scanner

public class GradeBookTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println("Please enter the course name: ");
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println();
		
		myGradeBook.setCourseName(nameOfCourse);
		myGradeBook.displayMessage();
		
	}

}
