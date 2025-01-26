 package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public static String getDataFromProperty(String path, String key) throws IOException {
		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
	}

	public static String getDataFromExcel(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

	public static Object[][] readExcel(String path, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();// 6
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();// 2
		Object[][] data = new Object[row - 1][cell];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;

	}

} 