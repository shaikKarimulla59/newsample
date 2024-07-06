package allMyJavaPrograms;
import java.util.Scanner;
public class javaMainExecution {//CLASS

	public static void main(String[] args) {//MAIN
//allObjects Start
		Scanner  mainsc=new Scanner(System.in);
		allJavaQuestions questionref=new allJavaQuestions();
		businessLogic ref=new businessLogic();
//allObjects End
		
//All method calling starts
		
		questionref.javaQuestions();
		
		while(true) {
			System.out.println("Enter program number: ");
			int num =mainsc.nextInt();
			ref.switchmethod(num);
			System.out.println();
			
		}
		
		
//All method calling end

	}//MAIN

}//CLASS
