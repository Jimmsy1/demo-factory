package factory.abstactfactory;

import factory.*;

public class AppleFactory implements IProduceFactory {
    public Iphone createPhone() {
        return new ApplePhone();
    }

    public IScreen createScrenn() {
        return new AppleScreen();
    }

    public IHeadset createHeadset() {
        return new AppleHeadset();
    }
}
