package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class Task extends BaseClass {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\"
				+ "ExcelFile\\StudentCourse.xlsx");
		
		FileInputStream fr = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fr);
		
		Sheet s = w.getSheet("Sheet1");
		
		int rows = s.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		int cells = s.getRow(10).getPhysicalNumberOfCells();
		System.out.println(cells);
		
	}

}
