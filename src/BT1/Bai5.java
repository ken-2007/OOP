package BT1;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang n: ");
        int n = Input.inputInt(); // Sử dụng lớp Input

        if (n <= 0) {
            System.out.println("So luong phan tu phai lon hon 0.");
            return;
        }

        int[] a = new int[n];

        // Nhập mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Input.inputInt(); // Sử dụng lớp Input
        }

        // Khởi tạo giá trị ban đầu[cite: 1]
        int max = a[0], viTriMax = 0;
        int min = a[0], viTriMin = 0;

        // Duyệt mảng để tìm max, min và vị trí
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                viTriMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                viTriMin = i;
            }
        }

        System.out.println("Gia tri lon nhat (max): " + max + " tai chi so i = " + viTriMax);
        System.out.println("Gia tri nho nhat (min): " + min + " tai chi so i = " + viTriMin);
    }
}
