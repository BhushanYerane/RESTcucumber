package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	public ArrayList<String> getExcelData(String value1, String value2) throws IOException {
		
		ArrayList<String> al = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\byerane\\eclipse-workspace\\testData\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetcount = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetcount; i++) 
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("Sportz"))
			{
				XSSFSheet sheetname = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheetname.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell text = cell.next();
					if (text.getStringCellValue().equalsIgnoreCase("Email")) 
					{
						column = k;
					}
					k++;
				}
				while (rows.hasNext()) 
				{
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Append")) 
					{
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) 
						{
							al.add(cv.next().getStringCellValue());
							System.out.println(cv.next());
						}
					}
				}

			}

		}
		return al;
	}
	
	public static void main(String[] args) {
		
	}
}
