package codes;

import java.util.Scanner;

public class SimpleMenuExample {
	static {
		System.out.println("Hello.....");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 1 for menu a-z");
		System.out.println("Enter 2 for menu z-a");
		System.out.println("Enter 3 for menu A-Z");
		System.out.println("Enter 4 for menu Z-A");
		System.out.println("Enter 5 for exit");
		
		String[] str= {"parota","sapathy","Shawarma","sambar","rice","kuruma","appalam","curd","Chicken 65","Chicken Briyani","Fish fry","Roasted chicken","paneer masala"};
		
		System.out.println();
		String temp;
		
		//Below codes used to sort given string in alphabetical order.....
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number... ");
		int n=sc.nextInt();
		
		//switch case used to print menu details
		switch(n) {
		
		case 1:
			for(int i=0;i<str.length;i++) {
				if(str[i].charAt(0)==str[i].toLowerCase().charAt(0)) {
					System.out.println(str[i]);
				}
			}
			break;
			
		case 2:
			for(int i=str.length-1;i>=0;i--) {
				if(str[i].charAt(0)==str[i].toLowerCase().charAt(0)) {
					System.out.println(str[i]);
				}
			}
			break;
			
		case 3:
			for(int i=0;i<str.length;i++) {
				if(str[i].charAt(0)==str[i].toUpperCase().charAt(0)) {
					System.out.println(str[i]);
				}
			}
			break;
			
		case 4:
			for(int i=str.length-1;i>=0;i--) {
				if(str[i].charAt(0)==str[i].toUpperCase().charAt(0)) {
					System.out.println(str[i]);
				}
			}
			break;
			
		case 5:
			System.exit(0);
		}
		
		sc.close();
		
		
	}
}

