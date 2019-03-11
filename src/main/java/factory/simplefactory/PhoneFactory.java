package factory.simplefactory;

import factory.Iphone;

public class PhoneFactory {

    public Iphone create(Class clazz){

        try {
            if(clazz != null){
                return (Iphone) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;


       /* if(name.equals("apple")){
            return new ApplePhone();
        }else if(name.equals("samsun")){
            return new SamsungPhone();
        }else{
            return null;
        }*/
    }
}
