package Bai1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("NV01","Hân",25,"12345","HaNoi");
        NhanVien nhanVien2 = new NhanVien("NV02","Binh",30,"12345","HaNoi");

        nhanVien1.showInfo();
        System.out.println("--------------------------------------");
        nhanVien2.showInfo();
    }
}
