package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GEtSheet {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\chaka\\eclipse-workspace\\Sample\\rambasic exl\\Deepak.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		workbook.getSheet("datas");
		
	System.out.println();
	
	
	}
}
