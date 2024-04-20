package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    /**
     * The class is testing what the database does with the implemented methods and shows the output
     * The integrationTests are basically the same, they are testing for null case, empty case,
     * containsNull case and valid data
     */
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    /**
     * UseCase1
     */
    @Test
    void printUseCase1TestNull()
    {
        app.printUseCase1(null);
        app.getUseCase1();
    }

    @Test
    void printUseCase1TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase1(countries);
        app.getUseCase1();
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
        c1.population= 83200000;
        countries.add(c1);
        app.printUseCase1(countries);
        app.getUseCase1();
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 83200000);
    }

    /**
     * UseCase2
     */
    @Test
    void printUseCase2TestNull()
    {
        /**
         *Test what the database does if the given data is null
         */
        app.printUseCase2(null);
        app.getUseCase2(null);
    }

    @Test
    void printUseCase2TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase2(countries);
        app.getUseCase2(" ");
    }

    @Test
    void printUseCase2TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase2(countries);
        app.getUseCase2(" ");
    }

    @Test
    void printUseCase2TestValidData()
    {
        /**
         *Test what the database does under normal condition
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.continent = "Europe";
        c1.population= 83200000;
        countries.add(c1);
        app.printUseCase2(countries);
        app.getUseCase2("Europe");
        assertEquals(c1.name, "Germany");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.population, 83200000);
    }

    /**
     * UseCase3
     */
    @Test
    void printUseCase3TestNull()
    {
        /**
         *Test what the database does if the given data is null
         */
        app.printUseCase3(null);
        app.getUseCase3(null);
    }

    @Test
    void printUseCase3TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase3(countries);
        app.getUseCase3(" ");
    }

    @Test
    void printUseCase3TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase3(countries);
        app.getUseCase3(" ");
    }

    @Test
    void printUseCase3TestValidData()
    {
        /**
         *Test what the database does under normal condition
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.region = "Western Europe";
        c1.population= 82164700;
        countries.add(c1);
        app.printUseCase3(countries);
        app.getUseCase3("Western Europe");
        assertEquals(c1.name, "Germany");
        assertEquals(c1.region, "Western Europe");
        assertEquals(c1.population, 82164700);
    }

    /**
     * UseCase4
     */
    @Test
    void printUseCase4TestNull()
    {
        app.printUseCase4(null);
        app.getUseCase4(0);
    }

    @Test
    void printUseCase4TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase4(countries);
        app.getUseCase4(8);
    }

    @Test
    void printUseCase4TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase4(countries);
    }

    @Test
    void printUseCase4TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.population = 82164700;
        countries.add(c1);
        app.printUseCase4(countries);
        app.getUseCase4(3);
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 82164700);
    }

    /**
     * UseCase5
     */
    @Test
    void printUseCase5TestNull()
    {
        app.printUseCase2(null);
        app.getUseCase5(null,0);
    }

    @Test
    void printUseCase5TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase2(countries);
        app.getUseCase5(" ", 0);
    }

    @Test
    void printUseCase5TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase2(countries);
    }
    @Test
    void printUseCase5TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.population = 82164700;
        countries.add(c1);
        app.printUseCase2(countries);
        app.getUseCase5("Europe", 3);
        assertEquals(c1.name, "Germany");
        assertEquals(c1.population, 82164700);
    }

    /**
     * UseCase6
     */
    @Test
    void printUseCase6TestNull()
    {
        app.printUseCase3(null);
        app.getUseCase6(null, 0);
    }

    @Test
    void printUseCase6TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase3(countries);
        app.getUseCase6(" ", 0);
    }

    @Test
    void printUseCase6TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase3(countries);
    }

    @Test
    void printUseCase6TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name= "Germany";
        c1.region = "Western Europe";
        c1.population= 82164700;
        countries.add(c1);
        app.printUseCase3(countries);
        app.getUseCase6("Western Europe", 8);
        assertEquals(c1.name, "Germany");
        assertEquals(c1.region, "Western Europe");
        assertEquals(c1.population, 82164700);
    }

    /**
     * UseCase7
     */
    @Test
    void printUseCase7TestNull()
    {

        app.printUseCase7(null);
        app.getUseCase7();
    }

    @Test
    void printUseCase7TestEmpty()
    {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase7(cities);
        app.getUseCase7();
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
        app.getUseCase7();
        assertEquals(c1.name, "Edinburgh");
        assertEquals(c1.population, 450180);
    }

    /**
     * UseCase8
     */
    @Test
    void printUseCase8TestNull()
    {
        
        app.printUseCase8(null);
        app.getUseCase8(null);
    }

    @Test
    void printUseCase8TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase8(cities);
        app.getUseCase8(" ");
    }

    @Test
    void printUseCase8TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase8(cities);
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


    /**
     * UseCase9
     */
    @Test
    void printUseCase9TestNull()
    {

        app.printUseCase9(null);
        app.getUseCase9(null);
    }

    @Test
    void printUseCase9TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase9(cities);
        app.getUseCase9(" ");
    }

    @Test
    void printUseCase9TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase9(cities);
        app.getUseCase9(null);
    }

    @Test
    void printUseCase9TestValidData()
    {
        ArrayList<City> capital = new ArrayList<City>();
        City c9 = new City();
        c9.name= "Edinburgh";
        c9.population= 558676;
        c9.region= "Middle East";
        capital.add(c9);
        app.printUseCase9(capital);
        app.getUseCase9("Middle East");
        assertEquals(c9.name, "Edinburgh");
        assertEquals(c9.population, 558676);
        assertEquals(c9.region, "Middle East");
    }

    /**
     * UseCase10
     */
    @Test
    void printUseCase10TestNull()
    {

        app.printUseCase10(null);
        app.getUseCase10(null);
    }

    @Test
    void printUseCase10TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase10(cities);
        app.getUseCase10(" ");
    }

    @Test
    void printUseCase10TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase10(cities);
        app.getUseCase10(null);
    }

    @Test
    void printUseCase10TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c10 = new City();
        c10.name = "Paris";
        c10.country = "France";
        c10.population = 2125246;
        cities.add(c10);
        app.getUseCase10("France");
        app.printUseCase10(cities);
        assertEquals(c10.name, "Paris");
        assertEquals(c10.country, "France");
        assertEquals(c10.population,2125246 );
    }

    /**
     * UseCase11
     */
    @Test
    void printUseCase11TestNull()
    {

        app.printUseCase11(null);
        app.getUseCase11(null);
    }

    @Test
    void printUseCase11TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase11(cities);
        app.getUseCase11(" ");
    }

    @Test
    void printUseCase11TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase11(cities);
        app.getUseCase11(null);
    }
    @Test
    void printUseCase11TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c11 = new City();
        c11.name = "Abu Dhabi";
        c11.district = "Abu Dhabi";
        c11.population = 398695;
        cities.add(c11);
        app.printUseCase11(cities);
        app.getUseCase11("Abu Dhabi");
        assertEquals(c11.name, "Abu Dhabi");
        assertEquals(c11.district, "Abu Dhabi");
        assertEquals(c11.population, 398695);
    }

    /**
     * UseCase12
     */
    @Test
    void printUseCase12TestNull()
    {

        app.printUseCase12(null);
        app.getUseCase12(0);
    }

    @Test
    void printUseCase12TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase12(cities);
        app.getUseCase12(0);
    }

    @Test
    void printUseCase12TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase12(cities);
        app.getUseCase12(0);
    }
    @Test
    void printUseCase12TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c12 = new City();
        c12.name = "London";
        c12.population = 7285000;
        cities.add(c12);
        app.printUseCase12(cities);
        app.getUseCase12(4);
        assertEquals(c12.name, "London");
        assertEquals(c12.population, 7285000);
    }

    /**
     * UseCase13
     */
    @Test
    void printUseCase13TestNull()
    {

        app.printUseCase13(null);
        app.getUseCase13(0, null);
    }

    @Test
    void printUseCase13TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase13(cities);
        app.getUseCase13(0, " ");
    }

    @Test
    void printUseCase13TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase13(cities);
        app.getUseCase13(0, null);
    }
    
    @Test
    void printUseCase13TestValidData()
    {
        ArrayList<City>cities = new ArrayList<>();
        City c13 = new City();
        c13.name = "Amsterdam";
        c13.continent = "Europe";
        c13.population = 731200;
        cities.add(c13);
        app.printUseCase13(cities);
        app.getUseCase13(4,"Western Europe");
        assertEquals(c13.name, "Amsterdam");
        assertEquals(c13.continent, "Europe");
        assertEquals(c13.population, 731200);
    }

    /**
     * UseCase14
     */
    @Test
    void printUseCase14TestNull()
    {

        app.printUseCase14(null);
        app.getUseCase14(0, null);
    }

    @Test
    void printUseCase14TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase14(cities);
        app.getUseCase14(0, " ");
    }

    @Test
    void printUseCase14TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase14(cities);
        app.getUseCase14(0, null);
    }
    @Test
    void printUseCase14TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c14 = new City();
        c14.name = "Madrid";
        c14.region = "Southern Europe";
        c14.population = 2879052;
        cities.add(c14);
        app.printUseCase14(cities);
        app.getUseCase14(5,"Spain");
        assertEquals(c14.name, "Madrid");
        assertEquals(c14.population, 2879052);
        assertEquals(c14.region, "Southern Europe");
    }

    /**
     * UseCase15
     */
    @Test
    void printUseCase15TestNull()
    {

        app.printUseCase15(null);
        app.getUseCase15(0, null);
    }

    @Test
    void printUseCase15TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase15(cities);
        app.getUseCase15(0, " ");
    }

    @Test
    void printUseCase15TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase15(cities);
        app.getUseCase15(0, null);
    }
    @Test
    void printUseCase15TestValidData()
    {
        ArrayList<City> cities = new ArrayList<>();
        City c15 = new City();
        c15.name = "Glasgow";
        c15.country = "Scotland";
        c15.population = 619680;
        cities.add(c15);
        app.printUseCase15(cities);
        app.getUseCase15(7, "Scotland");
        assertEquals(c15.name, "Glasgow");
        assertEquals(c15.country, "Scotland");
        assertEquals(c15.population, 619680);
    }

    /**
     * UseCase16
     */
    @Test
    void printUseCase16TestNull()
    {

        app.printUseCase16(null);
        app.getUseCase16(0, null);
    }

    @Test
    void printUseCase16TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase16(cities);
        app.getUseCase16(0, " ");
    }

    @Test
    void printUseCase16TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase16(cities);
        app.getUseCase16(0, null);
    }

    @Test
    void printUseCase16TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c16 = new City();
        c16.name = "Munich";
        c16.population = 1194560;
        c16.district = "Baijeri";
        cities.add(c16);
        app.printUseCase16(cities);
        app.getUseCase16(2, "Baijeri");
        assertEquals(c16.name, "Munich");
        assertEquals(c16.population, 1194560);
        assertEquals(c16.district, "Baijeri");;
    }

    /**
     * UseCase17
     */
    @Test
    void printUseCase17TestNull()
    {

        app.printUseCase17(null);
        app.getUseCase17();
    }

    @Test
    void printUseCase17TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase17(countries);
        app.getUseCase17();
    }

    @Test
    void printUseCase17TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase17(countries);
        app.getUseCase17();
    }
    @Test
    void printUseCase17TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<>();
        Country capital17 = new Country();
        capital17.name = "Moscow";
        capital17.population = 8389200;
        capital.add(capital17);
        app.printUseCase17(capital);
        app.getUseCase17();
    }

    /**
     * UseCase18
     */
    @Test
    void printUseCase18TestNull()
    {

        app.printUseCase18(null);
        app.getUseCase18(null);
    }

    @Test
    void printUseCase18TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase18(countries);
        app.getUseCase18(" ");
    }

    @Test
    void printUseCase18TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase18(countries);
        app.getUseCase18(" ");
    }

    @Test
    void printUseCase18TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c18 = new Country();
        c18.name= "Edinburgh";
        c18.population= 558676;
        c18.continent = "Europe";
        capital.add(c18);
        app.printUseCase18(capital);
        app.getUseCase18("Europe");
        assertEquals(c18.name, "Edinburgh");
        assertEquals(c18.population, 558676);
        assertEquals(c18.continent, "Europe");
    }

    /**
     * UseCase19
     */
    @Test
    void printUseCase19TestNull()
    {

        app.printUseCase19(null);
        app.getUseCase19(null);
    }

    @Test
    void printUseCase19TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase19(countries);
        app.getUseCase19(" ");
    }

    @Test
    void printUseCase19TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase19(countries);
        app.getUseCase19(" ");
    }
    @Test
    void printUseCase19TestValidData()
    {
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c19 = new Country();
        c19.name= "Edinburgh";
        c19.population= 558676;
        c19.region="Lothian";
        capital.add(c19);
        app.printUseCase19(capital);
        app.getUseCase19("Lothian");
        assertEquals(c19.name, "Edinburgh");
        assertEquals(c19.population, 558676);
        assertEquals(c19.region, "Lothian");
    }

    /**
     * UseCase20
     */
    @Test
    void printUseCase20TestNull()
    {

        app.printUseCase20(null);
        app.getUseCase20(0);
    }

    @Test
    void printUseCase20TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase20(countries);
        app.getUseCase20(0);
    }

    @Test
    void printUseCase20TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase20(countries);
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

    /**
     * UseCase21
     */
    @Test
    void printUseCase21TestNull()
    {

        app.printUseCase21(null);
        app.getUseCase21(0, null);
    }

    @Test
    void printUseCase21TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase21(countries);
        app.getUseCase21(0, " ");
    }

    @Test
    void printUseCase21TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase21(countries);
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

    /**
     * UseCase22
     */
    @Test
    void printUseCase22TestNull()
    {

        app.printUseCase22(null);
        app.getUseCase22(0, null);
    }

    @Test
    void printUseCase22TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase22(countries);
        app.getUseCase22(0, null);
    }

    @Test
    void printUseCase22TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase22(countries);
        app.getUseCase22(0,null);
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

    /**
     * UseCase23
     */
    @Test
    void printUseCase23TestNull()
    {

        app.printUseCase23(null);
        app.getUseCase23();
    }

    @Test
    void printUseCase23TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        app.printUseCase23(populations);
        app.getUseCase23();
    }

    @Test
    void printUseCase23TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        app.printUseCase23(populations);
        app.getUseCase23();
    }

    @Test
    void printUseCase23TestValidData()
    {
        ArrayList<Population> populations = new ArrayList<>();
        Population p25 = new Population();
        p25.continent = "Africa";
        p25.population = 558676;
        p25.population_c = 7423432;
        p25.population_nc = 2342;
        populations.add(p25);
        app.printUseCase23(populations);
        app.getUseCase23();
        assertEquals(p25.continent, "Africa");
        assertEquals(p25.population, 558676);
        assertEquals(p25.population_c, 7423432);
        assertEquals(p25.population_nc, 2342);
    }

    /**
     * UseCase24
     */
    @Test
    void printUseCase24TestNull()
    {

        app.printUseCase24(null);
        app.getUseCase24();
    }

    @Test
    void printUseCase24TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        app.printUseCase24(populations);
        app.getUseCase24();
    }

    @Test
    void printUseCase24TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        app.printUseCase24(populations);
        app.getUseCase24();
    }

    @Test
    void printUseCase24TestValidData()
    {
        ArrayList<Population> population = new ArrayList<Population>();
        Population p23 = new Population();
        p23.region= "Lothian";
        p23.population= 10000;
        p23.population_c= 7000;
        p23.population_nc= 3000;
        population.add(p23);
        app.printUseCase24(population);
        app.getUseCase24();
        assertEquals(p23.region, "Lothian");
        assertEquals(p23.population, 10000);
        assertEquals(p23.population_c, 7000);
        assertEquals(p23.population_nc, 3000);
    }

    /**
     * UseCase25
     */
    @Test
    void printUseCase25TestNull()
    {

        app.printUseCase25(null);
        app.getUseCase25();
    }

    @Test
    void printUseCase25TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        app.printUseCase25(populations);
        app.getUseCase25();
    }

    @Test
    void printUseCase25TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        app.printUseCase25(populations);
        app.getUseCase25();
    }

    @Test
    void printUseCase25TestValidData()
    {
        ArrayList<Population> population = new ArrayList<Population>();
        Population p24 = new Population();
        p24.name= "United Kingdom";
        p24.population= 10000;
        p24.population_c= 7000;
        p24.population_nc= 3000;
        population.add(p24);
        app.printUseCase25(population);
        app.getUseCase25();
        assertEquals(p24.name, "United Kingdom");
        assertEquals(p24.population, 10000);
        assertEquals(p24.population_c, 7000);
        assertEquals(p24.population_nc, 3000);
    }

    /**
     * UseCase26
     */
    @Test
    void printUseCase26TestNull()
    {

        app.printUseCase26(null);
        app.getUseCase26();
    }

    @Test
    void printUseCase26TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase26(countries);
        app.getUseCase26();
    }

    @Test
    void printUseCase26TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase26(countries);
        app.getUseCase26();
    }
    
    @Test
    void printUseCase26TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "China";
        c1.continent = "Asia";
        c1.population = 1412000000;
        countries.add(c1);
        app.printUseCase26(countries);
        app.getUseCase26();
        assertEquals(c1.name, "China");
        assertEquals(c1.continent, "Asia");
        assertEquals(c1.population, 1412000000);

    }

    /**
     * UseCase27
     */
    @Test
    void printUseCase27TestNull()
    {
        app.printUseCase27(null);
        app.getUseCase27(null);
    }

    @Test
    void printUseCase27TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase27(countries);
        app.getUseCase27(" ");
    }

    @Test
    void printUseCase27TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase27(countries);
        app.getUseCase27(null);
    }
    
    @Test
    void printUseCase27TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.continent = "Europe";
        c1.total_population = 1412000;
        countries.add(c1);
        app.printUseCase27(countries);
        app.getUseCase27("Europe");
        assertEquals(c1.continent, "Europe");
        assertEquals(c1.total_population, 1412000);
    }

    /**
     * UseCase28
     */
    @Test
    void printUseCase28TestNull()
    {
        app.printUseCase28(null);
        app.getUseCase28(null);
    }

    @Test
    void printUseCase28TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase28(countries);
        app.getUseCase28(" ");
    }

    @Test
    void printUseCase28TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase28(countries);
        app.getUseCase28(null);
    }
    
    @Test
    void printUseCase28TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.region = "Middle East";
        c1.total_population = 141200000;
        countries.add(c1);
        app.printUseCase28(countries);
        app.getUseCase28("Middle East");
        assertEquals(c1.region, "Middle East");
        assertEquals(c1.total_population,141200000);
    }

    /**
     * UseCase29
     */
    @Test
    void printUseCase29TestNull()
    {
        app.printUseCase29(null);
        app.getUseCase29(null);
    }

    @Test
    void printUseCase29TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase29(countries);
        app.getUseCase29(" ");
    }

    @Test
    void printUseCase29TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase29(countries);
        app.getUseCase29(null);
    }
    
    @Test
    void printUseCase29TestValidData()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "China";
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase29(countries);
        app.getUseCase29("China");
        assertEquals(c1.name, "China");
        assertEquals(c1.total_population, 1412000000);
    }

    /**
     * UseCase30
     */
    @Test
    void printUseCase30TestNull()
    {
        app.printUseCase30(null);
        app.getUseCase30(null);
    }

    @Test
    void printUseCase30TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase30(cities);
        app.getUseCase30(" ");
    }

    @Test
    void printUseCase30TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase30(cities);
        app.getUseCase30(null);
    }
    
    @Test
    void printUseCase30TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.district = "Florida";
        c1.population = 1412000000;
        cities.add(c1);
        app.printUseCase30(cities);
        app.getUseCase30("Florida");
        assertEquals(c1.district, "Florida");
        assertEquals(c1.population, 1412000000);
    }

    /**
     * UseCase31
     */
    @Test
    void printUseCase31TestNull()
    {
        app.printUseCase31(null);
        app.getUseCase31(null);
    }

    @Test
    void printUseCase31TestEmpty()
    {
        /**
         *Test what the database does if the given data is empty
         */
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase31(cities);
        app.getUseCase31(" ");
    }

    @Test
    void printUseCase31TestContainsNull()
    {
        /**
         *Test what the database does if the given data contains null
         */
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase31(cities);
        app.getUseCase31(null);
    }

    @Test
    void printUseCase31TestValidData()
    {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name = "Edinburgh";
        c1.population = 1412000000;
        cities.add(c1);
        app.printUseCase31(cities);
        app.getUseCase31("Edinburgh");
        assertEquals(c1.name, "Edinburgh");
        assertEquals(c1.population, 1412000000);
    }

}