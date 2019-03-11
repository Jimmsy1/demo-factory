package factory.factorymethod;

import factory.Iphone;
import factory.SamsungPhone;

public class SamsunFactory implements IPhoneFactory {
    public Iphone create() {
        return new SamsungPhone();
    }
}
