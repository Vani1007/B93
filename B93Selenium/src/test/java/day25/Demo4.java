package day25;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {

	public static void main(String[] args) throws Exception {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book3.xlsx"));
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
					String v = wb.getSheet("sheet1").getRow(i).getCell(j).toString();
					System.out.print(v+" ");
			}
		
			System.out.println();
		}
		wb.close();

	}

}
