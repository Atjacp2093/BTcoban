import java.util.Scanner;
public class twosum {
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		boolean check = false;
		while(!check){
			System.out.println(" ");
			try {
				n = scanner.nextInt();
				check = true;
				}
			catch (Exception e){
				System.out.println("you have to enter the number please enter again! ");
				scanner.nextLine();
			}
		}
		return (n);
	}

	public static void main(String[] args) {
		int n,i;
		System.out.println("n :");
		n = input();
		int[] array = new int[n];
		for(i=0; i<n; i++) {
		System.out.println("array["+(i+1)+"] : ");
		array[i] = input();
		}
		System.out.println("index= ");
		int index = input();
		for(i = 0; i < n; i++) {
		for(int j = 1;j <n-1; j++) {
			if(array[i]+array[j]==index)
			System.out.println("["+i+","+j+"]");	
		}
		}
	}
}
