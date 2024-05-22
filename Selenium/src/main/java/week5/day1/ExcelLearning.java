package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelLearning {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

	
		        XSSFWorkbook workbook = new XSSFWorkbook("testdata/CreateLead.xlsx");

		        XSSFSheet sheet = workbook.getSheetAt(0);

		        int rowcnt = sheet.getLastRowNum();
		        int columncnt = sheet.getRow(0).getLastCellNum();

		        for (int i = 0; i <= rowcnt; i++) {

		            XSSFRow datarow = sheet.getRow(i);
		            for (int j = 0; j < columncnt; j++) {

		                XSSFCell cell = datarow.getCell(j);
		                String value = cell.getStringCellValue();

		                System.out.println(value);
		            }
		        }
		        workbook.close();
		 
	}
	}
