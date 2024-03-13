package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    /**
     * Tests UseCase1
     */
    @Test
    void printUseCase1TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase1(null);
    }

    @Test
    void printUseCase1TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.continent = "Europe";
        c1.population= 83200000;
        countries.add(c1);
        app.printUseCase1(countries);
    }

    /**
     * Tests UseCase2
     */
    @Test
    void printUseCase2TestNull()
    {
        app.printUseCase2(null);
    }

    @Test
    void printUseCase2TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase2(countries);
    }

    @Test
    void printUseCase2TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase2(countries);
    }

    @Test
    void printUseCase2TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.region = "Western Europe";
        c1.population= 82164700;
        countries.add(c1);
        app.printUseCase2(countries);
    }

    /**
     * Tests UseCase3
     */
    @Test
    void printUseCase3TestNull()
    {
        app.printUseCase3(null);
    }

    @Test
    void printUseCase3TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase3(countries);
    }

    @Test
    void printUseCase3TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase3(countries);
    }

    @Test
    void printUseCase3TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.population = 82164700;
        countries.add(c1);
        app.printUseCase3(countries);
    }

    /**
     * UseCase4 has the same print method like UseCase1
     */

    /**
     * Tests UseCase5
     */
    @Test
    void printUseCase5TestNull()
    {
        app.printUseCase5(null);
    }

    @Test
    void printUseCase5TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase5(countries);
    }

    @Test
    void printUseCase5TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase5(countries);
    }

    @Test
    void printUseCase5TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.population= 83200000;
        countries.add(c1);
        app.printUseCase5(countries);
    }

    /**
     * UseCase6 has the same print method like UseCase2
     */

    /**
     * Test UseCase7
     */

    @Test
    void printUseCase7TestNull()
    {
        app.printUseCase7(null);
    }

    @Test
    void printUseCase7TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase7(cities);
    }

    @Test
    void printUseCase7TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase7(cities);
    }

    @Test
    void printUseCase7TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name= "Edinburgh";
        c1.population= 450180;
        cities.add(c1);
        app.printUseCase7(cities);
    }

    /**
     * Test UseCase8
     */

    @Test
    void printUseCase8TestNull()
    {
        app.printUseCase8(null);
    }

    @Test
    void printUseCase8TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase8(cities);
    }

    @Test
    void printUseCase8TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase8(cities);
    }

    @Test
    void printUseCase8TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name= "Munich";
        c1.continent= "Europe";
        c1.population= 1194560;
        cities.add(c1);
        app.printUseCase8(cities);
    }

    /**
     * Test UseCase9
     */

    @Test
    void printUseCase9TestNull()
    {
        app.printUseCase9(null);
    }

    @Test
    void printUseCase9TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase9(cities);
    }

    @Test
    void printUseCase9TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase9(cities);
    }

    @Test
    void printUseCase9TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c9 = new City();
        c9.name = "Munich";
        c9.population = 1194560;
        c9.country = "Germany";
        cities.add(c9);
        app.printUseCase9(cities);
    }

    /**
     * Test UseCase10
     */
    @Test
    void printUseCase10TestNull()
    {
        app.printUseCase10(null);
    }

    @Test
    void printUseCase10TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase10(cities);
    }

    @Test
    void printUseCase10TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase10(cities);
    }

    @Test
    void printUseCase10TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c10 = new City();
        c10.name = "Munich";
        c10.district = "Baijeri";
        c10.population = 1194560;
        cities.add(c10);
        app.printUseCase10(cities);
    }

    /**
     * Test UseCase11
     */
    @Test
    void printUseCase11TestNull()
    {
        app.printUseCase11(null);
    }

    @Test
    void printUseCase11TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase11(cities);
    }

    @Test
    void printUseCase11TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase11(cities);
    }

    @Test
    void printUseCase11TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c11 = new City();
        c11.name = "Munich";
        c11.population = 1194560;
        cities.add(c11);
        app.printUseCase11(cities);
    }

    /**
     * Test UseCase12
     */
    @Test
    void printUseCase12TestNull()
    {
        app.printUseCase12(null);
    }

    @Test
    void printUseCase12TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase12(cities);
    }

    @Test
    void printUseCase12TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase12(cities);
    }

    @Test
    void printUseCase12TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c12 = new City();
        c12.name = "Munich";
        c12.population = 1194560;
        c12.continent = "Europe";
        cities.add(c12);
        app.printUseCase12(cities);
    }

    /**
     * Test UseCase13
     */
    @Test
    void printUseCase13TestNull()
    {
        app.printUseCase13(null);
    }

    @Test
    void printUseCase13TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase13(cities);
    }

    @Test
    void printUseCase13TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase13(cities);
    }

    @Test
    void printUseCase13TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c13 = new City();
        c13.name = "Munich";
        c13.population = 1194560;
        c13.continent = "Western Europe";
        cities.add(c13);
        app.printUseCase13(cities);
    }

    /**
     * Test UseCase14
     */
    @Test
    void printUseCase14TestNull()
    {
        app.printUseCase14(null);
    }

    @Test
    void printUseCase14TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase14(cities);
    }

    @Test
    void printUseCase14TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase14(cities);
    }

    @Test
    void printUseCase14TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c14 = new City();
        c14.name = "Munich";
        c14.population = 1194560;
        c14.country = "Germany";
        cities.add(c14);
        app.printUseCase14(cities);
    }

    /**
     * Test UseCase15
     */
    @Test
    void printUseCase15TestNull()
    {
        app.printUseCase15(null);
    }

    @Test
    void printUseCase15TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase15(cities);
    }

    @Test
    void printUseCase15TestContainsNull()
    {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase15(cities);
    }

    @Test
    void printUseCase15TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c15 = new City();
        c15.name = "Munich";
        c15.population = 1194560;
        c15.district = "Baijeri";
        cities.add(c15);
        app.printUseCase15(cities);
    }

    /**
     * Test UseCase16
     */
    @Test
    void printUseCase16TestNull()
    {
        app.printUseCase16(null);
    }

    @Test
    void printUseCase16TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase16(countries);
    }

    @Test
    void printUseCase16TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase16(countries);
    }

    @Test
    void printUseCase16TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c16 = new Country();
        c16.name = "Munich";
        c16.population = 1194560;
        countries.add(c16);
        app.printUseCase16(countries);
    }

}



