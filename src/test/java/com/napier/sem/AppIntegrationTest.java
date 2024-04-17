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
    void printUseCase1TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase1(null);
        app.getUseCase1(null);
    }

    @Test
    void printUseCase1TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase1(countries);
        app.getUseCase1(" ");
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
        app.getUseCase1(" ");
    }

    @Test
    void printUseCase1TestValidData()
    {
        /**
         * Tests w
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
    void printUseCase2TestNull()
    {
        app.printUseCase2(null);
        app.getUseCase2(null);
    }

    @Test
    void printUseCase2TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase2(countries);
        app.getUseCase2(" ");
    }

    @Test
    void printUseCase2TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase2(countries);
        app.getUseCase2(" ");
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
    void printUseCase3TestNull()
    {
        app.printUseCase3(null);
        app.getUseCase3(0);
    }

    @Test
    void printUseCase3TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase3(countries);
        app.getUseCase3(8);
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
        app.getUseCase3(3);
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 82164700);
    }


    void printUseCase5TestNull()
    {
        app.printUseCase5(null);
        app.getUseCase5();
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
    void printUseCase7TestNull()
    {

        app.printUseCase7(null);
        app.getUseCase7();
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
    void printUseCase8TestNull()
    {
        
        app.printUseCase8(null);
        app.getUseCase8(null);
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
        app.getUseCase8("Germany");
        assertEquals(c1.name, "Munich");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.population, 1194560);
    }

    @Test
    void printUseCase9TestNull()
    {

        app.printUseCase9(null);
        app.getUseCase9(null);
    }
    
    @Test
    void printUseCase9TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "Paris";
        c1.country = "France";
        c1.population = 2125246;
        cities.add(c1);
        app.getUseCase9("France");
        app.printUseCase9(cities);
        assertEquals(c1.name, "Paris");
        assertEquals(c1.country, "France");
        assertEquals(c1.population,2125246 );
    }

    @Test
    void printUseCase10TestNull()
    {

        app.printUseCase10(null);
        app.getUseCase10(null);
    }
    @Test
    void printUseCase10TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "Abu Dhabi";
        c1.district = "Abu Dhabi";
        c1.population = 398695;
        cities.add(c1);
        app.printUseCase10(cities);
        app.getUseCase10("Abu Dhabi");
        assertEquals(c1.name, "Abu Dhabi");
        assertEquals(c1.district, "Abu Dhabi");
        assertEquals(c1.population, 398695);
    }

    @Test
    void printUseCase11TestNull()
    {

        app.printUseCase11(null);
        app.getUseCase11(0);
    }
    @Test
    void printUseCase11TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "London";
        c1.population = 7285000;
        cities.add(c1);
        app.printUseCase11(cities);
        app.getUseCase11(4);
        assertEquals(c1.name, "London");
        assertEquals(c1.population, 7285000);
    }

    @Test
    void printUseCase12TestNull()
    {

        app.printUseCase12(null);
        app.getUseCase12(0, null);
    }
    
    @Test
    void printUseCase12TestValidData()
    {
        ArrayList<City>cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "Amsterdam";
        c1.continent = "Europe";
        c1.population = 731200;
        cities.add(c1);
        app.printUseCase12(cities);
        app.getUseCase12(4,"Western Europe");
        assertEquals(c1.name, "Amsterdam");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.population, 731200);
    }

    @Test
    void printUseCase13TestNull()
    {

        app.printUseCase13(null);
        app.getUseCase13(0, null);
    }
    @Test
    void printUseCase13TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "Madrid";
        c1.region = "Southern Europe";
        c1.population = 2879052;
        cities.add(c1);
        app.printUseCase13(cities);
        app.getUseCase13(5,"Spain");
        assertEquals(c1.name, "Madrid");
        assertEquals(c1.population, 2879052);
        assertEquals(c1.region, "Southern Europe");
    }

    @Test
    void printUseCase14TestNull()
    {

        app.printUseCase14(null);
        app.getUseCase14(0, null);
    }
    @Test
    void printUseCase14TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c1 = new City();
        c1.name = "Glasgow";
        c1.country = "Scotland";
        c1.population = 619680;
        cities.add(c1);
        app.printUseCase14(cities);
        app.getUseCase14(7, "Scotland");
        assertEquals(c1.name, "Glasgow");
        assertEquals(c1.country, "Scotland");
        assertEquals(c1.population, 619680);
    }

    @Test
    void printUseCase15TestNull()
    {

        app.printUseCase15(null);
        app.getUseCase15(0, null);
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
        app.getUseCase15(2, "Baijeri");
        assertEquals(c15.name, "Munich");
        assertEquals(c15.population, 1194560);
        assertEquals(c15.district, "Baijeri");;
    }

    @Test
    void printUseCase16TestNull()
    {

        app.printUseCase16(null);
        app.getUseCase16();
    }
    @Test
    void printUseCase16TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<>();
        Country capital1 = new Country();
        capital1.name = "Moscow";
        capital1.population = 8389200;
        capital.add(capital1);
        app.printUseCase16(capital);
        app.getUseCase16();
    }

    @Test
    void printUseCase17TestNull()
    {

        app.printUseCase17(null);
        app.getUseCase17(0, null);
    }

    @Test
    void printUseCase17TestValidData()
    {
        ArrayList<City> capital = new ArrayList<City>();
        City c17 = new City();
        c17.name= "Edinburgh";
        c17.population= 558676;
        c17.country= "United Kingdom";
        capital.add(c17);
        app.printUseCase17(capital);
        app.getUseCase17(3, "United Kingdom");
        assertEquals(c17.name, "Edinburgh");
        assertEquals(c17.population, 558676);
        assertEquals(c17.country, "United Kingdom");
    }

    @Test
    void printUseCase18TestNull()
    {

        app.printUseCase18(null);
        app.getUseCase18(null);
    }
    @Test
    void printUseCase18TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c18 = new Country();
        c18.name= "Edinburgh";
        c18.population= 558676;
        c18.region="Lothian";
        capital.add(c18);
        app.printUseCase18(capital);
        app.getUseCase18("Lothian");
        assertEquals(c18.name, "Edinburgh");
        assertEquals(c18.population, 558676);
        assertEquals(c18.region, "Lothian");
    }

    @Test
    void printUseCase19TestNull()
    {

        app.printUseCase19(null);
        app.getUseCase19(null);
    }
    
    @Test
    void printUseCase19TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c19 = new Country();
        c19.name= "Edinburgh";
        c19.population= 558676;
        c19.continent = "Europe";
        capital.add(c19);
        app.printUseCase1(capital);
        app.getUseCase19("Europe");
        assertEquals(c19.name, "Edinburgh");
        assertEquals(c19.population, 558676);
        assertEquals(c19.continent, "Europe");
    }

    @Test
    void printUseCase20TestNull()
    {

        app.printUseCase20(null);
        app.getUseCase20(0);
    }
    
    @Test
    void printUseCase20TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c20 = new Country();
        c20.name= "Edinburgh";
        c20.population= 558676;
        capital.add(c20);
        app.printUseCase20(capital);
        app.getUseCase20(3);
        assertEquals(c20.name, "Edinburgh");
        assertEquals(c20.population, 558676);
    }

    @Test
    void printUseCase21TestNull()
    {

        app.printUseCase21(null);
        app.getUseCase21(0, null);
    }
    
    @Test
    void printUseCase21TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c21 = new Country();
        c21.name= "Edinburgh";
        c21.population= 558676;
        c21.continent = "Europe";
        capital.add(c21);
        app.printUseCase21(capital);
        app.getUseCase21(3, "Europe");
        assertEquals(c21.name, "Edinburgh");
        assertEquals(c21.population, 558676);
        assertEquals(c21.continent, "Europe");

    }

    @Test
    void printUseCase22TestNull()
    {

        app.printUseCase22(null);
        app.getUseCase22(0, null);
    }
    
    @Test
    void printUseCase22TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c22 = new Country();
        c22.name= "Edinburgh";
        c22.population= 558676;
        c22.region = "Lothian";
        capital.add(c22);
        app.printUseCase22(capital);
        app.getUseCase22(3, "Lothian");
        assertEquals(c22.name, "Edinburgh");
        assertEquals(c22.population, 558676);
        assertEquals(c22.region, "Lothian");
    }
    
    @Test
    void printUseCase23TestNull()
    {

        app.printUseCase23(null);
        app.getUseCase23();
    }
    
    @Test
    void printUseCase23TestValidData()
    {
        ArrayList<Population> population = new ArrayList<Population>();
        Population p23 = new Population();
        p23.region= "Lothian";
        p23.population= 10000;
        p23.population_c= 7000;
        p23.population_nc= 3000;
        population.add(p23);
        app.printUseCase23(population);
        app.getUseCase23();
        assertEquals(p23.region, "Lothian");
        assertEquals(p23.population, 10000);
        assertEquals(p23.population_c, 7000);
        assertEquals(p23.population_nc, 3000);
    }

    @Test
    void printUseCase24TestNull()
    {

        app.printUseCase24(null);
        app.getUseCase24();
    }
    
    @Test
    void printUseCase24TestValidData()
    {
        ArrayList<Population> population = new ArrayList<Population>();
        Population p24 = new Population();
        p24.name= "United Kingdom";
        p24.population= 10000;
        p24.population_c= 7000;
        p24.population_nc= 3000;
        population.add(p24);
        app.printUseCase24(population);
        app.getUseCase24();
        assertEquals(p24.name, "United Kingdom");
        assertEquals(p24.population, 10000);
        assertEquals(p24.population_c, 7000);
        assertEquals(p24.population_nc, 3000);
    }

    @Test
    void printUseCase25TestNull()
    {

        app.printUseCase25(null);
        app.getUseCase25();
    }
    
    @Test
    void printUseCase25TestValidData()
    {
        ArrayList<Population> populations = new ArrayList<>();
        Population p25 = new Population();
        p25.continent = "Africa";
        p25.population = 558676;
        p25.population_c = 7423432;
        p25.population_nc = 2342;
        populations.add(p25);
        app.printUseCase25(populations);
        app.getUseCase25();
        assertEquals(p25.continent, "Africa");
        assertEquals(p25.population, 558676);
        assertEquals(p25.population_c, 7423432);
        assertEquals(p25.population_nc, 2342);
    }

    @Test
    void printUseCase26TestNull()
    {

        app.printUseCase26(null);
        app.getUseCase26();
    }
    
    @Test
    void printUseCase26TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase26(countries);
        app.getUseCase26();
        assertEquals(c1.total_population, 1412000000);
    }

    @Test
    void printUseCase27TestNull()
    {
        app.printUseCase27(null, 0);
        app.getUseCase27(null);
    }
    
    @Test
    void printUseCase27TestValidData()
    {
        long continentPopulation = app.getUseCase27("Europe");
        app.printUseCase27("Europe", 730074600);
        assertEquals(continentPopulation, 730074600);
    }

    @Test
    void printUseCase28TestNull()
    {
        app.printUseCase28(null, 0);
        app.getUseCase28(null);
    }
    
    @Test
    void printUseCase28TestValidData()
    {
        long regionPopulation = app.getUseCase28("Western Europe");
        app.printUseCase28("Western Europe", 183247600);
        assertEquals(regionPopulation, 183247600);
    }

    @Test
    void printUseCase29TestNull()
    {
        app.printUseCase29(null, 0);
        app.getUseCase29(null);
    }
    
    @Test
    void printUseCase29TestValidData()
    {
        long districtPopulation = app.getUseCase29("Central");
        app.printUseCase29("Central", 2510408);
        assertEquals(districtPopulation, 2510408);
    }

    @Test
    void printUseCase30TestNull()
    {
        app.printUseCase30(null, 0);
        app.getUseCase30(null);
    }
    
    @Test
    void printUseCase30TestValidData()
    {
        long countryPopulation = app.getUseCase30("France");
        app.printUseCase30("France", 59225700);
        assertEquals(countryPopulation, 59225700);
    }

    @Test
    void printUseCase31TestNull()
    {
        app.printCityPopulation(null, 0);
        app.getUseCase31(null);
    }

    @Test
    void printUseCase31TestValidData()
    {
        long cityPopulation = app.getUseCase31("Berlin");
        app.printCityPopulation("Berlin", 3386667);
        assertEquals(cityPopulation, 3386667);
    }

}