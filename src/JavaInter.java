import java.util.Scanner;


public class JavaInter {
	Scanner scanner;
	
	public JavaInter(){
		scanner = new Scanner(System.in);
	}

	
	public int getLevel(){
		System.out.println("Would you like to play the easy (1) or hard (2) level?");
		return scanner.nextInt();
	}
	
	
	public int getRowNumber(){
		System.out.println("Please indicate the row number");
		return scanner.nextInt();
	}
	
	public int getColNumber(){
		System.out.println("Please indicate the column number");
		return scanner.nextInt();
	}
}
