import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Page_CuraHomepage/a_Make Appointment'))

WebUI.setText(findTestObject('Page_Login/input_username'), 'John Doe')

WebUI.setText(findTestObject('Page_Login/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.selectOptionByValue(findTestObject('Page_CuraAppointment/select_Tokyo CURA Healthcare C'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Page_CuraAppointment/input_hospital_readmission'))

WebUI.click(findTestObject('Page_CuraAppointment/input_programs'))

WebUI.setText(findTestObject('Page_CuraAppointment/input_visit_date'), '30/05/2018')

WebUI.setText(findTestObject('Page_CuraAppointment/textarea_comment'), 'This is a comment')

WebUI.click(findTestObject('Page_CuraAppointment/button_Book Appointment'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/p_Hongkong CURA Healthcare Cen'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/p_Yes'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/p_Medicaid'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/p_30052018'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/p_This is a comment'))

WebUI.click(findTestObject('Page_AppointmentConfirmation/a_Go to Homepage'))

WebUI.closeBrowser()

