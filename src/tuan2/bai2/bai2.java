package tuan2.bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
        String filePath = "C:\\Users\\Dell\\eclipse-workspace\\BasicOOP_inJava\\src\\tuan2\\bai2\\khachhang.csv"; // Đường dẫn file CSV
        Map<String, Customer> customerMap = new HashMap<>();

        // Đọc file CSV và lưu thông tin khách hàng vào Map
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Bỏ qua dòng header
            while ((line = br.readLine()) != null) {
                // Phân tích dòng dữ liệu CSV
                String[] fields = parseCSVLine(line);
                String id = fields[0];
                String name = fields[1];
                String sex = fields[2];
                String birthday = fields[3];
                String email = fields[4];
                String address = fields[5];
                int point = Integer.parseInt(fields[6]);

                // Tạo đối tượng khách hàng và thêm vào Map
                Customer customer = new Customer(id, name, sex, birthday, email, address, point);
                customerMap.put(id, customer);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }

        // Nhập mã khách hàng và hiển thị thông tin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        String customerId = scanner.nextLine();

        if (customerMap.containsKey(customerId)) {
            Customer customer = customerMap.get(customerId);
            System.out.println(customer);
        } else {
            System.out.println("Không tìm thấy khách hàng với mã: " + customerId);
        }
    }

    /**
     * Phương thức để phân tích dòng CSV với các trường hợp đặc biệt (dấu ngoặc kép, dấu phẩy trong trường).
     */
    private static String[] parseCSVLine(String line) {
        // Tách các trường trong dòng CSV bằng regex, xử lý dấu ngoặc kép
        String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); // Regex để tách CSV
        for (int i = 0; i < fields.length; i++) {
            fields[i] = fields[i].replaceAll("^\"|\"$", "").trim(); // Xóa dấu ngoặc kép đầu và cuối
        }
        return fields;
    }
}
