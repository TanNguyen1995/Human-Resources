package asm3;

public class Department {
    // khai báo biến của Deparment
    private String maBoPhan;
    private String boPhan;
    private int tongsoNV = 0;
    public Department(){
    }
    public Department( String maBoPhan, String boPhan, int tongsoNV){
        this.maBoPhan=maBoPhan;
        this.boPhan= boPhan;
        this.tongsoNV = tongsoNV;
    }
    public Department( String maBoPhan, String boPhan){
        this.maBoPhan=maBoPhan;
        this.boPhan= boPhan;
    }
    // khai báo set và get của các biến.
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }
    public String getBoPhan() {
        return boPhan;
    }   
    public String getMaBoPhan() {
        return maBoPhan;
    }
    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }
    public int getTongsoNV() {
        return tongsoNV ;
    }
    public void setTongsoNV(int tongsoNV) {
        this.tongsoNV = tongsoNV;
    }
    // hiện thị DS bộ phận
    public void display(){
        System.out.printf("Mã bộ phận : %s - Bộ Phận: %s.",maBoPhan,boPhan);
        System.out.println("");
    }
}
