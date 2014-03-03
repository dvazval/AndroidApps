package com.example.invmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import android.content.res.Resources;


public class ReadExcel {
	
	public ReadExcel(){
		
	}
	
	
	public void leerArchivo(String rutaArchivo){
		
		File excel =  new File ("assets/Catalogo1.xlsx");
 
	    FileInputStream fis;
		try {
			 fis = new FileInputStream(excel);
			 HSSFWorkbook wb = new HSSFWorkbook(fis);
		     HSSFSheet ws = wb.getSheet("Input");
		     int rowNum = ws.getLastRowNum() + 1;
		     int colNum = ws.getRow(0).getLastCellNum();
		     String [][] data = new String [rowNum] [colNum];
	
		     for(int i = 0; i <rowNum; i++){
		         HSSFRow row = ws.getRow(i);
		             for (int j = 0; j < colNum; j++){
		                 HSSFCell cell = row.getCell(j);
		                 String value = cell.toString();
		                 data[i][j] = value;
		                 System.out.println ("the value is " + value);
		             }
		     }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }