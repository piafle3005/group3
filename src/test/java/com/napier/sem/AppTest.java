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

    /**
     * Tests UseCase17
     */
    @Test
    void printUseCase17TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase17(null);
    }

    @Test
    void printUseCase17TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<City> capital = new ArrayList<City>();
        app.printUseCase17(capital);
    }

    @Test
    void printUseCase17TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<City> capital = new ArrayList<City>();
        capital.add(null);
        app.printUseCase17(capital);
    }

    @Test
    void printUseCase17TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<City> capital = new ArrayList<City>();
        City c17 = new City();
        c17.name= "Edinburgh";
        c17.population= 558676;
        c17.country= "United Kingdom";
        capital.add(c17);
        app.printUseCase17(capital);
    }

    /**
     * Tests UseCase18
     */
    @Test
    void printUseCase18TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase18(null);
    }

    @Test
    void printUseCase18TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase18(capital);
    }

    @Test
    void printUseCase18TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase1(capital);
    }

    @Test
    void printUseCase18TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c18 = new Country();
        c18.name= "Edinburgh";
        c18.population= 558676;
        c18.region="Lothian";
        capital.add(c18);
        app.printUseCase18(capital);
    }

    /**
     * Tests UseCase19
     */
    @Test
    void printUseCase19TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase19(null);
    }

    @Test
    void printUseCase19TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase19(capital);
    }

    @Test
    void printUseCase19TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase19(capital);
    }

    @Test
    void printUseCase19TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c19 = new Country();
        c19.name= "Edinburgh";
        c19.population= 558676;
        c19.continent = "Europe";
        capital.add(c19);
        app.printUseCase1(capital);
    }

    /**
     * Tests UseCase20
     */
    @Test
    void printUseCase20TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase20(null);
    }

    @Test
    void printUseCase20TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase20(capital);
    }

    @Test
    void printUseCase20TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase20(capital);
    }

    @Test
    void printUseCase20TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c20 = new Country();
        c20.name= "Edinburgh";
        c20.population= 558676;
        capital.add(c20);
        app.printUseCase20(capital);
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

    /**
     * Tests UseCase22
     */
    @Test
    void printUseCase22TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase22(null);
    }

    @Test
    void printUseCase22TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase22(capital);
    }

    @Test
    void printUseCase22TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase22(capital);
    }

    @Test
    void printUseCase22TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c22 = new Country();
        c22.name= "Edinburgh";
        c22.population= 558676;
        c22.region = "Europe";
        capital.add(c22);
        app.printUseCase22(capital);
    }

    /**
     * Tests UseCase23
     */
    @Test
    void printUseCase23TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase23(null);
    }

    @Test
    void printUseCase23TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> population = new ArrayList<Population>();
        app.printUseCase23(population);
    }

    @Test
    void printUseCase23TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> population = new ArrayList<Population>();
        population.add(null);
        app.printUseCase23(population);
    }

    @Test
    void printUseCase23TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> population = new ArrayList<Population>();
        Population p23 = new Population();
        p23.region= "Lothian";
        p23.population= 10000;
        p23.population_c= 7000;
        p23.population_nc= 3000;
        population.add(p23);
        app.printUseCase23(population);
    }

    /**
     * Tests UseCase24
     */
    @Test
    void printUseCase24TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase24(null);
    }

    @Test
    void printUseCase24TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> population = new ArrayList<Population>();
        app.printUseCase24(population);
    }

    @Test
    void printUseCase24TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> population = new ArrayList<Population>();
        population.add(null);
        app.printUseCase24(population);
    }

    @Test
    void printUseCase24TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> population = new ArrayList<Population>();
        Population p24 = new Population();
        p24.name= "United Kingdom";
        p24.population= 10000;
        p24.population_c= 7000;
        p24.population_nc= 3000;
        population.add(p24);
        app.printUseCase24(population);
    }

    /**
     * Tests UseCase25
     */
    @Test
    void printUseCase25TestNull()
    {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase25(null);
    }

    @Test
    void printUseCase25TestEmpty()
    {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        app.printUseCase25(populations);
    }

    @Test
    void printUseCase25TestContainsNull()
    {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        app.printUseCase25(populations);
    }

    @Test
    void printUseCase25TestValidData()
    {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        Population p25 = new Population();
        p25.population = 558676;
        p25.population_c = 7423432;
        p25.population_nc = 2342;
        app.printUseCase25(populations);
    }

    /**
     * Test UseCase26
     */

    @Test
    void printUseCase26TestNull()
    {
        app.printUseCase26(null);
    }

    @Test
    void printUseCase26TestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase26(countries);
    }

    @Test
    void printUseCase26TestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase26(countries);
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
    }

    /**
     * Test UseCase27
     */

    @Test
    void getUseCase27TestValidData() {
        long continentPopulation = app.getUseCase27("Europe");
        assertNotEquals(-1, continentPopulation);
    }

    @Test
    void getUseCase27TestInvalidData() {
        long continentPopulation = app.getUseCase27("InvalidContinent");
        assertEquals(-1, continentPopulation);
    }

    @Test
    void printUseCase27TestValidData() {
        app.printUseCase27("Europe", 743100000);
    }

    @Test
    void printUseCase27TestInvalidData() {
        app.printUseCase27("InvalidContinent", -1);
    }


    /**
     * Test UseCase28
     */

    @Test
    void getUseCase28TestValidData() {
        long regionPopulation = app.getUseCase28("Western Europe");
        assertNotEquals(-1, regionPopulation);
    }

    @Test
    void getUseCase28TestInvalidData() {
        long regionPopulation = app.getUseCase28("");
        assertEquals(-1, regionPopulation);
    }

    @Test
    void printUseCase28TestValidData() {
        app.printUseCase28("Western Europe", 187500000);
    }

    @Test
    void printUseCase28TestInvalidData() {
        app.printUseCase28("", -1);
    }

    /**
     * Test UseCase29
     */

    @Test
    void getUseCase29TestValidData() {
        long districtPopulation = app.getUseCase29("Central");
        assertNotEquals(-1, districtPopulation);
    }

    @Test
    void getUseCase29TestInvalidData() {
        long districtPopulation = app.getUseCase29("This is not a district");
        assertEquals(-1, districtPopulation);
    }

    @Test
    void printUseCase29TestValidData() {
        app.printUseCase29("Central", 100000);
    }

    @Test
    void printUseCase29TestInvalidData() {
        app.printUseCase29("This is not a district", -1);
    }

    /**
     * Test UseCase30
     */

    @Test
    void getUseCase30TestValidData() {
        long countryPopulation = app.getUseCase30("Germany");
        assertNotEquals(-1, countryPopulation);
    }

    @Test
    void getUseCase30TestInvalidData() {
        long countryPopulation = app.getUseCase30("Random country");
        assertEquals(-1, countryPopulation);
    }

    @Test
    void printUseCase30TestValidData() {
        app.printUseCase30("France", 64756584);
    }

    @Test
    void printUseCase30TestInvalidData() {
        app.printUseCase30("Random country", -1);
    }

    /**
     * Test UseCase31
     */

    @Test
    void getUseCase31TestValidData() {
        long cityPopulation = app.getUseCase31("Berlin");
        assertNotEquals(-1, cityPopulation);
    }

    @Test
    void getUseCase31TestInvalidData() {
        long cityPopulation = app.getUseCase31("InvalidCity");
        assertEquals(-1, cityPopulation);
    }

    @Test
    void printCityPopulationTestValidData() {
        app.printCityPopulation("Berlin", 3600000);
    }

    @Test
    void printCityPopulationTestInvalidData() {
        app.printCityPopulation("InvalidCity", -1);
    }
}






