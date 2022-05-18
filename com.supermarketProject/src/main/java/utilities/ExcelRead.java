package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead {

	public static FileInputStream f;
	public static XSSFWorkbook b;
	public static XSSFSheet s;
	
	public static String readStringData(int i,int j) throws IOException
	{
		f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\project.xlsx");
		b = new XSSFWorkbook(f);
		s= b.getSheet("sheet1");
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	public static String readIntegerData(int i,int j) throws IOException{
	
		f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\project.xlsx");
		b = new XSSFWorkbook(f);
		s= b.getSheet("sheet1");
		Row r = s.getRow(i);
		Cell c=r.getCell(i);
		
		int a=(int)c.getNumericCellValue();
		return String.valueOf(a);
		
	}
	
	}

