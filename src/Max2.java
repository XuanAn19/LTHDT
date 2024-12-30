import java.util.Scanner;

public class Max2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số phần tử của mảng
	        int n = scanner.nextInt();

	        // Khởi tạo mảng và nhập các phần tử
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Tìm số lớn nhất và lớn thứ hai
	        if (n < 2) {
	            System.out.println("Không đủ phần tử để tìm số lớn thứ hai.");
	        } else {
	            int max = Integer.MIN_VALUE; // Số lớn nhất
	            int secondMax = Integer.MIN_VALUE; // Số lớn thứ hai

	            for (int i = 0; i < n; i++) {
	                if (arr[i] > max) {
	                    secondMax = max; // Cập nhật số lớn thứ hai
	                    max = arr[i]; // Cập nhật số lớn nhất
	                } else if (arr[i] > secondMax && arr[i] != max) {
	                    secondMax = arr[i]; // Cập nhật số lớn thứ hai
	                }
	            }

	            if (secondMax == Integer.MIN_VALUE) {
	                System.out.println("Không có số lớn thứ hai (tất cả các phần tử giống nhau).");
	            } else {
	                System.out.println("Số lớn thứ hai trong mảng là: " + secondMax);
	            }
	        }

	        scanner.close();
	    }
}
