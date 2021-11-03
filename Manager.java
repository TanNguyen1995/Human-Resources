package asm3;

import java.util.Scanner;

public class Manager extends Staff implements ICalculator {
    Scanner sc = new Scanner(System.in);
    // khai báo biến.
    private int chucDanh;
    private String iCD;
    public Manager(String hoTen,int ID, int tuoi, int heSoLuong, String ngayVao, String boPhan, int ngayNghi, int chucDanh){
        super(hoTen,ID,tuoi,heSoLuong,ngayVao,boPhan,ngayNghi);
        this.chucDanh = chucDanh;
}
public Manager(){};
    // khai báo set và get của các biến.
    public int getchuDanh(){
    return chucDanh;
}
    public String getICD() {
    if(getchuDanh()==1){
        return iCD = "Giám đốc";
    }
    else if(getchuDanh()==2){
        return iCD = "Giám đốc dự án";
    }
    return iCD = "Giám đốc kỹ thuật";
    }
    public void setICD(String iCD) {
    this.iCD = iCD;
}
    public void setChucDanh(int chucDanh) {
    this.chucDanh = chucDanh;
}
    // hàm chuyển giá trị chức danh thành tiền.
    public int Tinhluong(){
    if(chucDanh==1){
        return 8000000;
    } 
    else if(chucDanh==2){
        return 5000000;
    }
    return 6000000;
}
    // hàm nhập thông tin quản lý.
    public void nhap(Scanner s){
 super.nhap(s);
 System.out.println("Nhập chức danh(1.Giám đốc /2.Giám đốc dự án/3.Giám đốc kỹ thuật): ");
 chucDanh = s.nextInt();
s.nextLine();
}
    // hàm xuất thông tin quản lý. 
    public void displayInformation(){
super.displayInformation();
System.out.printf("Chức danh: %s.",getICD());
System.out.println("");
}
    // hàm xuất DS lương quản lý.
    public void xuatLuong(){
    super.xuatLuong();
    System.out.printf("- Chức danh: %s - Tiền lương: %s.",getICD(),getCalcuLateSalary());
    System.out.println("");
}
    // hàm tính lương quản lý
    @Override 
    public int getCalcuLateSalary(){
    return getHeSoLuong()*5000000 +Tinhluong();
}
    }