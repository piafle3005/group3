package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App
{

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * implement UseCase1
     */
    public ArrayList<Country> getUseCase1(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.continent, country.population "
                            + "FROM country "
                            + "WHERE country.continent = '" + continent + "' "
                            + "ORDER BY country.population DESC"; //sort from the largest to the smallest

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country country1 = new Country();
                country1.name = rset.getString("name");
                country1.continent = rset.getString("continent");
                country1.population = rset.getInt("population");
                country.add(country1);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in a continent organised by largest population to smallest.");
            return null;
        }
    }

    public void printUseCase1(ArrayList<Country> country)
    {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Continent", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-20s %-15s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.continent, c1.population);
            System.out.println(c1_string);
        }
    }

    //Usecase 2
    public ArrayList<Country> getUseCase2(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.region, country.population "
                            + "FROM country "
                            + "WHERE country.region = '" + region + "' "
                            + "ORDER BY country.population DESC"; //sort from the largest to the smallest

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country country2 = new Country();
                country2.name = rset.getString("name");
                country2.region = rset.getString("region");
                country2.population = rset.getInt("population");
                country.add(country2);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in a region organised by largest population to smallest");
            return null;
        }
    }


    public void printUseCase2(ArrayList<Country> country)
    {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Region", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-20s %-15s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.region, c1.population);
            System.out.println(c1_string);
        }
    }

    //Usecase3
    public ArrayList<Country> getUseCase3(int limit)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.population "
                            + "FROM country "
                            + "ORDER BY country.population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                Country country3 = new Country();
                country3.name = rset.getString("name");
                country3.population = rset.getInt("population");
                country.add(country3);
                count++;
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in the world organised by largest population to smallest");
            return null;
        }
    }

    public void printUseCase3(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-12s", "Name", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-20s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    //Usecase 4
    public ArrayList<Country> getUseCase4(String continent, int limit)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.continent, country.population "
                            + "FROM country "
                            + "WHERE country.continent = '" + continent + "' "
                            + "ORDER BY country.population DESC"; //sort from the largest to the smallest

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                Country country1 = new Country();
                country1.name = rset.getString("name");
                country1.continent = rset.getString("continent");
                country1.population = rset.getInt("population");
                country.add(country1);
                count++;
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in a continent organised by largest population to smallest.");
            return null;
        }
    }

    //Usecase4 can take the same print methode from usecase1 because it is the same request

    //Usecase 5
    public ArrayList<Country> getUseCase5()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.population "
                            + "FROM country "
                            + "ORDER BY country.population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country country5 = new Country();
                country5.name = rset.getString("name");
                country5.population = rset.getInt("population");
                country.add(country5);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in the world organised by largest population to smallest");
            return null;
        }
    }

    public void printUseCase5(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-12s", "Name", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-20s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    //Usecase 6
    public ArrayList<Country> getUseCase6(String region, int limit)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, country.region, country.population "
                            + "FROM country "
                            + "WHERE country.region = '" + region + "' "
                            + "ORDER BY country.population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country = new ArrayList<Country>();
            int count =0;
            while (rset.next() && count < limit)
            {
                Country country6 = new Country();
                country6.name = rset.getString("name");
                country6.region = rset.getString("region");
                country6.population = rset.getInt("population");
                country.add(country6);
                count++;
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in a region organised by largest population to smallest");
            return null;
        }
    }

    //UseCase6 use the print method from useCase2

    //Usecase7
    public ArrayList<City> getUseCase7()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population "
                            + "FROM city "
                            + "ORDER BY city.population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City city1 = new City();
                city1.name = rset.getString("name");
                city1.population = rset.getInt("population");
                city.add(city1);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the cities in the world organised by largest population to smallest");
            return null;
        }
    }

    public void printUseCase7(ArrayList<City> city) {
        if (city == null) {
            System.out.println("No cities found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-12s", "Name", "Population"));
        // Loop over all countries in the list
        for (City c1 : city) {
            if (c1 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c1_string = String.format("%-20s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    //Usecase8
    public ArrayList<City> getUseCase8(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, country.continent, city.population "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.continent = '" + continent + "' "
                            + "ORDER BY city.population DESC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City city2 = new City();
                city2.name = rset.getString("name");
                city2.continent = rset.getString("continent");
                city2.population = rset.getInt("population");
                city.add(city2);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the cities in a continent organised by largest population to smallest");
            return null;
        }
    }

    public void printUseCase8(ArrayList<City> city) {
        if (city == null) {
            System.out.println("No cities found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Continent", "Population"));
        // Loop over all countries in the list
        for (City c1 : city) {
            if (c1 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c1_string = String.format("%-20s %-15s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.continent, c1.population);
            System.out.println(c1_string);
        }
    }

    public ArrayList<City> getUseCase10(String district)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.district, city.population "
                            + "FROM city  "
                            + "WHERE city.district = '" + district + "' "
                            + "ORDER BY city.population ASC";
            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city10 = new ArrayList<>();
            while (rset.next())
            {
                City city = new City();
                city.name = rset.getString("name");
                city.district = rset.getString("district");
                city.population = rset.getInt("population");
                city10.add(city);
            }
            return city10;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the cities in a district organised by largest population to smallest");
            return null;
        }
    } // getUseCase10

    public void printUseCase10(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "District", "Population"));
        // Loop over all cities in the list
        for (City c10 : city)
        {
            String c10_string = String.format("%-20s %-15s %-12s", c10.name, c10.district, c10.population);
            System.out.println(c10_string);
        }
    } // print use case 10


    public ArrayList<City> getUseCase11(int limit)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population "
                            + "FROM city " ;
            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city11 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city11.add(city);
                count++;
            }
            return city11;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the top N populated cities in the world, where N is provided by the user");
            return null;
        }
    } // getUseCase11

    public void printUseCase11(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-12s", "Name", "Population"));
        // Loop over all cities in the list
        for (City c11 : city)
        {
            String c11_string = String.format("%-20s %-12d", c11.name, c11.population);
            System.out.println(c11_string);
        }
    } // print use case 11

    public ArrayList<City> getUseCase12(int limit, String continent)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population, country.continent "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.continent = '" + continent + "' ";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city12 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city.continent = rset.getString("continent");
                city12.add(city);
                count ++;
            }
            return city12;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the top N populated cities in a continent, where N is provided by the user");
            return null;
        }
    } // Get use case 12

    public void printUseCase12(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Continent"));
        // Loop over all cities in the list
        for (City c12 : city)
        {
            String c12_string = String.format("%-20s %-15s %-12s", c12.name, c12.population, c12.continent);
            System.out.println(c12_string);
        }
    } // print use case 12

    public ArrayList<City> getUseCase13(int limit, String region)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population, country.region "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.region = '" + region + "' ";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city13 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city.region = rset.getString("region");
                city13.add(city);
                count ++;
            }
            return city13;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the top N populated cities in a region, where N is provided by the user");
            return null;
        }
    } //Get use case 13

    public void printUseCase13(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Region"));
        // Loop over all cities in the list
        for (City c13 : city)
        {
            String c13_string = String.format("%-20s %-15s %-12s", c13.name, c13.population, c13.region);
            System.out.println(c13_string);
        }
    } // Print use case 13

    public ArrayList<City> getUseCase14 (int limit, String country)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population, country.name AS country_name "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.name = '" + country + "' ";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city14 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city.country = rset.getString("country_name");
                city14.add(city);
                count ++;
            }
            return city14;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the top N populated cities in a country, where N is provided by the user");
            return null;
        }
    } // Get use case 14

    public void printUseCase14(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Country"));
        // Loop over all cities in the list
        for (City c14 : city)
        {
            String c14_string = String.format("%-20s %-15s %-12s", c14.name, c14.population, c14.country);
            System.out.println(c14_string);
        }
    } // print use case 14

    public ArrayList<City> getUseCase15(int limit, String district)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population, city.district "
                            + "FROM city "
                            + "WHERE city.district ='" + district + "' ";
            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city15 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city.district = rset.getString("district");
                city15.add(city);
                count ++;
            }
            return city15;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the top N populated cities in a district, where N is provided by the user");
            return null;
        }
    } // Get use case15

    public void printUseCase15(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "District"));
        // Loop over all cities in the list
        for (City c15 : city)
        {
            String c15_string = String.format("%-20s %-15s %-12s", c15.name, c15.population, c15.district);
            System.out.println(c15_string);
        }
    } //Print use case 15

    public ArrayList<Country> getUseCase16()
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.capital = city.ID "
                            + "ORDER BY city.population DESC";
            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<Country> capital16 = new ArrayList<>();
            while (rset.next())
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital16.add(capital);
            }
            return capital16;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the capital cities in the world, organised by largest population to smallest");
            return null;
        }
    } //Get use case 16

    public void printUseCase16(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s", "Name", "Population"));
        // Loop over all cities in the list
        for (Country c16 : capital)
        {
            String c16_string = String.format("%-20s %-15s", c16.name, c16.population);
            System.out.println(c16_string);
        }
    } //Print use case 16

    public ArrayList<Country> getUseCase17(String continent)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population, country.continent "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.capital = city.ID "
                            + "AND country.continent ='" + continent +  "' "
                            + "ORDER BY city.population DESC";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<Country> capital17 = new ArrayList<>();
            while (rset.next())
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital.continent = rset.getString("continent");
                capital17.add(capital);
            }
            return capital17;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the capital cities in a continent, organised by largest population to smallest");
            return null;
        }
    } //get use case 17

    public void printUseCase17(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Continent"));
        // Loop over all cities in the list
        for (Country c17 : capital)
        {
            String c17_string = String.format("%-20s %-15s %-12s", c17.name, c17.population, c17.continent);
            System.out.println(c17_string);
        }
    } //Print use case 17

    public ArrayList<Population> getUseCase25() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement to get total population of countries in each continent
            String strSelect =
                    "SELECT country.continent, SUM(country.population) AS total_population, SUM(country.population) - SUM(city.population) AS total_population_nc, SUM(city.population) AS total_population_c "
                    + "FROM country, city "
                    + "WHERE city.countryCode = country.code "
                    + "GROUP BY country.continent";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            ArrayList<Population> population = new ArrayList<>();

            // Get total population for each continent
            while (rset.next()) {
                Population data = new Population();
                data.continent = rset.getString("continent");
                data.population = rset.getLong("total_population");
                data.population_nc = rset.getLong("total_population_nc");
                data.population_c = rset.getLong("total_population_c");
                population.add(data);
            }
            return population;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get ...");
            return null;
        }
    }

    public void printUseCase25(ArrayList<Population> population) {
        if (population == null) {
            System.out.println("No population data found.\n");
            return;
        }

        // Print header
        System.out.println(String.format("%-30s %-15s %-22s %s",
                "Continent/Region/Country", "Population", "Population in Cities", "Population not in Cities"));
        System.out.println("--------------------------------------------------------------------------------");

        // Loop over all population data in the list
        for (Population data : population) {
            System.out.printf("%-30s %-15d %-22d %d%n",
                    data.continent, data.population, data.population_nc, data.population_c);
        }
    }

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        //print UseCase1
        ArrayList<Country> country = a.getUseCase1("Africa");
        a.printUseCase1(country);

        //print UseCase2
        ArrayList<Country> country2 = a.getUseCase2("Middle East");
        a.printUseCase2(country2);

        //print UseCase3
        ArrayList<Country> country3 = a.getUseCase3(16);
        a.printUseCase3(country3);

        //print UseCase4
        ArrayList<Country> country4 = a.getUseCase4("Europe", 3);
        a.printUseCase1(country4);

        //print UseCase5
        ArrayList<Country> country5 = a.getUseCase5();
        a.printUseCase5(country5);

        //print UseCase6
        ArrayList<Country> country6 = a.getUseCase6("Middle East", 9);
        a.printUseCase2(country6);

        //print UseCase7
        ArrayList<City> city = a.getUseCase7();
        a.printUseCase7(city);

        //print UseCase8
        ArrayList<City> city2 = a.getUseCase8("Europe");
        a.printUseCase8(city2);


        ArrayList<City> city10 = a.getUseCase10("São Paulo");
        a.printUseCase10(city10);

        ArrayList<City> city11 = a.getUseCase11(3);
        a.printUseCase11(city11);

        ArrayList<City> city12 = a.getUseCase12(3, "Europe");
        a.printUseCase12(city12);

        ArrayList<City> city13 = a.getUseCase13(3, "Western Europe");
        a.printUseCase13(city13);

        ArrayList<City> city14 = a.getUseCase14(3, "Germany");
        a.printUseCase14(city14);

        ArrayList<City> city15 = a.getUseCase15(2, "Mendoza");
        a.printUseCase15(city15);

        ArrayList<Country> capital16 = a.getUseCase16();
        a.printUseCase16(capital16);

        ArrayList<Country> capital17 = a.getUseCase17("Europe");
        a.printUseCase17(capital17);

        ArrayList<Population> p1 = a.getUseCase25();
        a.printUseCase25(p1);

        // Disconnect from database
        a.disconnect();

    }

}