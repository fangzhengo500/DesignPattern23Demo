package com.test.designpattern23demo.prototype_pattern.login;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.prototype_pattern.login
 * @class: Address
 * @author: 陆伟
 * @Date: 2017/4/3 10:55
 * @desc： TODO
 */
public class Address {

    public String city;
    public String district;
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
