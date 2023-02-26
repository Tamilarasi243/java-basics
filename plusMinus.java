package basics;

import java.util.Scanner;

public class plusMinus {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int arr[]=new int[n];
		        //eg. n=5 arr[]={4,3,0,-2,1}
		        int posCount=0,negCount=0,zeroCount=0;
		        System.out.println("Positive value count, negative value count, zero value count and their average values");
		        for(int i=0;i<n;i++){
		            arr[i]=sc.nextInt();
		        }
		        for(int i=0;i<arr.length;i++) {
		            if(arr[i]<0) {
		                negCount++;
		            }
		            else if(arr[i]>0) {
		                posCount++;
		            }
		            else {
		                zeroCount++;
		            }
		        }
		       
		        System.out.printf("%.5f",(float)posCount/n);
		        System.out.println();
		        System.out.printf("%.5f",(float)negCount/n);
		        System.out.println();
		        System.out.printf("%.5f",(float)zeroCount/n);

		    sc.close();
		}


}
