package pageObjects;

import elements.BaseElement;

public class FramesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrames();
    private DivFrames divFrames = new DivFrames();

    private Frame1 frame1 = new Frame1();
    private Frame2 frame2 = new Frame2();

    public FramesPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrames getDivFrames() {
        return divFrames;
    }
    public Frame1 getFrame1() {
        return frame1;
    }
    public Frame2 getFrame2() {
        return frame2;
    }
}
