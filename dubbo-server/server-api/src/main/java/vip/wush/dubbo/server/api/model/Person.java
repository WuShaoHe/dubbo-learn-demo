package vip.wush.dubbo.server.api.model;

import java.io.Serializable;

/**
 * @ClassName: people
 * @Description: TODO
 * @Author: wush
 * @Date: 2019/7/17 17:56
 */

public class Person implements Serializable {

    private static final long serialVersionUID = 8469820005073274846L;

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
