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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://oficinaenlineauat.libertycolombia.com/_layouts/15/liberty/libertylogin.aspx?ReturnUrl=%2f_layouts%2f15%2fAuthenticate.aspx%3fSource%3d%252F&Source=%2F')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Inicio de sesin/input_CC_idUser'), '12345500')

WebUI.setEncryptedText(findTestObject('Object Repository/eBonds/Page_Inicio de sesin/input_CC_contrasena'), 'JgwA2js0hLOHEwOEB2qSVA==')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Inicio de sesin/input_CC_BtnIniciarSesion'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Pages - MisNegocios/img_Ingresar a Pliza Express_cat-img Fianzas'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Pages - Home/a_Cotiza y emite'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Pages - MisNegocios/div_Cumplimiento'))

WebUI.selectOptionByValue(findTestObject('Object Repository/eBonds/Page_Pages - MisNegocios/select_90833 - Clave Principal'), 
    '90833', true)

WebUI.click(findTestObject('Object Repository/eBonds/Page_Pages - MisNegocios/input_Selecciona la clave_btn btnsubmit'))

WebUI.switchToWindowTitle('Cumplimiento Póliza Express')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Nueva cotizacin'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Tipo de documento_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Cedula Ciudadania'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Tipo de documento_mat-input-0'), 
    '1234567898')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Validar'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Ingrese el nombre del consorcio_mat-input-2'), 
    'PRUEBA')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Segundo nombre (opcional)_mat-input-4'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Mujer_mat-input-6'), '16/09/1997')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_DaMesAo_mat-input-7'), 'BOGOT')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_11001 - Bogota DC-Bogota'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Direccin'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Ciudad_mat-input-9'), 'CALLE 72 # 10 07')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Direccin_mat-input-10'), '12345676')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Guardar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/mat-icon_add'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Tipo de documento'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Nit'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Tipo de documento_mat-input-11'), 
    '8909039388')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Validar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Guardar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Entendido'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Licitacin'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Tipo de Pliza'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Particular'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Tipo de contrato'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Licitacion'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Tipo de contrato_mat-input-16'), 
    '7654323456')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Nmero de Contrato_mat-input-17'), 
    'BOG')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_11001 - Bogota DC-Bogota'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Ingresa el plazo contractual_mat-input-18'), 
    '20/07/2019')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Fecha hasta'))

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Created with sketchtool_mat-input-19'), 
    '20/01/2020')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Ingresa el plazo contractual_mat-input-18'), 
    '13/09/2019')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/input_Min 100000 - Max 500000000_mat-input-22'), 
    '14/09/2019')

WebUI.setText(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/textarea_DaMesAo_mat-input-21'), 
    'ASDFGFDSASDFGHGFDSXDCFVGHJVCXFVXVGFDHGFD')

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Mostrar detalle'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_Editar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Valor de prima_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/div_Valor asegurado_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/strong_Arrastre archivos para adjuntar o  buscar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/strong_Arrastre archivos para adjuntar o  buscar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/strong_Arrastre archivos para adjuntar o  buscar'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/button_Emitir'))

WebUI.click(findTestObject('Object Repository/eBonds/Page_Cumplimiento Pliza Express/span_21001583'))

