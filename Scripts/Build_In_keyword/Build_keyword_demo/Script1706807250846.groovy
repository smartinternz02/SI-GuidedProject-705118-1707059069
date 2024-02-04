import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl("https://demo.guru99.com/test/newtours/")

// maximize window    Press Ctrl+ space bar -To list all built in keywords
WebUI.maximizeWindow()

// to capture ur URL

 String url= WebUI.getUrl()
 System.out.println(url)
 // window number
 System.out.println(WebUI.getWindowIndex())

 // display title of the window
System.out.println(WebUI.getWindowTitle())

WebUI.delay(6)

WebUI.navigateToUrl("https://www.kotak.com/en/home.html")

WebUI.delay(5)

// Take bace to newtour demo (previous window)
WebUI.back()

WebUI.delay(5)

WebUI.forward()

WebUI.delay(5)

// get the url of kotak
 System.out.println( WebUI.getUrl())
int windowno= WebUI.getWindowIndex()
System.out.println(windowno)
System.out.println(WebUI.getWindowTitle())


WebUI.navigateToUrl("https://www.quora.com/profile/Abhishek-Tr")

System.out.println( WebUI.getUrl())
int windowno1= WebUI.getWindowIndex()
System.out.println(windowno1)
System.out.println(WebUI.getWindowTitle())

WebUI.delay(5)

WebUI.click()

WebUI.delay(5)


WebUI.switchToWindowIndex(1)

System.out.println(WebUI.getWindowIndex())


WebUI.switchToWindowIndex(0)

WebUI.delay(5)
WebUI.back()


WebUI.delay(5)

// landed on mercury tour
WebUI.back()

// build logic to validate mercury tour Login
// capture the objects (with spy web)
// steps

// open browser
//give the url : https://demo.guru99.com/test/newtours/
//Enter use name
// enter password
//click on submit button
//verify the login successful element is present or not

// close browser
WebUI.closeBrowser()



