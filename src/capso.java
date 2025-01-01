import java.util.Scanner;

public class capso {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng phần tử
        int n = scanner.nextInt();
        int[] A = new int[n];
        
        // Nhập mảng A
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Tìm cặp lân cận có tổng lớn nhất
        int maxSum = Integer.MIN_VALUE;
        int index1 = -1, index2 = -1;
        
        for (int i = 0; i < n; i++) {
            int nextIndex = (i + 1) % n; // Vòng tròn5
            int sum = A[i] + A[nextIndex];
            
            // So sánh tổng và cập nhật kết quả
            if (sum > maxSum || (sum == maxSum && i > index1)) {
                maxSum = sum;
                index1 = i;
                index2 = nextIndex;
            }
        }
        
        // In kết quả
        System.out.println(A[index1] + " " + A[index2]);
        
        /*
         * do {
            // Hiển thị menu
            System.out.println("===== MENU =====");
            System.out.println("1. Chọn case 1");
            System.out.println("2. Chọn case 2");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            // Nhập lựa chọn
            choice = scanner.nextInt();
            
            // Xử lý lựa chọn
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn Case 1.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Case 2.");
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }

            // Quay lại menu nếu chưa chọn thoát
        } while (choice != 3);

        scanner.close();
         */
    }
}
