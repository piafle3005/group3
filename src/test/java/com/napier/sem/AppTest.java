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
        app.printUseCase1(null);
    }

    @Test
    void printUseCase1TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestValidData()
    {
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
        City c1 = new City();


        cities.add(c1);
        app.printUseCase9(cities);
    }

    /**
     * Tests UseCase21
     */
    @Test
    void printUseCase21TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase21(null);
    }

    @Test
    void printUseCase21TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase21(capital);
    }

    @Test
    void printUseCase21TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase21(capital);
    }

    @Test
    void printUseCase21TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c21 = new Country();
        c21.name= "Edinburgh";
        c21.population= 558676;
        c21.continent = "Europe";
        capital.add(c21);
        app.printUseCase21(capital);
    }

}



