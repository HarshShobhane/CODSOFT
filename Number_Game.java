package number_game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	
	int random_num;
	int get_num,attempt=5;
	
	void getNumber() {
		random_num=r.nextInt(100)+1;
		
		System.out.println("A random number between 1 and 100 has been generated!Enter a number to guess");
		
		
		while(attempt>0&&random_num!=get_num){
			System.out.println("Enter a number between 1 and 100:");
			get_num=sc.nextInt();
			
			if(get_num>100||get_num<1){
				System.out.println("Please enter a valid number!");
				continue;
			}
			
			attempt--;
			
			if(random_num==get_num) {
				System.out.println("You guessed right,the number was:"+get_num);
				System.out.println("Total attempts taken:"+(5-attempt));
				break;
			}
			else {
				if(random_num>get_num) {
					System.out.println("You guessed too low,please try again");
				}
				else {
					System.out.println("You guessed too high,please try again");
				}
				System.out.println("Attempts left:"+attempt);
			}
		}
		
		if(random_num!=get_num) {
			System.out.println("You are out of attempts!The number was:"+random_num);
		}
		
		int choice;
		System.out.println("Do you want to pllay again?\nPRESS 1 FOR YES\n PRESS 2 FOR NO");
		choice=sc.nextInt();
		
		if(choice==1) {
			attempt=5;//reset attempts
			getNumber();
		}
		else if(choice==2) {
			System.out.println("Thank You for playing");
			sc.close();
		}
		else {
			System.out.println("Invalid choice!Exiting the game."); 
			sc.close();
		}
	}//getNumber()

	public static void main(String[] args) {
		NumberGame n=new NumberGame();
		n.getNumber();
	}
}