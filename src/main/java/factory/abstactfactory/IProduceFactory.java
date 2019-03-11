package factory.abstactfactory;

import factory.Iphone;

public interface IProduceFactory {

    /**
     * 创建手机
     * @return
     */
    public Iphone createPhone();

    /**
     * 创建屏幕
     * @return
     */
    public IScreen createScrenn();

    /**
     * 创建耳机
     */
    public IHeadset createHeadset();
}
