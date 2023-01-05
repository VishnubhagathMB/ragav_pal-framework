package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelutils( String excelpath, String sheetname)
	{ try {
		 workbook = new XSSFWorkbook(excelpath);
		 projectpath = System.getProperty("user.dir");
		 sheet = workbook.getSheet(sheetname);
		
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
			
		} 
	}
	
	public static void getRowcount() {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("num of rows:"+rowCount);
	
		
	}
	
	public static void getcelldata(int rowNum,int colNum ) {
		
		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(celldata);
		
		
	}
	public static void getcelldatanum(int rowNum, int colNum) {
		
		double celldat = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(celldat);
					
		}


	public static void main(String[] args) {
		getRowcount();
		getcelldata(0,0);
		getcelldatanum(1,0);

	}

} 
