package BAI3;

import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;
 
        
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                studentManager.add();
                break;
            case "2":
                studentId = studentManager.inputId();
                studentManager.edit(studentId);
                break;
            case "3":
                studentId = studentManager.inputId();
                studentManager.delete(studentId);
                break;
            case "4":
                studentManager.sortStudentByGPA();
                break;
            case "5":
                studentManager.sortStudentByName();
                break;
            case "6":
                studentManager.show();
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
   
            showMenu();
        }
    }
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them hoc sinh.");
        System.out.println("2. Sua ID.");
        System.out.println("3. Xoa ID.");
        System.out.println("4. Sap xep diem trung binh.");
        System.out.println("5. Sap xep ten hs.");
        System.out.println("6. Bang thong tin.");
        System.out.println("0. Thoat.");
        System.out.println("---------------------------");
        System.out.print("Chon: ");
    }
}