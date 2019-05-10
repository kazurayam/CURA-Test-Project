import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.apache.commons.lang3.time.StopWatch

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl("http://${GlobalVariable.Hostname}/")

// ホーム・ページが開く
WebUI.verifyElementPresent(findTestObject('Page_CuraHomepage/a_Make Appointment'),
	10, FailureHandling.STOP_ON_FAILURE)


// Make AppointmentボタンをクリックしてLogin画面を呼び出しUsernameとPasswordを入力しログインするまでを
// 別のTest Caseで実行する

stopWatch = new StopWatch()
stopWatch.start()
WebUI.callTestCase(findTestCase('Common/Login'),
	[
		'Username': GlobalVariable.Username,
		'Password': GlobalVariable.Password
	],
	FailureHandling.STOP_ON_FAILURE)
stopWatch.stop()
WebUI.comment("Call to Comon/Login took ${stopWatch.getTime()} milliseconds")

WebUI.closeBrowser()