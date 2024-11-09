package com.Framework.Excelfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Framework.Genericlibrary.FrameworkConstatnt;

public class ReadExcelFile implements FrameworkConstatnt{

	public  FileInputStream fis = null;
	public  FileOutputStream fos = null;
	public  Workbook wb = null;

	public  String readSingleData(String Sheetname, int Row, int Cell) {

		// 1.Convert the Physical file into Java Redable Format.
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create the Workbook using WorkbookFactory.
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

		// 3.Using workbook get the Sheet Control.
		// 4.Using sheet get the Row control.
		// 5.Using Row get the Cell/Column Control
		// 6.Using Cell/Column Get the Cell data.
		String data = wb.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		return data;

	}

	public  void readMultipleData(String Sheetname) {
		// 1.Convert the Physical file into Java Redable Format.
				try {
					fis = new FileInputStream(excelpath);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				// 2.Create the Workbook using WorkbookFactory.
				try {
					wb = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e) {
					e.printStackTrace();
				}

				// 3.Using workbook get the Sheet Control.
				// 4.Using sheet get the Row control.
				// 5.Using Row get the Cell/Column Control
				// 6.Using Cell/Column Get the Cell data.
				int rowcount = wb.getSheet(Sheetname).getLastRowNum();
				for(int i=0;i<rowcount;i++) {
				String data = wb.getSheet(Sheetname).getRow(i).getCell(1).getStringCellValue();
				} 
				

	}

	public  void writeData(String Sheetname, int Row, int cell, String data) {

		// 1.Convert the Physical file into Java Redable Format.
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.Create the Workbook using WorkbookFactory.
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

		// 3.Using workbook get the Sheet Control.
		// 4.Using sheet get the Row control.
		// 5.Using Row Create the Column.
		// 6.Using Cell/Column set ythe Cell data
		wb.getSheet(Sheetname).getRow(Row).createCell(cell).setCellValue("./src/test/resourses/TestData/EmpDetails.xlsx");

		// 7.Convert java readble file into physical file
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 8.Write the Data
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 9.Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
