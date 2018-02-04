package com.is.dev.assessment.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.is.dev.assessment.domain.Product;
import com.opencsv.bean.CsvToBeanBuilder;


public class ProductCsvUtil {
	

	//Reading the CVS file and parsing it into Product objects
	public void cvsTvsReader (String csvFile)  {
		
		if (!csvFile.isEmpty() && csvFile != null ) {
			
			//Creating the object inside of this if to do not waste memory in case they don't pass a file
			BufferedReader br = null;
			String currentLine = "";
			Product product;
			String[] tempProduct;
			ArrayList<Product> products = new ArrayList<Product>();
			String splitter;
			
			//Checki
			if(csvFile.contains(".csv")) {
				splitter = ",";
			} else {
				splitter = "\t";
			}
			
			try {
				
				br = new BufferedReader(new FileReader(csvFile));
				
				//Grabbing first line
				currentLine = br.readLine();
				
				//Skipping first line (the titles of the columns)
				currentLine = br.readLine();
				
				while( currentLine != null) {
					tempProduct = currentLine.split(splitter);
					product = new Product(
							tempProduct[0],
							tempProduct[1],
							tempProduct[2],
							tempProduct[3],
							tempProduct[4],
							tempProduct[5]
									);
					
					products.add(product);
					System.out.println(
							" Title: " + product.getTitle() + 
							" UPC: " + product.getUpc() +
							" SKU: " + product.getSku() + 
							" Price: " + product.getPrice() +
							" Condition: " + product.getCondition() + 
							" Quantity: " + product.getQuantity()
							);
					
					//Read next line;
					currentLine = br.readLine();
				}
				
			//Error catchers	
			} catch (FileNotFoundException e) {
				e.printStackTrace();				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				
				//Closing the buffer
				if(br  != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}	
		
	}	
}
