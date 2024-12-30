import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng của hình đồng hồ cát
        System.out.print("Nhập số hàng: ");
        int n = scanner.nextInt();

        // In nửa trên của đồng hồ cát
        for (int i = n; i >= 1; i--) {
            // In khoảng trắng
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // In các dấu sao
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // In nửa dưới của đồng hồ cát
        for (int i = 2; i <= n; i++) {
            // In khoảng trắng
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // In các dấu sao
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
	
	/// Tam giác nguọcư
	 /*public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số hàng: ");
	        int n = scanner.nextInt();

	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }*/
	
	/* In chữ X
	 * 
	 * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng (lẻ): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
	 * 
	 */
	
	/* Hình Vuông
	 * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước cạnh: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
	 * 
	 */
}
