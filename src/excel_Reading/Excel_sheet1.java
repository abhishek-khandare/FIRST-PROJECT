package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	File MyFile = new File("F:\\Testing\\automation testing\\Automation\\excel reading example.xlsx");
	
	String name = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name);
		
	double name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
	System.out.println(name1);
	
	boolean name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
	System.out.println(name2);
}

}
