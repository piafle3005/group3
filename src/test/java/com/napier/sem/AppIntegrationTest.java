package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

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
        app.getUseCase1("Europe");
        assertEquals(c1.name, "Germany");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.population, 83200000);
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
        app.getUseCase2("Western Europe");
        assertEquals(c1.name, "Germany");
        assertEquals(c1.region, "Western Europe");
        assertEquals(c1.population, 82164700);
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
        app.getUseCase3(3);
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 82164700);
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
        app.getUseCase5();
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 83200000);
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
        app.getUseCase7();
        assertEquals(c1.name, "Edinburgh");
        assertEquals(c1.population, 450180);
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
        app.getUseCase9("Germany");
        assertEquals(c1.name, "Munich");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.population, 1194560);
    }

    
}