package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\chaka\\eclipse-workspace\\Sample\\rambasic exl\\Deepak.xlsx ");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook (Stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		System.out.println(row);
		Cell cell = row.getCell(1);
		System.out.println(cell);
//				for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//					Row row1 = sheet.getRow(i);
//					for (int j = 0; j <row1.getPhysicalNumberOfCells(); j++) {
//						Cell cell1 = row1.getCell(j);
//						System.out.println(cell1);
//					
	
	}
}

