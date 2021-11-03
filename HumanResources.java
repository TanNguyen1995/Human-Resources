package asm3;

import java.util.Scanner;


public class HumanResources {
    public static void main(String[] args) {
        ListDS DS = new ListDS();
        Department department = new Department();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        // vòng lặp để chạy chương trình
        // mỗi case sẽ chạy từng phần riêng.
        do{ System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
        System.out.println("2. Hiển thị các bộ phận trong công ty.");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận.");
        System.out.println("4. Thêm nhân viên mới vào công ty.");   
        System.out.println("5. Tìm kiếm thông tin nhân viên theo mã nhân viên.");
        System.out.println("6. Tìm kiếm thông tin nhân viên theo tên.");
        System.out.println("7. Hiển thị bảng lương của nhân viên toàn công ty.");
        System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
        System.out.println("9. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần.");
        System.out.println("10. Kết thúc chương trình.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Mời bạn nhập chương trình");
        int key = sc.nextInt();
        String enter ;
            switch(key){
                case 1: 
                    DS.xuatNV();
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 2:
                    Department Dpt1= new Department("H01", "Kinh Doanh");
                    Department Dpt2= new Department("H02", "Van Phong");
                    Department Dpt3= new Department("H03", "Ky Thuat");
                    Dpt1.display();
                    Dpt2.display();
                    Dpt3.display();
                    System.out.printf("Số lượng nhân viên hiện tại là: %s.",DS.tongNV());
                    System.out.println("");
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 3:
                    DS.timKiemTheoBoPhan();
                    DS.xuatNV();
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 4:
                    DS.nhapNV();
                    break;
                case 5:
                    DS.timKiemID(s);
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 6:
                    DS.timKiemTheoTen(s);
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 7:
                    DS.DSluong();
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 8:
                    DS.SXLuongTang();
                    DS.DSluong();
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 9:
                    DS.SXLuongGiam();
                    DS.DSluong();
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 10:
                    System.out.print("Cảm ơn bạn đã sử dụng chương trình.");
                    System.exit(0);    
            }
        }while(true);
    }
        
    }