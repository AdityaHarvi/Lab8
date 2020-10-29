package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta", "CAN");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan", "CAN"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan", "CAN")));
    }

    @Test
    void testChangeCountry() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.getCities().get(0).setCountry("USA");

        assertEquals("USA", cityList.getCities().get(0).getCountryName());
    }
}
