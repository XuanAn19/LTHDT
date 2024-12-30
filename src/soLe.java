import java.util.Scanner;

public class soLe {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        int n = scanner.nextInt();

        // Khởi tạo mảng và nhập các phần tử
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // In ra các số lẻ trong mảng
        System.out.println("Các số lẻ trong mảng là:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
