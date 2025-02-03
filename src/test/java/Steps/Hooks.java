package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {

   public static WebDriver driver;
@Before
    public void Setup(){
         driver=new EdgeDriver();


    }

@After
public void quit(){
        driver.quit();
}


}
