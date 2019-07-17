package vip.wush.dubbo.server.provider;

import com.alibaba.dubbo.container.Main;

/**
 * @ClassName: APP
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 15:38
 */

public class APP {

    public static void main( String[] args ) {

        //默认情况下会使用spring容器来启动服务
        Main.main(new String[]{"spring","log4j"});

    }
}
