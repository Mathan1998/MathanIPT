package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class Sample4 extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		// Excel Write.......
		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\ExcelFile\\ExcelUpdate.xlsx");
		
		/*Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Data");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Mathan");
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Done");*/
		
		
		FileInputStream fr = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fr);
		
		Sheet s = w.getSheet("Data");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		String text = c.getStringCellValue();
		
		if(text.equals("Mathan")) {
			c.setCellValue("santhosh");
		}
		
		FileOutputStream fo = new FileOutputStream(f);
		
		w.write(fo);
		
		System.out.println("Done");
		
	}

}
