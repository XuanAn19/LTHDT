package tuan2.bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CompanyManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Đọc danh sách nhân viên từ file");
            System.out.println("2. Hiển thị toàn bộ nhân viên");
            System.out.println("3. Sắp xếp nhân viên theo lương giảm dần");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng xuống sau nhập số

            switch (choice) {
                case 1:
                    System.out.println("Đọc danh sách nhân viên từ file:");
                    System.out.print("Nhập tên file (vd: employees.txt): ");
                    String fileName = scanner.nextLine();
                    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] parts = line.split(",");
                            String id = parts[0];
                            String name = parts[1];
                            String birthday = parts[2];
                            String address = parts[3];
                            double wageCoefficient = Double.parseDouble(parts[4]);

                            if (parts[6].equalsIgnoreCase("Programmer")) {
                                double overtime = Double.parseDouble(parts[5]);
                                employees.add(new CProgrammer(id, name, birthday, address, wageCoefficient, overtime));
                            } else if (parts[6].equalsIgnoreCase("Tester")) {
                                int errorCount = Integer.parseInt(parts[5]);
                                employees.add(new CTester(id, name, birthday, address, wageCoefficient, errorCount));
                            }
                        }
                        System.out.println("Đọc file thành công.\n");
                    } catch (IOException e) {
                        System.out.println("Không thể đọc file: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Danh sách nhân viên:");
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;

                case 3:
                    System.out.println("Sắp xếp nhân viên theo lương giảm dần:");
                    Collections.sort(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return Double.compare(o2.calculateSalary(), o1.calculateSalary());
                        }
                    });
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Tùy chọn không hợp lệ.");
            }
        }
    }
}