package bai12Module2;

import java.util.Scanner;


public class TestCD {
	public static void main(String[] args) {
		CDList dsCD= new CDList(5);
		init(dsCD);
		Scanner sc= new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("Moi ban chon:\n"
					+ "1. Them CD\n"
					
					+ "2. In danh sach CD \n");
			
			chon= sc.nextInt();
			switch (chon) {
			case 1 -> {
				CD cd = new CD();
				System.out.println("nhap ma cd: ");
				cd.setMaCD(sc.nextInt());
				sc.nextLine();
				System.out.println("nhap ten: ");
				cd.setTuaCD(sc.nextLine());
				System.out.println("nhap so: ");
				cd.setSoBH(sc.nextInt());
				System.out.println("nhap gia: ");
				cd.setGia(sc.nextDouble());

				dsCD.addCD(cd);

			}
			
			case 2 -> {
				CD[] temp = dsCD.getDsCD();
				for (CD c : temp) {
					System.out.println(c);
				}

			}
			
			case 3->{
				dsCD.xoaCD(11);
			}
			
			case 4->{
				CD[] t= dsCD.sapXepbyGia();
				for(CD c: t) {
					System.out.println(c);
				}
			}
			case 5->{
				CD[] t= dsCD.sapXepbyTua();
				for(CD c: t) {
					System.out.println(c);
				}
			}
			}
			
			
	}while(chon != -1);
		
	}
	private static void init(CDList dsCD) {
		dsCD.addCD(new CD(11,"tom",3,50000.0));
		
		dsCD.addCD(new CD(12,"bean",3,30000.0));
		dsCD.addCD(new CD(13,"jerry",3,80000.0));
	}
}
