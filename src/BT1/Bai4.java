package BT1;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang n: ");
        int n = Input.inputInt(); // Sử dụng lớp Input

        int[] a = new int[n];

        // Nhập mảng[cite: 1]
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Input.inputInt(); // Sử dụng lớp Input
        }

        // Thuật toán đổi chỗ (Exchange Sort) với 2 vòng lặp for lồng nhau
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // In mảng sau khi sắp xếp[cite: 1]
        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
