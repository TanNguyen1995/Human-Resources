package asm3;

import java.util.Scanner;

public class Employee extends Staff implements ICalculator {
    Scanner sc = new Scanner(System.in);
    // khai báo biến
    private int soGioLam;
    // khai báo 
    public Employee(){};
    public Employee(String hoTen,int ID, int tuoi, int heSoLuong, String ngayVao, String boPhan, int ngayNghi,int soGioLam){
               super(hoTen,ID,tuoi,heSoLuong,ngayVao,boPhan,ngayNghi);
               this.soGioLam = soGioLam;
    }
    public int getSoGioLam(){
    return soGioLam;
    }
    public void setSoGioLam(){
       this.soGioLam = soGioLam;
    }
    // hàm nhập cho nhân viên
    public void nhap(Scanner s){
       super.nhap(s);
       System.out.print("Nhập số giờ làm thêm: ");
       this.soGioLam = s.nextInt();
       s.nextLine();
   }
   // hàm xuất thông tin của nhân viên
   public void disPlayInformation(){
       super.displayInformation();
       System.out.printf("Số giờ làm thêm: %s.",soGioLam);
       System.out.println("");
   }
   // hàm xuất tiền lương của nhân viên
   public void xuatLuong(){
    super.xuatLuong();
    System.out.printf("- Tiền lương: %s.",getCalcuLateSalary());
    System.out.println("");
}
    // hàm tính lương của nhân viên
    @Override
    public int getCalcuLateSalary(){
    return getHeSoLuong()*3000000+ soGioLam*200000;
}
   
}
