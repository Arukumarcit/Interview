package Week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readExcelData(String excelname) throws IOException  {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook= new XSSFWorkbook("testdata/"+excelname+".xlsx");
		
        XSSFSheet sheet = workbook.getSheetAt(0);
        
        int rowcnt= sheet.getLastRowNum();
        int colcnt=sheet.getRow(0).getLastCellNum();
        
        String[][] data= new String[rowcnt][colcnt];
        
        for(int i=1;i<=rowcnt;i++) {
        	
        	XSSFRow row=sheet.getRow(i);
        	
        	for(int j=0;j<colcnt;j++) {
        		
        		XSSFCell eachcell=row.getCell(j);
        		String value=eachcell.getStringCellValue();
        		data[i-1][j]=value;
        	}
        	
        }
        workbook.close();
        
        return data;
        
	}

}
