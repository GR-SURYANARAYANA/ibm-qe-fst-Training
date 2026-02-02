### Activity 1

* Create a TestNG Class with the annotations
    * @Test
    * @BeforeClass
    * @AfterClass
* In the @BeforeClass method, create the a driver instance for FirefoxDriver
* Also use the get() method to open the browser with https://training-support.net
* In the @AfterClass method, use close() to close the browser once the test is done.

### Activity 2

* Create a TestNG Class with the annotations
* @Test
* @BeforeClass
* @AfterClass
* In the @BeforeClass method, create the a driver instance for FirefoxDriver
* Also use the get() method to open the browser with https://training-support.net/webelements/target-practice/
* In the @AfterClass method, use close() to close the browser once the test is done.
* Add 4 @Test methods.
* In the first @Test method, use getTitle() to get and assert the title of the page.
* In the second @Test method, use findElement() to look for the black button. Make an incorrect assertion. (This test case is meant to throw an error)
* For the third @Test method, skip it by setting it's enabled parameter to false.
* The third method will be skipped, but will not be shown as skipped.
* For the fourth @Test method, skip it by throwing a SkipException inside the method.
* The fourth method will be skipped and it will be shown as skipped.
* Observe the result in the console.

