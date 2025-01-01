package tuan2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class tuan2_1 {

    // Hàm để đếm tần suất các ký tự trong chuỗi
    public static Map<Character, Integer> getCharacterFrequency(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Chuyển chuỗi về chữ thường và loại bỏ dấu cách
        s = s.toLowerCase().replaceAll("\\s", "");
        
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("frequencyMap: " + frequencyMap);
        
        return frequencyMap;
       
    }

    // Hàm để in tần suất ký tự của hai chuỗi
    public static void printCharacterFrequency(String s1, String s2) {
        // Đếm tần suất các ký tự trong s1 và s2
        Map<Character, Integer> frequencyMap1 = getCharacterFrequency(s1);
        Map<Character, Integer> frequencyMap2 = getCharacterFrequency(s2);

        // Kết hợp các ký tự từ cả hai chuỗi
        Map<Character, Integer> combinedMap = new HashMap<>(frequencyMap1);
        
        // Thêm tần suất từ chuỗi s2
        for (char c : frequencyMap2.keySet()) {
            combinedMap.put(c, combinedMap.getOrDefault(c, 0) + frequencyMap2.get(c));
        }

        // In ra tần suất của từng ký tự
        for (Map.Entry<Character, Integer> entry : combinedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    
 // Hàm thực hiện phép hội của hai chuỗi
    public static Set<Character> getUnionOfStrings(String s1, String s2) {
        Set<Character> unionSet = new HashSet<>();

        // Thêm tất cả các ký tự từ s1 vào set
        for (char c : s1.toCharArray()) {
            unionSet.add(c);
        }

        // Thêm tất cả các ký tự từ s2 vào set
        for (char c : s2.toCharArray()) {
            unionSet.add(c);
        }

        return unionSet;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi s1 và s2
        System.out.print("Nhập chuỗi s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Nhập chuỗi s2: ");
        String s2 = scanner.nextLine();

        // In tần suất ký tự từ cả hai chuỗi
        printCharacterFrequency(s1, s2);
        System.out.println("------");
        getCharacterFrequency(s2);
        System.out.println("------");
        getCharacterFrequency(s1);
        
        
        // Hội
        
        Set<Character> resultSet = getUnionOfStrings(s1, s2);

        System.out.println("Kết quả của phép hội (union) giữa hai chuỗi: ");
        for (char c : resultSet) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
