package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App app;

    @BeforeAll
    static void init() {
        app = new App();
    }

    /**
     * Tests UseCase1
     */
    @Test
    void printUseCase1TestNull() {

        app.printUseCase1(null);
    }

    @Test
    void printUseCase1TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase1(countries);
    }

    @Test
    void printUseCase1TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "Germany";
        c1.population = 83200000;
        countries.add(c1);
        app.printUseCase1(countries);
    }

    /**
     * Tests UseCase2
     */
    @Test
    void printUseCase2TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase2(null);
    }

    @Test
    void printUseCase2TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase2(countries);
    }

    @Test
    void printUseCase2TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase2(countries);
    }

    @Test
    void printUseCase2TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "Germany";
        c1.continent = "Europe";
        c1.population = 83200000;
        countries.add(c1);
        app.printUseCase2(countries);
    }

    /**
     * Tests UseCase3
     */
    @Test
    void printUseCase3TestNull() {
        /**
         *Test what happens if the given is null
         */
        app.printUseCase3(null);
    }

    @Test
    void printUseCase3TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase3(countries);
    }

    @Test
    void printUseCase3TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase3(countries);
    }

    @Test
    void printUseCase3TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "Germany";
        c1.region = "Western Europe";
        c1.population = 82164700;
        countries.add(c1);
        app.printUseCase3(countries);
    }

    /**
     * Tests UseCase4
     */
    @Test
    void printUseCase4TestNull() {

        app.printUseCase4(null);
    }

    @Test
    void printUseCase4TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase4(countries);
    }

    @Test
    void printUseCase4TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase4(countries);
    }

    @Test
    void printUseCase4TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "Germany";
        c1.population = 82164700;
        countries.add(c1);
        app.printUseCase4(countries);
    }

    /**
     * UseCase5 has the same print method like UseCase2
     */


    /**
     * UseCase6 has the same print method like UseCase3
     */

    /**
     * Test UseCase7
     */

    @Test
    void printUseCase7TestNull() {

        app.printUseCase7(null);
    }

    @Test
    void printUseCase7TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase7(cities);
    }

    @Test
    void printUseCase7TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase7(cities);
    }

    @Test
    void printUseCase7TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name = "Edinburgh";
        c1.population = 450180;
        cities.add(c1);
        app.printUseCase7(cities);
    }

    /**
     * Test UseCase8
     */

    @Test
    void printUseCase8TestNull() {
        app.printUseCase8(null);
    }

    @Test
    void printUseCase8TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase8(cities);
    }

    @Test
    void printUseCase8TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase8(cities);
    }

    @Test
    void printUseCase8TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name = "Munich";
        c1.continent = "Europe";
        c1.population = 1194560;
        cities.add(c1);
        app.printUseCase8(cities);
    }


    /**
     * Tests UseCase9
     */
    @Test
    void printUseCase9TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase9(null);
    }

    @Test
    void printUseCase9TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<City> city = new ArrayList<City>();
        app.printUseCase9(city);
    }

    @Test
    void printUseCase9TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<City> city = new ArrayList<City>();
        city.add(null);
        app.printUseCase9(city);
    }

    @Test
    void printUseCase9TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<City> capital = new ArrayList<City>();
        City c9 = new City();
        c9.name = "Edinburgh";
        c9.population = 558676;
        c9.region = "Middle East";
        capital.add(c9);
        app.printUseCase9(capital);
    }


    /**
     * Test UseCase10
     */

    @Test
    void printUseCase10TestNull() {

        app.printUseCase10(null);
    }

    @Test
    void printUseCase10TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase10(cities);
    }

    @Test
    void printUseCase10TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase10(cities);
    }

    @Test
    void printUseCase10TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c10 = new City();
        c10.name = "Munich";
        c10.population = 1194560;
        c10.country = "Germany";
        cities.add(c10);
        app.printUseCase10(cities);
    }

    /**
     * Test UseCase 11
     */
    @Test
    void printUseCase11TestNull() {

        app.printUseCase11(null);
    }

    @Test
    void printUseCase11TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase11(cities);
    }

    @Test
    void printUseCase11TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase11(cities);
    }

    @Test
    void printUseCase11TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c11 = new City();
        c11.name = "Munich";
        c11.district = "Baijeri";
        c11.population = 1194560;
        cities.add(c11);
        app.printUseCase11(cities);
    }

    /**
     * Test UseCase12
     */
    @Test
    void printUseCase12TestNull() {

        app.printUseCase12(null);
    }

    @Test
    void printUseCase12TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase12(cities);
    }

    @Test
    void printUseCase12TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase12(cities);
    }

    @Test
    void printUseCase12TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c12 = new City();
        c12.name = "Munich";
        c12.population = 1194560;
        cities.add(c12);
        app.printUseCase12(cities);
    }

    /**
     * Test UseCase13
     */
    @Test
    void printUseCase13TestNull() {

        app.printUseCase13(null);
    }

    @Test
    void printUseCase13TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase13(cities);
    }

    @Test
    void printUseCase13TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase13(cities);
    }

    @Test
    void printUseCase13TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c13 = new City();
        c13.name = "Munich";
        c13.population = 1194560;
        c13.continent = "Europe";
        cities.add(c13);
        app.printUseCase13(cities);
    }

    /**
     * Test UseCase14
     */
    @Test
    void printUseCase14TestNull() {

        app.printUseCase14(null);
    }

    @Test
    void printUseCase14TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase14(cities);
    }

    @Test
    void printUseCase14TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase14(cities);
    }

    @Test
    void printUseCase14TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c14 = new City();
        c14.name = "Munich";
        c14.population = 1194560;
        c14.region = "Western Europe";
        cities.add(c14);
        app.printUseCase14(cities);
    }

    /**
     * Test UseCase15
     */
    @Test
    void printUseCase15TestNull() {

        app.printUseCase15(null);
    }

    @Test
    void printUseCase15TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase15(cities);
    }

    @Test
    void printUseCase15TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase15(cities);
    }

    @Test
    void printUseCase15TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c15 = new City();
        c15.name = "Munich";
        c15.population = 1194560;
        c15.country = "Germany";
        cities.add(c15);
        app.printUseCase15(cities);
    }

    /**
     * Test UseCase16
     */
    @Test
    void printUseCase16TestNull() {

        app.printUseCase16(null);
    }

    @Test
    void printUseCase16TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase16(cities);
    }

    @Test
    void printUseCase16TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase16(cities);
    }

    @Test
    void printUseCase16TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c16 = new City();
        c16.name = "Munich";
        c16.population = 1194560;
        c16.district = "Baijeri";
        cities.add(c16);
        app.printUseCase16(cities);
    }

    /**
     * Test UseCase17
     */
    @Test
    void printUseCase17TestNull() {

        app.printUseCase17(null);
    }

    @Test
    void printUseCase17TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase17(countries);
    }

    @Test
    void printUseCase17TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase17(countries);
    }

    @Test
    void printUseCase17TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c17 = new Country();
        c17.name = "Munich";
        c17.population = 1194560;
        countries.add(c17);
        app.printUseCase17(countries);
    }

    /**
     * Tests UseCase18
     */
    @Test
    void printUseCase18TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase18(null);
    }

    @Test
    void printUseCase18TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase18(capital);
    }

    @Test
    void printUseCase18TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase18(capital);
    }

    @Test
    void printUseCase18TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c18 = new Country();
        c18.name = "Edinburgh";
        c18.population = 558676;
        c18.continent = "Europe";
        capital.add(c18);
        app.printUseCase18(capital);
    }

    /**
     * Tests UseCase19
     */
    @Test
    void printUseCase19TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase19(null);
    }

    @Test
    void printUseCase19TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase19(capital);
    }

    @Test
    void printUseCase19TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase19(capital);
    }

    @Test
    void printUseCase19TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c19 = new Country();
        c19.name = "Edinburgh";
        c19.population = 558676;
        c19.region = "Lothian";
        capital.add(c19);
        app.printUseCase19(capital);
    }

    /**
     * Tests UseCase20
     */
    @Test
    void printUseCase20TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase20(null);
    }

    @Test
    void printUseCase20TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase20(capital);
    }

    @Test
    void printUseCase20TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase20(capital);
    }

    @Test
    void printUseCase20TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c20 = new Country();
        c20.name = "Edinburgh";
        c20.population = 558676;
        capital.add(c20);
        app.printUseCase20(capital);
    }

    /**
     * Tests UseCase21
     */
    @Test
    void printUseCase21TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase21(null);
    }

    @Test
    void printUseCase21TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase21(capital);
    }

    @Test
    void printUseCase21TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase21(capital);
    }

    @Test
    void printUseCase21TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c21 = new Country();
        c21.name = "Edinburgh";
        c21.population = 558676;
        c21.continent = "Europe";
        capital.add(c21);
        app.printUseCase21(capital);
    }

    /**
     * Tests UseCase22
     */
    @Test
    void printUseCase22TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase22(null);
    }

    @Test
    void printUseCase22TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        app.printUseCase22(capital);
    }

    @Test
    void printUseCase22TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        capital.add(null);
        app.printUseCase22(capital);
    }

    @Test
    void printUseCase22TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Country> capital = new ArrayList<Country>();
        Country c22 = new Country();
        c22.name = "Edinburgh";
        c22.population = 558676;
        c22.region = "Europe";
        capital.add(c22);
        app.printUseCase22(capital);
    }

    /**
     * Tests UseCase23
     */
    @Test
    void printUseCase23TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase23(null);
    }

    @Test
    void printUseCase23TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        app.printUseCase23(populations);
    }

    @Test
    void printUseCase23TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        app.printUseCase23(populations);
    }

    @Test
    void printUseCase23TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> populations = new ArrayList<Population>();
        Population p25 = new Population();
        p25.continent = "Europe";
        p25.population = 558676;
        p25.population_c = 7423432;
        p25.population_nc = 2342;
        app.printUseCase23(populations);
    }

    /**
     * Tests UseCase24
     */
    @Test
    void printUseCase24TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase24(null);
    }

    @Test
    void printUseCase24TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> population = new ArrayList<Population>();
        app.printUseCase24(population);
    }

    @Test
    void printUseCase24TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> population = new ArrayList<Population>();
        population.add(null);
        app.printUseCase24(population);
    }

    @Test
    void printUseCase24TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> population = new ArrayList<Population>();
        Population p23 = new Population();
        p23.region = "Lothian";
        p23.population = 10000;
        p23.population_c = 7000;
        p23.population_nc = 3000;
        population.add(p23);
        app.printUseCase24(population);
    }

    /**
     * Tests UseCase25
     */
    @Test
    void printUseCase25TestNull() {
        /**
         *Test what happens if the given data is null
         */
        app.printUseCase25(null);
    }

    @Test
    void printUseCase25TestEmpty() {
        /**
         *Test what happens if the given data is empty
         */
        ArrayList<Population> population = new ArrayList<Population>();
        app.printUseCase25(population);
    }

    @Test
    void printUseCase25TestContainsNull() {
        /**
         *Test what happens if the given data contains null
         */
        ArrayList<Population> population = new ArrayList<Population>();
        population.add(null);
        app.printUseCase25(population);
    }

    @Test
    void printUseCase25TestValidData() {
        /**
         *Test what happens under normal condition
         */
        ArrayList<Population> population = new ArrayList<Population>();
        Population p24 = new Population();
        p24.name = "United Kingdom";
        p24.population = 10000;
        p24.population_c = 7000;
        p24.population_nc = 3000;
        population.add(p24);
        app.printUseCase25(population);
    }

    /**
     * Test UseCase26
     */

    @Test
    void printUseCase26TestNull() {
        app.printUseCase26(null);
    }

    @Test
    void printUseCase26TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase26(countries);
    }

    @Test
    void printUseCase26TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase26(countries);
    }

    @Test
    void printUseCase26TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase26(countries);
    }

    /**
     * Test UseCase27
     */


    @Test
    void printUseCase27TestNull() {

        app.printUseCase27(null);
    }

    @Test
    void printUseCase27TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase27(countries);
    }

    @Test
    void printUseCase27TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase27(countries);
    }

    @Test
    void printUseCase27TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.continent = "Asia";
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase27(countries);
    }

    /**
     * Test UseCase28
     */

    @Test
    void printUseCase28TestNull() {

        app.printUseCase28(null);
    }

    @Test
    void printUseCase28TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase28(countries);
    }

    @Test
    void printUseCase28TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase28(countries);
    }

    @Test
    void printUseCase28TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.region = "Middle East";
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase28(countries);
    }

    /**
     * Test UseCase29
     */

    @Test
    void printUseCase29TestNull() {

        app.printUseCase29(null);
    }

    @Test
    void printUseCase29TestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printUseCase29(countries);
    }

    @Test
    void printUseCase29TestContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printUseCase29(countries);
    }

    @Test
    void printUseCase29TestValidData() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country c1 = new Country();
        c1.name = "China";
        c1.total_population = 1412000000;
        countries.add(c1);
        app.printUseCase29(countries);
    }

    /**
     * Test UseCase30
     */
    @Test
    void printUseCase30TestNull() {

        app.printUseCase30(null);
    }

    @Test
    void printUseCase30TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase30(cities);
    }

    @Test
    void printUseCase30TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase30(cities);
    }

    @Test
    void printUseCase30TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.district = "Florida";
        c1.population = 1412000000;
        cities.add(c1);
        app.printUseCase30(cities);
    }

    /**
     * Test UseCase31
     */

    @Test
    void printUseCase31TestNull() {

        app.printUseCase31(null);
    }

    @Test
    void printUseCase31TestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printUseCase31(cities);
    }

    @Test
    void printUseCase31TestContainsNull() {
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(null);
        app.printUseCase31(cities);
    }

    @Test
    void printUseCase31TestValidData() {
        ArrayList<City> cities = new ArrayList<City>();
        City c1 = new City();
        c1.name = "Edinburgh";
        c1.population = 1412000000;
        cities.add(c1);
        app.printUseCase31(cities);
    }

}



