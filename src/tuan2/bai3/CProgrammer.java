package tuan2.bai3;

public class CProgrammer extends Employee {
    private double overtime;

    public CProgrammer(String id, String name, String birthday, String address, double wageCoefficient, double overtime) {
        super(id, name, birthday, address, wageCoefficient);
        this.overtime = overtime;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = 3000000; // Lương cơ bản
        return baseSalary * wageCoefficient + overtime;
    }

    @Override
    public String toString() {
        return "Lập trình viên:\n" + super.toString() + "\nTiền overtime: " + overtime + "\n";
    }
}
