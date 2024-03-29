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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://goldgrizzly.com/')

WebUI.setText(findTestObject('Object Repository/GoldGrizzly Domain Name Search/Page_Gold Grizzly/input_Search_q'), 'Waygreen')

WebUI.click(findTestObject('Object Repository/GoldGrizzly Domain Name Search/Page_Waygreen  Gold Grizzly/button_Search'))

WebUI.click(findTestObject('Object Repository/GoldGrizzly Domain Name Search/Page_Waygreen  Gold Grizzly/img_concat(Your search for   W'))

WebUI.click(findTestObject('Object Repository/GoldGrizzly Domain Name Search/Page_Waygreen.com  Gold Grizzly/img_Check Out_HeaderLogo'))

WebUI.closeBrowser()

