package com.test.designpattern23demo.prototype_pattern.login;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.prototype_pattern.login
 * @class: User
 * @author: 陆伟
 * @Date: 2017/4/3 10:49
 * @desc： 用户Bean
 */
public class User {

    public int age;
    public String name;
    public String phoneName;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
