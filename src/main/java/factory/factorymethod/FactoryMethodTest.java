package factory.factorymethod;

import factory.Iphone;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IPhoneFactory phoneFactory = new AppleFactory();
        Iphone iphone = phoneFactory.create();
        iphone.produce();
    }
}
