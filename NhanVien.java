package QLNV;

import java.util.Date;

public class NhanVien {
	// Thuộc tính private
	private String HoTen;
	private Date NgaySinh;
	private String ChucVu;
	private double heSoLuong;
	private double luongCoBan;
	// Khởi tạo
	public NhanVien(String HoTen, Date NgaySinh, String ChucVu, double heSoLuong, double luongCoBan) {
		this.HoTen = HoTen;
		this.NgaySinh = NgaySinh;
		this.ChucVu = ChucVu;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
		
	}
	public String getHoTen() {
        return HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }
	// Phương thức hỗ trợ
	private double layHeSoPhuCap() {
		if (ChucVu.equals("GD")) return 1.0;
		if (ChucVu.equals("PGD")) return 0.8;
		if (ChucVu.equals("TP")) return 0.5;
		if (ChucVu.equals("PP")) return 0.4;
		return 0.0;
	}
	// Phương thức tính toán
	// a.Tinh luong
	public double tinhLuong() {
		return (heSoLuong + layHeSoPhuCap()) * luongCoBan;
		
	}
	
	// b.Tinh bao hiem xa hoi
	public double tinhBHXH() {
		return tinhLuong() * 0.06;
	}
	// c. Tinh bao hiem that nghiep
	public double tinhBHTN() {
		return tinhLuong() * 0.01;
	}
	// d. Tinh so tien con nhan
	public double tinhThucLinh() {
		return tinhLuong() - tinhBHXH() - tinhBHTN();
	}

}
