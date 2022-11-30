package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafrmExcel {
   
	 public static String[][] readData(String ExcelFilename) throws IOException {
// steps for  Dynamic data parameterization using excel
		 // 1. open the workbook using filename and the path
		 // 2. Goto specific sheet (by sheet name /Index)
		 // 3. Goto specific Row(by index)
		 // 4. Goto specific column (by index-->Cell)
		 // 5. Read the content
		 
		 XSSFWorkbook wb = new XSSFWorkbook("data/"+ExcelFilename+".xlsx");
		 XSSFSheet sheet = wb.getSheetAt(0);
		 int rowCount = sheet.getLastRowNum(); //get the total row count ,will ignore the header in the xls
		 int columnCount = sheet.getRow(0).getLastCellNum();
		 System.out.println(rowCount+" "+columnCount);
		 String[][] data =new String [rowCount][columnCount];	
		 
    // Read the data from xls	 
		 for(int i=1; i<=rowCount; i++) {
	        	XSSFRow row = sheet.getRow(i);
	        	for(int j=0;j<columnCount;j++) {
	        		XSSFCell cell = row.getCell(j);
	        		System.out.println(cell.getStringCellValue());
	        		data[i-1][j]=cell.getStringCellValue();
//	        		System.out.println(readData[i-1][j]);
	        	}
	        }
		wb.close(); 
		return data;//this is to supply data to each class from the array
    }
	 
}
