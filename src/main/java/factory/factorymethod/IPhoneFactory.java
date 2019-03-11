package factory.factorymethod;

import factory.Iphone;

public interface IPhoneFactory  {

    /**
     * 创建工厂
     */
    public Iphone create();
}
