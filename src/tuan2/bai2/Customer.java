package tuan2.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customer {
	 private String id;
	 private String name;
	 private String sex;
     private String birthday;
	 private String email;
	 private String address;
	 private String customerType;
	 
	 public Customer(String id, String name, String sex, String birthday, String email, String address, int point) {
	        this.id = id;
	        this.name = name;
	        this.sex = sex;
	        this.birthday = birthday;
	        this.email = email;
	        this.address = address;
	        this.customerType = determineCustomerType(point);
	    }
	 
	 private String determineCustomerType(int point) {
	        if (point <= 100) {
	            return "Silver";
	        } else if (point <= 1000) {
	            return "Gold";
	        } else {
	            return "Diamond";
	        }
	    }
	 
	 @Override
	    public String toString() {
	        return "Mã khách hàng: " + id +
	                "\nHọ tên: " + name +
	                "\nGiới tính: " + sex +
	                "\nNgày sinh: " + birthday +
	                "\nEmail: " + email +
	                "\nĐịa chỉ: " + address +
	                "\nLoại khách hàng: " + customerType;
	    }
	 
	 


}
