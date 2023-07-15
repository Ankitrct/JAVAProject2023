package stepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import io.cucumber.java.en.Given;

public class LoadExcelFilestepDef {

	@Given("User access the excel file column values")
	public void user_access_the_excel_file_column_values() throws IOException, InvalidFormatException {

		String filepath = "src/test/resources/Files/Data_To_Load.xlsx";

		FileInputStream fs = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sheet = wb.getSheetAt(0);
		// int rows = sheet.getLastRowNum();
		// int cols = sheet.getRow(1).getLastCellNum();

		Iterator<Row> row_itr = sheet.iterator(); // iterate in rows
		XSSFRow row;
		while (row_itr.hasNext()) {
			row = (XSSFRow) row_itr.next();

			int headerrow = row.getRowNum();
			if (headerrow == 0) {
				System.out.println("if case");
				row = (XSSFRow) row_itr.next();
			}

			Iterator<Cell> cell_itr = row.cellIterator(); // iterate in cells of the row using cell iterator

			while (cell_itr.hasNext()) {
				XSSFCell cell = (XSSFCell) cell_itr.next();

				switch (cell.getCellType()) {
				case STRING:
					if (cell.getColumnIndex() == 1) {
						String emp_name = (cell.getStringCellValue());
						System.out.println("Employee name is " + emp_name);

					}

				case NUMERIC:
					if (cell.getColumnIndex() == 0) {
						double emp_id = (cell.getNumericCellValue());
						System.out.println("Emp id is " + emp_id);

					}

					else if (cell.getColumnIndex() == 2) {
						double emp_salary = (cell.getNumericCellValue());
						System.out.println("Emp salary is " + emp_salary);

					} else if (cell.getColumnIndex() == 3) {
						double emp_age = (cell.getNumericCellValue());
						System.out.println("Emp age is " + emp_age);

					}

				default:
					break;
				}

			}

		}

		wb.close();
	}

}
