package Package1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DresspageObjects extends base {
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtcountfromheader;
	
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']/li"))
	private List<WebElement> listproductcount;
	
	@FindBy(linkText="S")
	private WebElement Ssize;
	
	@FindBy(linkText="M")
	private WebElement Msize;
	
	@FindBy(linkText="L")
	private WebElement Lsize;
	
	public DresspageObjects() {
		PageFactory.initElements(driver, this);
	}

	public int getcountfromheader(){
		String txt = txtcountfromheader.getText();
		String[] arr = txt.split(" ");
		txt = arr[2];
		int number = Integer.parseInt(txt);
		return number;
	}
	
	public int listproduct() {
		System.out.println(listproductcount.size());
		return listproductcount.size();
		
	}
	
	public boolean getSsizefrompanel(){
		return Ssize.isDisplayed();
	}
	
	
	public boolean getMsizefrompanel(){
		return Msize.isDisplayed();
	}
	
	public boolean getLsizefrompanel(){
		return Lsize.isDisplayed();
	}

}
