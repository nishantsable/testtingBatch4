import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class abc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("file:///C:/Users/nISHI/Desktop/New%20folder%20%282%29/OpenWindow.html");
		Select s =new Select(driver.findElement(By.xpath(".//*[@id='Select1']")));
		
		s.selectByVisibleText("Pune");
		s.selectByValue("ADI");
		s.selectByIndex(1);
		
		
	List<WebElement> e = s.getOptions();
	
	for(WebElement f : e)

	{
		System.out.println(f.getText());
	}
	
	WebElement e2 = driver.findElement(By.xpath(".//*[@id='myRegistractionForm']/input[5]"));
	
	if(e2.isSelected()){
		
		System.out.println("No need ");
		
		
	}else{
		
		e2.click();
	}
	*/
		
		driver.findElement(By.xpath(".//*[@id='btnConfirm']")).click();
	
	
	String parentwin = driver.getWindowHandle();
	
	System.out.println(parentwin);
	
	Set<String> childWins = driver.getWindowHandles();
	
	System.out.println(childWins);
	
	for(String win :childWins ){
		
		System.out.println(win);
		
		if(!win.equals(parentwin)){
			
			driver.switchTo().window(win);
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("selenium");
			
			
			Thread.sleep(5000);
		}
	}
	
	driver.switchTo().window(parentwin);
	
	
	driver.findElement(By.xpath(".//*[@id='numb']")).sendKeys("OnParent");
	
	
	driver.findElement(By.cssSelector("input#btnAlert")).click();
	
	Alert a =driver.switchTo().alert();
	

	a.accept();
	
	
	
	
	
	
	
	
	
	
	}

}
