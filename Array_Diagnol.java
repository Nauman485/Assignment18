package geekster;
import java.util.*;

public class Array_Diagnol {
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
		int d=a[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					if(d==a[i][j]) {
						flag=true;
					}
					else {
						flag=false;
						System.out.println("False");
						break;
					}
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
