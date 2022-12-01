package elements;

import org.openqa.selenium.By;

public class Frame1 extends BaseElement{

    private By locator = By.xpath("//iframe[@id='frame1']");
    private String elementName = "Frame1 on Frames page";

    private TextInFrame textInFrame = new TextInFrame();

    public Frame1() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

    public TextInFrame getTextInFrame() {
        return textInFrame;
    }


}
