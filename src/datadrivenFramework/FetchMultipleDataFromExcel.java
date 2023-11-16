package datadrivenFramework;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FetchMultipleDataFromExcel {
	public static void main(String[] args)throws Exception {		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\KCSM22TestCases.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh  =	book.getSheet("Sheet3");
		DataFormatter format = new DataFormatter();		
		for(int i = 1 ; i<=sh.getLastRowNum() ; i++)
		{
		Row r =	sh.getRow(i);
		
		for(int j = 0 ; j<=r.getLastCellNum() ; j++)
		{
		String data =	format.formatCellValue(r.getCell(j));
		System.out.println(data);
		}
		}
	}
}











