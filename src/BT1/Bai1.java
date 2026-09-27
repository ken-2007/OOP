package BT1;

public class Bai1 {
    // Đổi tên thành main để có thể chạy độc lập 1 mình
    public static void main(String[] args) {
        System.out.println("Bai toan tinh chu vi & dien tich hinh tron");
        System.out.print("Nhap r: ");
        double r = Input.inputFloat(); // Dùng phương thức từ lớp Input

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;
        System.out.printf("Chu vi hinh tron: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh tron: %.2f\n", dienTich);
    }
}