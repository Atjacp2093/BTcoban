import java.util.Scanner;

public class bt6 {
	public static boolean checkPrimenumber(int n){
		if(n>1) {
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
		}
		return false;
	}
	public static /*double*/ int nhap() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		int  n = 0;
		while(!check) {
			System.out.println(" ");
			try {
				n = scanner.nextInt();
				check = true;
			}catch (Exception e) {
				System.out.println("try again! ");
				scanner.nextLine();
			}
		}
		return (n);
	}
	
	public static void lietke(int n) {
		int i=2; int count= 0;
		if(count < n && checkPrimenumber(i)) {
			System.out.println("n so nguyen to dau tien"+i);
			count++;
		}
		i++;
		
		
	}
	public static void main (String[ ] args) {
		System.out.println("nhap n: ");
		int n = nhap();
		lietke(n);
		//for(int i = 0; i<= n; i++) {
			//if(checkPrimenumber(i)==true) {
				//System.out.println("so nguyen to <=n "+i);
			//}
		//}
	}
}
