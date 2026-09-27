package BT1;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang n: ");
        int n = Input.inputInt(); // Sử dụng lớp Input

        int[] a = new int[n];
        int demChan = 0;
        int demLe = 0;

        // Nhập dữ liệu cho mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Input.inputInt(); // Sử dụng lớp Input

            // Đếm số lượng số chẵn, lẻ
            if (a[i] % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }

        System.out.println("So lượng so chan: " + demChan);
        System.out.println("So luong so le: " + demLe);
    }
}
