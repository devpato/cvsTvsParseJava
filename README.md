# Developer Assessment - Integrations
This assessment gauges development skills regarding data transformation and coding practices relating to integrations. 

# Rules
1. ALL CODE MUST BE WRITTEN INDEPENDENTLY BY YOU. Any applicant that copies code directly will disqualify his/her candidacy. 
2. You can leverage online resources to help, but must write original code.
3. You can add any necessary PUBLIC MAVEN dependencies by adding them into the pom.xml file

# Given information : 
1. You are given two input files : 
- products.csv
- products.tsv
2. These files contain a list of products
3. The CSV and TSV are both valid formats
4. A product's uniqueness is determined by it's SKU (if two products have the same SKU, then they are the same product)
5. products.csv contains more accurate information than products.tsv
6. The provided project is a Maven project and should remain in this structure
7. PUBLIC MAVEN third party libraries are allowed for parsing & transforming data


# Building your project
        
        mvn package

This will create a .jar file named dev-assessment-1.0.jar in the /target directory

# Running your build (.jar file)

        java -jar dev-assessment-1.0.jar

We will run the above commands to build/run your assessment. Please ensure running these commands works before submitting your project.


# Your assessment is : 
1. Parse the CSV and TSV files into Product objects
2. Store all UNIQUE products in memory (with the most accurate information)
3. Transform these products into two different data formats, JSON and XML
4. Output these transformations to products.json and products.xml files
5. Zip up your entire project (with source code) and send it for review


# This will be assessed on :
- (required) Entire project zipped (with source code) 
- (15%) mvn package & java -jar dev-assessment-1.0.jar both work without errors
- (15%) products.json and products.xml are in the proper format
- (20%) Method used to parse the CSV
- (20%) Method used to transform the data into JSON / XML
- (10%) Error handling
- (20%) General coding style

# Hints
- A CSV record may contain a comma in it that's not a delimiter 
- XML files always require a root node

# Closing remarks
If you are unsure about anything - please make your best assumption and document that assumption in assumptions.txt file provided
