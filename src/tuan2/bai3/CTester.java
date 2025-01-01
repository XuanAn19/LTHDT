package tuan2.bai3;

public class CTester  extends Employee {
    private int errorCount;

    public CTester(String id, String name, String birthday, String address, double wageCoefficient, int errorCount) {
        super(id, name, birthday, address, wageCoefficient);
        this.errorCount = errorCount;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = 3000000; // Lương cơ bản
        return baseSalary * wageCoefficient + errorCount * 100000;
    }

    @Override
    public String toString() {
        return "Kiểm chứng viên:\n" + super.toString() + "\nSố lỗi phát hiện: " + errorCount + "\n";
    }
}
