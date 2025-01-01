package tuan2.bai3;

abstract class Employee {
	protected String id;
    protected String name;
    protected String birthday;
    protected String address;
    protected double wageCoefficient;
    
    public Employee(String id, String name, String birthday, String address, double wageCoefficient) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.wageCoefficient = wageCoefficient;
    }

    public abstract double calculateSalary();

	@Override
	public String toString() {
		return "Mã nhân viên: " + id +
                "\nTên nhân viên: " + name +
                "\nNgày sinh: " + birthday +
                "\nĐịa chỉ: " + address +
                "\nHệ số lương: " + wageCoefficient +
                "\nLương: " + calculateSalary();
	}

   
}
