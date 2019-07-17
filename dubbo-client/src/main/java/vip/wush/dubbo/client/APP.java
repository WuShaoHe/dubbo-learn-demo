package vip.wush.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.wush.dubbo.server.api.IWUHello;

/**
 * @ClassName: APP
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 14:58
 */

public class APP {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-client.xml"});

        context.start();

        IWUHello demoService = (IWUHello)context.getBean("demoService"); // 获取远程服务代理


        String hello = demoService.sayHello("wush"); //执行远程方法
        System.out.println( hello ); // 显示调用结果

    }
}
