package datadrivenFramework;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FetchDataFromExcelSheet {
	public static void main(String[] args) throws Exception {	
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\KCSM22TestCases.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter format = new DataFormatter();		
	String data =	format.formatCellValue(sh.getRow(3).getCell(3));
		System.out.println(data);
	}
}







