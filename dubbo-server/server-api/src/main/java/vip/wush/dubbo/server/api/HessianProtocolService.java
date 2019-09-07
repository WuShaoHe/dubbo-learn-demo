package vip.wush.dubbo.server.api;

import vip.wush.dubbo.server.api.model.Person;

/**
 * @ClassName: HessianProtocolService
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 15:22
 */

public interface HessianProtocolService {

    String sayHello(String msg);


    Person getPersonInfo();
}
