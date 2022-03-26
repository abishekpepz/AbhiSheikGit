package org.base;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewReusable {
	
	public static WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public void deselectByVsibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectByVsibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		return options;
	}

	public List<WebElement> getFirstSelectedOptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		return options;
	}

	public Boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public void moveToElement(WebElement element) {
		Actions obj = new Actions(driver);
		obj.moveToElement(element);
	}

	public void contextClick(WebElement element) {
		Actions obj = new Actions(driver);
		obj.contextClick(element);
	}

	public void doubleClick(WebElement element) {
		Actions obj = new Actions(driver);
		obj.doubleClick(element);
	}

	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findElementBytagName(String tagName) {
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;
	}

	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public List<WebElement> findElements(String tagName) {
		List<WebElement> l = driver.findElements(By.tagName(tagName));
		return l;
	}

	public void javaScriptExecutor(String text, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + ")", element);
	}

	public void javaScriptExecutorClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void javaScriptExecutorScrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void javaScriptExecutorScrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void javaScriptExecutorAttribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);
	}

	public void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateforward() {
		driver.navigate().forward();
	}

	public void navigateRefrsh() {
		driver.navigate().refresh();
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void click(WebElement element) {
		element.click();
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public void getScreenshotAs() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		tk.getScreenshotAs(OutputType.FILE);
	}

	public void get(String url) {
		driver.get(url);
	}

	public void maxmize() {
		driver.manage().window().maximize();
	}

	public WebDriver defaultContent(WebElement element) {
		WebDriver content = driver.switchTo().defaultContent();
		return content;
	}

	public WebDriver parentFrame() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}

	public WebDriver frameUsingId(String name) {
		WebDriver frame = driver.switchTo().frame(name);
		return frame;
	}

	public WebDriver frameUsingIndex(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}

	public WebDriver frameUsingName(String name) {
		WebDriver frame = driver.switchTo().frame(name);
		return frame;
	}

	public WebDriver frameUsingName(WebElement element) {
		WebDriver frame = driver.switchTo().frame(element);
		return frame;
	}

	public WebDriver windowHandleTitle(String title) {
		WebDriver window = driver.switchTo().window(title);
		return window;
	}

	public WebDriver windowHandleUrl(String url) {
		WebDriver window = driver.switchTo().window(url);
		return window;
	}

	public WebDriver windowHandleId(String id) {
		WebDriver window = driver.switchTo().window(id);
		return window;
	}
	public void  OptionByAttributeValue(WebElement element, String value) {
		new Select(element).selectByValue(value);

	}

}

