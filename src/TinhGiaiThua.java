import java.util.Scanner;

public class TinhGiaiThua {
	public static int gt = 0;
	public static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.print("Nhập vào n = ");
		gt = scanner.nextInt();
		System.out.println("Giai thừa của "+gt+" là: GT = " + tinhGiaiThua(gt));
	}
	public static long tinhGiaiThua(int n) {
		long giai_thua = 1;
		if(n == 0 || n == 1) {
			return giai_thua;
		}else {
			for(int i = 2 ;i<=n;i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}

}
