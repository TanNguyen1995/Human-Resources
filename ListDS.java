package asm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListDS {
    Scanner sc = new Scanner(System.in);
  private  ArrayList<Staff> list = new ArrayList<>();
            Department department = new Department();
     // hàm nhập thông nhân viên vào DS.
     public void nhapNV(){
        do{
         System.out.println("1. Nhập cấp nhân viên 2. Nhập Nhân viên Quản Lý (Nhập rỗng để thoát) ");
         String  key = sc.nextLine();
         if (key == null || key.equals(""))
         break;
         int ikey = Integer.parseInt(key);
         switch (ikey) {
             case 1:
             Employee employee = new Employee();
             employee.nhap(sc);
            list.add(employee);
                 break;
             case 2:
             Manager manager = new Manager();
             manager.nhap(sc);
             list.add(manager); 
                 break;
         }
     }while(true); 
     }
     // hàm xuât thông tin theo DS.
     public void xuatNV(){
         for(Staff staff :list){
            if (staff instanceof Employee){
               ((Employee)staff).displayInformation();
            } else if (staff instanceof Manager){
               ((Manager)staff).displayInformation();
            }
         }
     }
     // hàm tìm nhân viên theo ID.
     public void timKiemID(Scanner s){

      System.out.println("Nhập số ID của nhân viên: ");
      int nhapID = s.nextInt();
      Staff findID = null;
      for (Staff staff :list){
         if (staff.getID()==nhapID){
            findID = staff;
            break;
         }
      }
      if(findID!=null){
         System.out.println("Thông tin nhân viên tìm theo mã ");
         findID.displayInformation();
      }
      else{
         System.out.println("không tìm thấy ID");
      }
     }
     // hàm tìm nhân viên theo tên.
     public void timKiemTheoTen(Scanner s){
      System.out.println("Nhập tên của nhân viên: ");
      Staff findName = null;
      String nhapTen = s.nextLine();
      for (Staff staff :list){
         if (staff.getHoTen().equalsIgnoreCase(nhapTen)){
            findName = staff;
            break;
         }
      }
      if(findName!=null){
         System.out.println("Thông tin nhân viên tìm theo tên ");
         findName.displayInformation();
      }
      else{
         System.out.println("không tìm thấy tên");
      }
   }
     // hàm xuất nhân viên theo bộ phận.
      public void timKiemTheoBoPhan(){

      Collections.sort(list, (a, b)-> a.getBoPhan().compareToIgnoreCase(b.getBoPhan()));
   }
     // hàm xuất DS lương của nhân viên.
      public void DSluong(){
      for(Staff staff :list){
         if (staff instanceof Employee){
            ((Employee)staff).xuatLuong();;
         } else if (staff instanceof Manager){
            ((Manager)staff).xuatLuong();;
         }
      }
   }
      // hàm Sắp xếp theo lương tăng.
      public void SXLuongTang(){
         Collections.sort(list, (a, b)-> a.getCalcuLateSalary() - b.getCalcuLateSalary());
      }
      // hàm Sắp xếp theo lương giảm.
      public void SXLuongGiam(){
         Collections.sort(list, (a, b)-> b.getCalcuLateSalary() - a.getCalcuLateSalary());
      }
      // hàm tính số lượng nhân viên.
      public int tongNV(){
        return list.size();
      }

}
