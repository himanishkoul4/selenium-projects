package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
    public static void main(String[] args) throws Exception {
        // Load the Excel file
        File src = new File("C:\\ApachePOI\\ApacheTestData.xlsx");
        FileInputStream fis = new FileInputStream(src);

        // Create workbook and sheet objects
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0); // Get the first sheet (index 0)

        // Read first cell of first row
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from Excel Sheet1 (Row 0, Cell 0): " + data0);

        // Read second cell of first row
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from Excel Sheet1 (Row 0, Cell 1): " + data1);

        // Close the workbook
        wb.close();
    }
}
