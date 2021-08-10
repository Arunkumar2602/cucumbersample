package org.step;

import java.util.concurrent.TimeUnit;

import org.base.ReusableClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends ReusableClass {
      ReusableClass reusable;     
	@Before
         public void beforeScenario() {
			getDriver("chrome");
			launchUrl("http://adactinhotelapp.com/index.php");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
//         @After
//         public void afterScenario(Scenario sc) throws InterruptedException {
//        	 
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//				sc.embed(screenshot, sc.getName()+ ".png");
//             
//			
//         
//
//		}

}