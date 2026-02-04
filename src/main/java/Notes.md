#### How to tackle .xml test suit running in vs code.
##### This can be tackled by using maven CLI 

* Step 1: From below download the compactable maven version acc to OS
    * Maven CLI download: 
    * https://maven.apache.org/install.html
* Step 2:
    * Setup to Environment variable to Path
* Step 3:
    * Launch a cmd prompt and check maven version by using cmd `mvn -v`
    * Finally check if any failure recheck the path Correctly
* Step 4:
    * Launch the VS Code
    * Head over to extension and download `TestNg TestSuit Runner`
    * Run it through `cmd` prompt in vs code itself not with `vs terminal` powershell
    * Then left click on the file to run it Sucessfully.


Logging

To use the TestNG logging facility, we use the testng.Reporter Class.

It has a method named Reporter.Log() that outputs to the Console.

@Test
public void main() {

    driver.findElement(By.id("username")).sendKeys("User1");
    Reporter.log("Typing in Username");

    driver.findElement(By.id("password")).sendKeys("Test@123");
    Reporter.log("Typing in Password");

    driver.findElement(By.id("submitButton")).click();
    Reporter.log("Logging in");

    Reporter.log("Login successful.");

    driver.findElement(By.id("logoutButton")).click();
    Reporter.log("Loggin out");
}


Data-Driven Testing: CSV
//Load CSV file
CSVReader reader = new CSVReader(new FileReader("file.csv"));

//Load content into list
List<String[]> list = reader.readAll();


Following is a list of different Java Interfaces and classes in POI for reading XLS and XLSX file:

Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
XSSFWorkbook: Is a class representation of XLSX file.
HSSFWorkbook: Is a class representation of XLS file.
Sheet: XSSFSheet and HSSFSheet classes implement this interface.
XSSFSheet: Is a class representing a sheet in an XLSX file.
HSSFSheet: Is a class representing a sheet in an XLS file.
Row: XSSFRow and HSSFRow classes implement this interface.
XSSFRow: Is a class representing a row in the sheet of XLSX file.
HSSFRow: Is a class representing a row in the sheet of XLS file.
Cell: XSSFCell and HSSFCell classes implement this interface.
XSSFCell: Is a class representing a cell in a row of XLSX file.
HSSFCell: Is a class representing a cell in a row of XLS file.

Data-Driven Testing: POI
//For .xls files
Workbook workbook = new Workbook();
Sheet sheet = workbook.createSheet("Sheet Name");

//For .xlsx files
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Sheet Name");


