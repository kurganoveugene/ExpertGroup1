package elements;

import org.openqa.selenium.By;

public class Frame2 extends BaseElement{

    private By locator = By.xpath("//iframe[@id='frame2']");
    private String elementName = "Frame2 on Frames page";
    private TextInFrame textInFrame = new TextInFrame();

    public Frame2() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

    public TextInFrame getTextInFrame() {
        return textInFrame;
    }
}
