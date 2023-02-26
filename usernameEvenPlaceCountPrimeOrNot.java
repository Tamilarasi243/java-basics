package basics;

public class usernameEvenPlaceCountPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] usernames = {"abcdef", "pqrs", "xyzuvabb", "aaaaaa"};
		int count=0;
		System.out.println("Given string even place not repetition character count is prime or not");
		for(int i=0;i<usernames.length;i++) {
			int len=usernames[i].length();

			for(int j=0;j<len;j++) {
				if(j%2==0) {
					char c=usernames[i].charAt(j);
					j=j+1;
					int idx=usernames[i].indexOf(c,j+1);
					if(idx==-1) {
						count++;
					}
					
				}
				
				
			}
			boolean flag=false;
			if(count==0 || count==1) {
				flag=false;
			}
			for(int l=2;l<=count/2;l++) {
				if(count%l==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(usernames[i]+"- Prime");
			}
			else {
				System.out.println(usernames[i]+"- NotPrime");
			}
			
			count=0;
			
		}


	}

}
