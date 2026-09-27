package QLNV;
import java.text.SimpleDateFormat;
import java.util.Date;
public class main_QLNV {

	public static void main(String[] args) {
		NhanVien[] dsNhanVien = new NhanVien[5];
		// Khoi tao ds
		dsNhanVien[0] = new NhanVien ("Nguyễn Kiệt", new Date("1/1/1990"), "GD", 2.5, 500000);
		dsNhanVien[1] = new NhanVien ("Nguyễn Lê", new Date("3/8/1994"), "PGD", 2.25, 400000);
		dsNhanVien[2] = new NhanVien ("Nguyễn Tuấn", new Date("2/6/1997"), "PP", 2.0, 300000);
		dsNhanVien[3] = new NhanVien ("Nguyễn Thắng", new Date("10/8/1998"), "PP", 1.8, 100000);
		dsNhanVien[4] = new NhanVien ("Nguyễn Gia", new Date("2/9/2000"), "PP", 1.8, 100000);
	double tongLuong = 0;
	//Hiển thị danh sách
	System.out.println("--- DANH SÁCH NHÂN VIÊN ---");
	for (NhanVien nv : dsNhanVien) {
	    double luong = nv.tinhLuong();
	    tongLuong += luong;
	    
	    System.out.println("Họ tên: " + nv.getHoTen() 
	    	+ " | Lương: " + String.format("%.2f", luong) 
	        + " | BHXH: " + String.format("%.2f", nv.tinhBHXH())
	        + " | BHTN: " + String.format("%.2f",nv.tinhBHTN())
	       	+ " | Thực lĩnh: " + String.format("%.2f",nv.tinhThucLinh()));
	}

	System.out.println("Tổng lương của các nhân viên: " + tongLuong);
	System.out.println("Lương trung bình: " + (tongLuong / dsNhanVien.length));
	// Tìm nhân viên có tuổi cao nhất
	NhanVien nvTuoiCaoNhat = dsNhanVien[0];
    for (int i = 1; i < dsNhanVien.length; i++) {
        if (dsNhanVien[i].getNgaySinh().before(nvTuoiCaoNhat.getNgaySinh())) {
            nvTuoiCaoNhat = dsNhanVien[i];
        }
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // In ra thông tin nhân viên tuổi cao nhất với ngày tháng năm sinh đã định dạng
    System.out.println("\nNhân viên có tuổi cao nhất là: " + nvTuoiCaoNhat.getHoTen() 
            + " (Sinh ngày: " + sdf.format(nvTuoiCaoNhat.getNgaySinh()) + ")");
		
	}	

}
