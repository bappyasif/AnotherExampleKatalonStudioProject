import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Google Search/Page_Google/input_- _q'), 'Automation')

WebUI.sendKeys(findTestObject('Google Search/Page_Google/input_- _q'), Keys.chord(Keys.ENTER), 
    FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Google Search/Spied Objects/Page_Google/input__btnK'))

WebUI.click(findTestObject('Google Search/Page_Automation - Google/div_Automation - Wikipedia'))

WebUI.click(findTestObject('Google Search/Page_Automation - Wikipedia/a_Outline of automation'))

WebUI.click(findTestObject('Google Search/Page_Outline of automation - Wikipe/span_Branches of automation'))

WebUI.click(findTestObject('Google Search/Page_Outline of automation - Wikipe/a_Autonomous automation'))

WebUI.closeBrowser()

