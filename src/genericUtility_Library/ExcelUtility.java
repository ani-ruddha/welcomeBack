package genericUtility_Library;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is for excel generic method
 * @author Aniruddha
 *
 */
public class ExcelUtility {
/**
 * this is a generic method to fetch data from Excel
 * @param worksheetName
 * @param rowNum
 * @param cellNum
 * @return
 * @throws Exception
 */
public String getDataFromExcel(String worksheetName , int rowNum , int cellNum) throws Exception
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(worksheetName);
		DataFormatter format = new DataFormatter();
		String data =	format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return data;
	}
}










