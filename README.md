# Developer Assessment - Integrations
This assessment gauges development skills regarding data transformation and coding practices relating to integrations. 


# Given information : 
1. You are given two input files : 
- products.csv
- products.tsv
2. These files contain a list of products
3. The CSV and TSV are both valid formats
4. A product's uniqueness is determined by it's SKU
5. products.csv contains more accurate information than products.tsv
6. Third party libraries are allowed for parsing & transforming data


# Your assessment is : 
1. Parse the CSV and TSV files into Product objects
2. Store all unique products in memory (with the most accurate information)
3. Transform these products into two different data formats, JSON and XML
4. Output these transformations to products.json and products.xml files
5. Send your final zip file with source files ONLY (include 3rd party libs)
6. Provide instructions on how to "run" the application from a unix terminal (consider how 3rd party libs are imported
   when running the application)


# This will be assessed on :
- Code properly zipped with only source code
- The "run" instructions provided work from unix terminal
- Output contains accurate product information
- JSON / XML formats are valid
- Method used to transform the data into JSON / XML
- General coding style


# Things to consider 
- It's better if the solution is packaged (executable JAR file or a run script attached)
- Library management (if you used external libs) - consider that we have to run this application and may not have the same libs on our machine as you.


# Closing remarks
The assessment should take anywhere from half and hour to 3 hours to complete. If you're unsure of a specific
requirement, write down your assumptions in "assumptions.txt" and continue forward. 

