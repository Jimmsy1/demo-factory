package factory.factorymethod;


import factory.ApplePhone;
import factory.Iphone;

public class AppleFactory implements IPhoneFactory {

    public Iphone create() {
        return new ApplePhone();
    }
}
