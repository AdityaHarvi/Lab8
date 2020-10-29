package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private String country;

    City(String city, String province, String country){
        this.city = city;
        this.province = province;
        this.country = country;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    String getCountryName() { return this.country; }

    void setCountry(String country) {

    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
