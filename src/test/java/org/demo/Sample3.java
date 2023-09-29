package org.demo;

import java.io.IOException;

import org.base.BaseClass;

public class Sample3 extends BaseClass {
	public static void main(String[] args) throws IOException {
		writeExcel("Google", "Data", 10, 10, "END");
		writeExcel("Google", "Data", 10, 11, "end");
		
		createRowOnly("Google", "Data", 0, 0, "name");
		createCellOnly("Google", "Data", 0, 1, "phone no");
		createCellOnly("Google", "Data", 0, 2, "Username");
		createCellOnly("Google", "Data", 0, 3, "password");
		createCellOnly("Google", "Data", 0, 4, "mail id");

		createRowOnly("Google", "Data", 1, 0, "Renu");
		createCellOnly("Google", "Data", 1, 1, "9876543210");
		createCellOnly("Google", "Data", 1, 2, "Renuka");
		createCellOnly("Google", "Data", 1, 3, "renu@123");
		createCellOnly("Google", "Data", 1, 4, "renu@gmail.com");

		createRowOnly("Google", "Data", 2, 0, "dev");
		createCellOnly("Google", "Data", 2, 1, "7869456723");
		createCellOnly("Google", "Data", 2, 2, "Devendran");
		createCellOnly("Google", "Data", 2, 3, "dev@556");
		createCellOnly("Google", "Data", 2, 4, "dev@gamil.com");

		createRowOnly("Google", "Data", 3, 0, "bala");
		createCellOnly("Google", "Data", 3, 1, "6958231225");
		createCellOnly("Google", "Data", 3, 2, "balaSaraswati");
		createCellOnly("Google", "Data", 3, 3, "bala@789");
		createCellOnly("Google", "Data", 3, 4, "bala@gmail.com");

	}

}
