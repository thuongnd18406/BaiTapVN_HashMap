package dangthuongngo.com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RenLuyenHashMap {
	static HashMap<Integer, String> sinhvien =new HashMap<Integer, String>();
	public static void menu() 
	{
		System.out.println("1 Thêm Sinh viên");
		System.out.println("2 Sửa Sinh vien");
		System.out.println("3 Xóa Sinh viên chứa tên bất kì");
		System.out.println("4 Tìm kiếm Sinh viên");
		System.out.println("5 Xuất Sinh viên");
		System.out.println("6 Xuất mã Sinh viên");
		System.out.println("7 Xuất tên Sinh viên");
		System.out.println("6 Thoát");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			themSinhVien();
			break;
		case 2:
			suaSinhVien();
			break;
		case 3:
			xoaSinhVienbatki();
			break;
		case 4:
			timSinhVien();
			break;
		case 5:
			xuatSinhVien();
			break;
		case 6:
			xuatMaSinhVien();
			break;
		case 7:
			xuatTenSinhVien();
			break;
		case 8:
			System.err.println("Cảm ơn bạn đã dùng chương trình!");
			System.exit(0);
			break;
		}
	}
	
	private static void themSinhVien() {
		System.out.print("Nhập mã sinh viên: ");		
		int masv =new Scanner(System.in).nextInt();
		System.out.print("Nhập Sinh viên: ");
		String tensv =new Scanner(System.in).nextLine();
		if (sinhvien.containsKey(masv)==false) 
			sinhvien.put(masv, tensv);
		
	}

	private static void suaSinhVien() {
		System.out.println("Mời bạn nhập mã sinh viên muốn sửa ");
		int ma =new Scanner(System.in).nextInt();
		if(sinhvien.containsKey(ma)==false)
			System.out.println("Mã không tồn tại");
		else
			System.out.println("Nhập tên Sinh viên mới");
		String ten =new Scanner(System.in).nextLine();
		System.out.println("Nhập mã Sinh viên mới");
		//int mamoi =new Scanner(System.in).nextInt();
		sinhvien.put(ma, ten);
	}

	private static void xoaSinhVienbatki() {
		System.out.println("Mời bạn nhập mã muốn xóa");
		int key =new Scanner(System.in).nextInt();
		if(sinhvien.containsKey(key)==false)
			System.out.println("mã không tồn tại");
		else
			sinhvien.remove(key);		
	}

	private static void timSinhVien() {
		System.out.println("Nhập tên Sinh viên bạn muốn tìm");
		String ten =new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> tensv : sinhvien.entrySet())
		{
			if (tensv.getValue().contains(ten)) 
			{
				System.out.println(tensv.getKey()+" - "+tensv.getValue());
			}
		}		
	}

	private static void xuatSinhVien() {
		System.out.println("Mã\t Tên sinh viên");
		for (Map.Entry<Integer, String> ten :sinhvien.entrySet()) 
		{
			System.out.println(ten.getKey()+"\t"+ten.getValue());
		}		
	}

	private static void xuatMaSinhVien() {
		System.out.println("Mã Sinh viên ");
		for (Map.Entry<Integer, String> ma :sinhvien.entrySet()) 
		{
			System.out.println(ma.getKey());
		}			
	}

	private static void xuatTenSinhVien() {
		System.out.println("Tên Sinh viên ");
		for (Map.Entry<Integer, String> ten :sinhvien.entrySet()) 
		{
			System.out.println(ten.getValue());
		}			
	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}

	}

}
