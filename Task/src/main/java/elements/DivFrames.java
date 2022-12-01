package elements;

import org.openqa.selenium.By;

public class DivFrames extends BaseElement{

    private By locator = By.xpath("//div[contains(text(),'Frames')]");
    private String elementName = "Main header div - Frames";


    public DivFrames() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
