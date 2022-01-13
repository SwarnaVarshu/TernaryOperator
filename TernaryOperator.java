package operator;


import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 45;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark of a student :");
		
		a = sc.nextInt();
		
		String result = a>=45 ? "pass" : "fail" ;
		
		System.out.println("Student's result :"  +  result);
	}

}

