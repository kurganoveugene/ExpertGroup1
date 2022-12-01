package pageObjects;

import browser.DriverSingletonClass;
import elements.BaseElement;


public abstract class BaseForm {

    BaseElement uniqueElement;

    public BaseForm(BaseElement element) {
        this.uniqueElement = element;
    }

    public boolean isOpen() {
        // Todo - написать проверку загрузился ли
        // return uniqueElement.exists();
        return DriverSingletonClass.getInstance().findElements
                (uniqueElement.getLocator()).size() > 0 ;
    }
}
