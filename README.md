# Nagwa-ui-automation-test-selenium
Implementation of Q4 in Nagwa software QC engineer task

This project is written in page object model framework using Maven, Selenium, Java, Testng. There are the five pages passed in requested scenario.

Elements are located using By locators and mostly by xpath. A conditional wait is added before each findElement to prevent element locating before the page has rendered.

The wait is 60s max with the driver checking the presence of the element every 5s.

The base class contains the setup of the driver according to put url and desired browser, only 2 browsers options where implemented, and the setup gets the main url and returns a langPage.

GetNumberOfQsTest executes the requested test by initializing pages and calling the action methods and passing them the parameters.



How to use:

-First make sure that the browser driver .exe files' versions are compatible with your browsers' versions and update them if not.

-Then put your desired values in testng.xml file parameters (browser, language, searched lesson, lesson number).

-Then run the testng.xml file.
