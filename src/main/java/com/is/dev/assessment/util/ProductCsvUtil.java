package com.is.dev.assessment.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.is.dev.assessment.domain.Product;
//import com.opencsv.bean.CsvToBeanBuilder;


public class ProductCsvUtil {
	
	//Contains all (is always good to store the original list)
	List<Product> products = new ArrayList<Product>();
	//Unique products by the SKU
	List<Product> uniqueValues = new ArrayList<Product>();
	
	//Reading the CVS file and parsing it into Product objects
	public void cvsTvsReader (String csvFile)  {
		
		if (!csvFile.isEmpty() && csvFile != null ) {
			
			//Creating the object inside of this if to do not waste memory in case they don't pass a file
			BufferedReader br = null;
			String currentLine = "";
			Product product;
			String[] tempProduct;
			String splitter;
			
			//Checking if it's a .cvs or tsv. This way the method knows how to read the lines.
			if(csvFile.contains(".csv")) {
				//This regex will handle the commas inside "". e.g "Anemone Pouch, Khaki"
				splitter = ",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)";
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
					/*Storing it in a temp variable just to make it more readable but I could have pass it to the
					 * product object like this e.g currentLine.split(splitter)[0],currentLine.split(splitter)[1]...
					*/
					tempProduct = currentLine.split(splitter);
					product = new Product(
							tempProduct[0],
							tempProduct[1],
							tempProduct[2],
							tempProduct[3],
							tempProduct[4],
							tempProduct[5]
									);
					
					//Passing values from .CSV since this data is more accurate info
					if(csvFile.contains(".csv")) {
						products.add(product); 
					}					
					
					/*System.out.println(
							" Title: " + product.getTitle() + 
							" UPC: " + product.getUpc() +
							" SKU: " + product.getSku() + 
							" Price: " + product.getPrice() +
							" Condition: " + product.getCondition() + 
							" Quantity: " + product.getQuantity()
							); */
					
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
	
	//Removes Products with duplicate SKUs
	public void isItUnique () {
		
		LinkedHashSet<String> skus = new LinkedHashSet<String>();  
		List<Product> allTheDuplicates = new ArrayList<Product>();
		
		for(Product product:products ) {
			if(skus.contains(product.getSku())){
				allTheDuplicates.add(product);
			}
			skus.add(product.getSku());
		}
		
		uniqueValues.addAll(products);
		uniqueValues.removeAll(allTheDuplicates);

	}	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}


	public List<Product> getUniquevalues() {
		return uniqueValues;
	}


	public void setUniquevalues(ArrayList<Product> uniquevalues) {
		this.uniqueValues = uniquevalues;
	}
	
}
