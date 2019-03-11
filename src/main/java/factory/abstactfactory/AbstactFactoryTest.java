package factory.abstactfactory;

import factory.Iphone;

public class AbstactFactoryTest {
    public static void main(String[] args) {
        IProduceFactory iProduceFactory = new AppleFactory();
        IHeadset iHeadset = iProduceFactory.createHeadset();
        Iphone iphone = iProduceFactory.createPhone();
        IScreen iScreen = iProduceFactory.createScrenn();

        iHeadset.produce();
        iphone.produce();
        iScreen.produce();
    }
}
