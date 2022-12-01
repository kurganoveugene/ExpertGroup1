package browser;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public  class Wait {

   public WebDriverWait getWait() {
      WebDriverWait wait  = null;
      try {
          wait = new WebDriverWait(DriverSingletonClass.getInstance(), Duration.ofSeconds(8));
      } catch (Exception e) {e.printStackTrace();}

      return wait;
   }
}
