package geekster;
import java.util.Scanner;

public class Arr_row_sum {
	
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			int a[][]=new int[3][3];
			System.out.println("Enter elements of array");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			sc.close();
			boolean flag=false;
			for(int i=0;i<3;i++) {
				for(int j=0;j<1;j++) {
					if(a[i][j]+a[i][j+1]==a[i][j+2]) {
						flag=true;
					}
					else {
						flag=false;
						System.out.println("False");
						break;
					}
				}
				if(!flag) {
					break;
				}
			}
			if(flag) {
				System.out.println("True");
			}
			
		}
}
				

				
