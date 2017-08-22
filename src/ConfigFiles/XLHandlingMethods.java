package ConfigFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;

public class XLHandlingMethods {
	
	public static HSSFWorkbook HWB;
	public static HSSFSheet HWS;
	public static int rowcount;
	public static HSSFRow row;
	public static HSSFCell col;
	public static String Cellvalue;
	//File Path Setting
	public static void setfilepath(String XLFilepath, String Sheetname) throws IOException
	{
		try{
		FileInputStream FIS = new FileInputStream(XLFilepath);
		HWB = new HSSFWorkbook(FIS);
		HWS = HWB.getSheet(Sheetname);
		}
		
		catch(Exception e)
		{
			System.out.println("read excel error message" +e);
		}
		
	}
	
	//Counting Row in Excel Sheet
		public static int rowcount()
		{
			
		rowcount = HWS.getLastRowNum();
		System.out.println("Rows Available in Excel Sheet : "+rowcount);
		return rowcount;
		}
		
		//Read Data From Excel File
		@SuppressWarnings("deprecation")
		public static String readdata(int rowindex, int cellindex)
		{
			try
			{
				HSSFRow row = HWS.getRow(rowindex);
				HSSFCell col = row.getCell(cellindex);							
				
				if(col.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					Cellvalue= NumberToTextConverter.toText(col.getNumericCellValue());
				}else if(col.getCellType() == Cell.CELL_TYPE_STRING)
				{
					Cellvalue=col.getStringCellValue();
				}
				return Cellvalue;
			}
			catch(Exception e)
			{
				System.out.println("Data Reading Exceptions : "+e);
				return "";
			}
		}
		
		
	}


