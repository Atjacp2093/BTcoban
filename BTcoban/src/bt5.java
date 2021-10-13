import java.util.Scanner;
public class bt5 {
	public static void lietKe(int n){
		System.out.print(" 2");
		for(int i=3;i<n;i+=2){
			if(bt4.checkSNT(i))System.out.print(" "+i);
		}
	}
    public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static void main(String[] args) {
                System.out.print("Nhap n");
		int n= nhap();
		System.out.println("Cac so nguyen to nho hon "+n+ " ");
		lietKe(n);
    }

}

