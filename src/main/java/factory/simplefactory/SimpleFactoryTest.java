package factory.simplefactory;

import factory.ApplePhone;
import factory.Iphone;

public class SimpleFactoryTest {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        Iphone iphone = phoneFactory.create(ApplePhone.class);
        iphone.produce();
    }
}
