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

'open the general store app'
Mobile.startExistingApplication(GlobalVariable.GeneralStore)

'click on the dropdown list'
Mobile.tap(findTestObject('Object Repository/TaskRepo/dropDownList'), GlobalVariable.TimeOut)

'select andorra country'
Mobile.tap(findTestObject('Object Repository/TaskRepo/andorraTxt'), GlobalVariable.TimeOut)

'set the name'
Mobile.setText(findTestObject('Object Repository/TaskRepo/nameTxtFld'), GlobalVariable.Name, GlobalVariable.TimeOut)

'click on male radio btn'
Mobile.tap(findTestObject('Object Repository/TaskRepo/maleRadioButton'), GlobalVariable.TimeOut)

'click on lets shop btn'
Mobile.tap(findTestObject('Object Repository/TaskRepo/letsShopBtn'), GlobalVariable.TimeOut)

itemName = Mobile.getText(findTestObject('Object Repository/TaskRepo/airJordan4RetroTxt'), GlobalVariable.TimeOut)

'click on add to cart'
Mobile.tap(findTestObject('Object Repository/TaskRepo/addToCartTxt'), GlobalVariable.TimeOut)

'click on cart btn'
Mobile.tap(findTestObject('Object Repository/TaskRepo/cartBtn'), GlobalVariable.TimeOut)

'verify item name'
Mobile.verifyElementText(findTestObject('TaskRepo/airJordan4RetroTxt'), 'Air Jordan 4 Retro')

'verify item price'
Mobile.verifyElementText(findTestObject('TaskRepo/airJordan4RetroPrice'), '$160.97')

'verify item image is exist'
Mobile.verifyElementExist(findTestObject('TaskRepo/airJordan4RetroImg'), GlobalVariable.TimeOut)

WebUI.verifyMatch(itemName, 'Air Jordan 4 Retro', false)

not_run: Mobile.closeApplication()

