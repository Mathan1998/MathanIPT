package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\ExcelFile\\TextData.xlsx");

		FileInputStream fr = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fr);

		Sheet s = w.getSheet("Sheet2");

		Row r = s.getRow(3);

		Cell c = r.getCell(1);

		int cellType = c.getCellType();

		if (cellType == 1) {

			String value = c.getStringCellValue();
			System.out.println(value);
		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date date = c.getDateCellValue();
			System.out.println(date);

			SimpleDateFormat sim = new SimpleDateFormat("dd, MMMM, yyyy");
			String value = sim.format(date);
			System.out.println(value);
		}

		else {
			double d = c.getNumericCellValue();

			long l = (long) d;

			String value = String.valueOf(l);
			System.out.println(value);
		}
	}

}
