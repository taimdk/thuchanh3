/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma hoa don: ");
        int orderID = sc.nextInt();
        LocalDate orderDate = LocalDate.now();
        Order order = new Order(orderID, orderDate);
        
        boolean running = true;
        while (running) {
            System.out.println("1. Them san pham");
            System.out.println("2. In hoa don");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> order.Nhap();
                case 2 -> order.in();
                case 0 -> running = false;
                default -> System.out.println("Lua chon khong hop le!");
            }
            sc.nextLine(); // Đọc bỏ dòng thừa sau khi nhập số lựa chọn
        }
        
        System.out.println("Cam on da su dung chuong trinh!");
    }
}


