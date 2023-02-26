package codes;

public class diamondPatternExample{
	public static void main(String[] args) {
		int n=15;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("# ");
				
				}
			for(int l=0;l<=n-i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=n;i>=0;i--) {
			for(int j=n;j>=i-0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("# ");
			}
			for(int l=n;l>=i-0;l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}