package vip.wush.dubbo.server.provider;

import vip.wush.dubbo.server.api.HessianProtocolService;
import vip.wush.dubbo.server.api.model.Person;

/**
 * @ClassName: HessianProtocolServiceImpl
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 15:28
 */

public class HessianProtocolServiceImpl implements HessianProtocolService {

    @Override
    public String sayHello(String msg) {

        return "Hello: " + msg + ", I'm dubbo";
    }

    @Override
    public Person getPersonInfo() {
        Person person = new Person();
        person.setAge(25);
        person.setName("wushaohe");
        return person;
    }
}
