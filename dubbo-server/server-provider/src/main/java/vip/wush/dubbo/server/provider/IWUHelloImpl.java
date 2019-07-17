package vip.wush.dubbo.server.provider;

import vip.wush.dubbo.server.api.IWUHello;

/**
 * @ClassName: IWUHelloImpl
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 15:28
 */

public class IWUHelloImpl implements IWUHello {

    @Override
    public String sayHello(String msg) {

        return "Hello: " + msg + ", I'm dubbo";
    }
}
