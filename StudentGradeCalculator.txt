package student;

import java.util.Scanner;

public class StudentGradeCalc {
	Scanner sc=new Scanner(System.in);
	int s1,s2,s3,s4,s5,s6;
	String grade="";
	
	public void gradeCalculation() {
		System.out.println("Enter marks in Hindi subject:");
		s1=sc.nextInt();
		System.out.println("Enter marks in English subject:");
		s2=sc.nextInt();
		System.out.println("Enter marks in Maths subject:");
		s3=sc.nextInt();
		System.out.println("Enter marks in Science subject:");
		s4=sc.nextInt();
		System.out.println("Enter marks in Social Science subject:");
		s5=sc.nextInt();
		System.out.println("Enter marks in Chemistry subject:");
		s6=sc.nextInt();
		
		if(s1>100||s1<0||s2>100||s2<0||s3>100||s3<0||s4>100||s4<0||s5>100||s5<0||s6>100||s6<0) {
			System.out.println("Please enter valid numbers:");		
		}
		else {
			int sum=s1+s2+s3+s4+s5+s6;
			float avg=sum/6;
			
			if(avg>90||avg<100){
				grade="A+";
			}
			else if(avg>=80||avg<90) {
				grade="A";
			}
			else if(avg>=70||avg<80) {
				grade="B";
			}
			else if(avg>=60||avg<70) {
				grade="C";
			}
			else if(avg>=33||avg<60) {
				grade="D";
			}
			else if(avg>=0||avg<33) {
				grade="F";
			}
			
			System.out.println("Total Marks:"+sum+"/600");
			System.out.println("Percentage:"+avg+"%");
			System.out.println("Grade:"+grade);
		}
	}

	public static void main(String[] args) {
		StudentGradeCalc s=new StudentGradeCalc();
		s.gradeCalculation();
	}
}
