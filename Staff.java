package asm3;

import java.util.Scanner;

public abstract class Staff {
    Scanner sc = new Scanner(System.in);
    // khai báo biến
    private String hoTen,ngayVao,boPhan;
    private int iD,tuoi,heSoLuong,ngayNghi;
    public Staff(){
    };
    public Staff(String hoTen,int iD, int tuoi, int heSoLuong, String ngayVao, String boPhan, int ngayNghi){
        this.hoTen = hoTen;
        this.iD= iD;
        this.tuoi = tuoi;
        this.heSoLuong = heSoLuong;
        this.ngayVao = ngayVao;
        this.boPhan = boPhan;
        this.ngayNghi = ngayNghi;
    }
    // để tính lương quản lý và nhân viên.
    public abstract int getCalcuLateSalary();
    // set và get các biến
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(){
        this.hoTen = hoTen;
    }
    public int getID(){
        return iD;
    }
    public void setID(){
        this.iD = iD;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(){
        this.tuoi= tuoi;
    }
    public int getHeSoLuong(){
        return heSoLuong;
    }
    public void setHeSoLuong(){
        this.heSoLuong = heSoLuong;
    }
    public int getNgayNghi(){
        return ngayNghi;
    }
    public void setNgayNghi(){
        this.ngayNghi = ngayNghi;
    }
    public String getNgayVao(){
        return ngayVao;
    }
    public void setNgayVao(){
        this.ngayVao = ngayVao;
    }
    public String getBoPhan(){
        return boPhan;
    }
    public void setBoPhan(){
        this.boPhan = boPhan;
    }
    // hàm nhập thông tin chung của nhân viên
    public void nhap(Scanner s ){
      
        System.out.println("--------------------------------");
        System.out.println("Nhập thông tin nhân viên");
        System.out.print("Nhập Bộ phận: ");
        this.boPhan = s.nextLine();
        System.out.print("Nhập họ và tên: ");
        this.hoTen = s.nextLine();
        System.out.print("Ngày đầu tiên đi làm: ");
        this.ngayVao = s.next();
        System.out.print("Nhập tuổi: ");
        this.tuoi = s.nextInt();
        System.out.print("Nhập số ID: ");
        this.iD = s.nextInt();
        System.out.print("Hệ số lương: ");
        this.heSoLuong = s.nextInt();
        System.out.print("Số ngày nghỉ: ");
        this.ngayNghi = s.nextInt();
        
    }
    // hàm xuất thông tin chung của nhân viên
    public void displayInformation(){
           System.out.printf("ID: %s - Bộ phận: %s - Họ Tên: %s - Tuôi: %s - Ngày đầu tiên: %s - hệ số lượng: %s - Số ngày nghỉ: %s -",iD,boPhan,hoTen,tuoi,ngayVao,heSoLuong,ngayNghi);
    }
    // hàm DS lương của nhân viên
    public void xuatLuong(){
        System.out.printf("ID: %s - Bộ phận: %s - Họ Tên: %s", iD,boPhan,hoTen);
    }

}
