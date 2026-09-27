package BT1;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap he so a: ");
        float a = Input.inputFloat(); // Sử dụng lớp Input

        System.out.print("Nhap he so b: ");
        float b = Input.inputFloat(); // Sử dụng lớp Input

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            float x = -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat x = " + x);
        }
    }
}
