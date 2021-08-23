package com.xworkz.hibernate.mall;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteOprationInExcel {

	public static void main(String[] args) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("PalaceDTO");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"Id", "name", "location","noOfStalls","hasPVR"});
        data.put("2", new Object[] {1,"Phoenix","WhiteField",45,true});
        data.put("3", new Object[] {2,"Mantri","Malleshwaram",20,true});
        data.put("4", new Object[] {3,"Orion Mall","Rajkumar raod",16,true});
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
         
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String)obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
	        try {
	        	File file = new File("C:\\Users\\Admin\\OneDrive\\Documents\\Mall_Project.xlsx");
				FileOutputStream fos = new FileOutputStream(file);
	            wb.write(fos);
	            fos.close();
	            System.out.println("Written successfully on sheet");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
        }

	}

}
