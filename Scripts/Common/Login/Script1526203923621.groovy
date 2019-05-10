import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Page_CuraHomepage/a_Make Appointment'))
// ここでログイン・ページに遷移
WebUI.verifyElementPresent(findTestObject('Page_Login/button_Login'),
	10, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Login/input_username'), Username)
WebUI.setText(findTestObject('Page_Login/input_password'), Password)

WebUI.click(findTestObject('Page_Login/button_Login'))
// ここで入力ページに遷移
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/button_Book Appointment'),
	10, FailureHandling.STOP_ON_FAILURE)
