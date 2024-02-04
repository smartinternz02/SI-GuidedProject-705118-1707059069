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
//open browser
WebUI.openBrowser('')
//url
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
//maximize the window
WebUI.maximizeWindow()
// click on make a appointment button
WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/Page_CURA Healthcare Service/Page_CURA_Make_Appointment/a_Make Appointment'))
//enter username
WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/Page_CURA Healthcare Service/Page_CURA_Make_Appointment/input_Username_username'), 
    'John Doe')
//enter password
WebUI.setText(findTestObject('Object Repository/Page_CURA_Healthcare_Service/Page_CURA Healthcare Service/Page_CURA_Make_Appointment/input_Password_password'), 
    'ThisIsNotPassword')
//click on login button
WebUI.click(findTestObject('Object Repository/Page_CURA_Healthcare_Service/Page_CURA Healthcare Service/Page_CURA_Make_Appointment/button_Login'))
//close browser
WebUI.closeBrowser()

