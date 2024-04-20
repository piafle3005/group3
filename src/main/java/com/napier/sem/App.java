package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App
{

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect(String location, int delay) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
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
    public ArrayList<Country> getUseCase1()
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

    public void printUseCase1(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-20s", "Name", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-50s %,-20d",
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase2
     */
    public ArrayList<Country> getUseCase2(String continent)
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

    public void printUseCase2(ArrayList<Country> country)
    {
        if (country == null) {
            System.out.println("No countries found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-25s %-25s", "Name", "Continent", "Population"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null country found.");
                continue;
            }
            String c1_string = String.format("%-50s %-25s %,-25d",
                    c1.name, c1.continent, c1.population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase3
     */
    public ArrayList<Country> getUseCase3(String region)
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


    public void printUseCase3(ArrayList<Country> country)
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
            String c1_string = String.format("%-20s %-15s %,-12d",
                    c1.name, c1.region, c1.population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase4
     */
    public ArrayList<Country> getUseCase4(int limit)
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
            System.out.println("Failed to get the top N populated countries in the world where N is provided by the user.");
            return null;
        }
    }

    public void printUseCase4(ArrayList<Country> country) {
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

    /**
     * implement UseCase5
     */
    public ArrayList<Country> getUseCase5(String continent, int limit)
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
            System.out.println("Failed to get the top N populated countries in a continent where N is provided by the user.");
            return null;
        }
    }

    //Usecase5 can take the same print methode from usecase1 because it is the same request



    /**
     * implement UseCase6
     */
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
            System.out.println("Failed to get the top N populated countries in a region where N is provided by the user.");
            return null;
        }
    }

    //UseCase6 use the print method from useCase3

    /**
     * implement UseCase7
     */
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
            String c1_string = String.format("%-20s %,-12d",
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase8
     */
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
            String c1_string = String.format("%-20s %-15s %,-12d",
                    c1.name, c1.continent, c1.population);
            System.out.println(c1_string);
        }
    }


    /**
     * implement UseCase9
     */
    public ArrayList<City> getUseCase9(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, country.region, city.population "
                            + "FROM city, country "
                            + "WHERE city.countrycode = country.code "
                            + "AND country.region = '" + region + "' "
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
                city2.region = rset.getString("region");
                city2.population = rset.getInt("population");
                city.add(city2);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the cities in a region organised by largest population to smallest");
            return null;
        }
    }

    public void printUseCase9(ArrayList<City> city) {
        if (city == null) {
            System.out.println("No cities found.");
            return;
        }
        // Print header
        System.out.println(String.format("%-50s %-25s %-25s", "Name", "Region", "Population"));
        // Loop over all countries in the list
        for (City c1 : city) {
            if (c1 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c1_string = String.format("%-50s %-25s %,-25d",
                    c1.name, c1.region, c1.population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase10
     */
    public ArrayList<City> getUseCase10(String country)
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

            ArrayList<City> city9 = new ArrayList<>();

            while (rset.next())
            {
                City city = new City();
                city.name = rset.getString("name");
                city.population = rset.getInt("population");
                city.country = rset.getString("country_name");

                city9.add(city);

            }
            return city9;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the cities in a country organised by largest population to smallest.");
            return null;
        }
    } // Get useCase10

    public void printUseCase10(ArrayList<City> city)
    {
        if (city == null)
        {
            System.out.println("No cities found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Country"));
        // Loop over all cities in the list
        for (City c9 : city)
        {
            if (c9 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c9_string = String.format("%-20s %-15s %-12s", c9.name, c9.population, c9.country);
            System.out.println(c9_string);
        }
    } // print useCase10

    /**
     * implement UseCase11
     */
    public ArrayList<City> getUseCase11(String district)
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
    } // getUseCase11

    public void printUseCase11(ArrayList<City> city)
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
            if (c10 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c10_string = String.format("%-20s %-15s %-12s", c10.name, c10.district, c10.population);
            System.out.println(c10_string);
        }
    } // print use case11

    /**
     * implement UseCase12
     */
    public ArrayList<City> getUseCase12(int limit)
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population "
                            + "FROM city "
                            + "ORDER BY city.population DESC";
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
    } // getUseCase12

    public void printUseCase12(ArrayList<City> city)
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
            if (c11 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c11_string = String.format("%-20s %-12d", c11.name, c11.population);
            System.out.println(c11_string);
        }
    } // print use case 12

    /**
     * implement UseCase13
     */
    public ArrayList<City> getUseCase13(int limit, String continent)
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
                            + "AND country.continent = '" + continent + "' "
                            + "ORDER BY city.population DESC";

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
    } // Get use case 13

    public void printUseCase13(ArrayList<City> city)
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
            if (c12 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c12_string = String.format("%-20s %-15s %-12s", c12.name, c12.population, c12.continent);
            System.out.println(c12_string);
        }
    } // print use case 13

    /**
     * implement UseCase14
     */
    public ArrayList<City> getUseCase14(int limit, String region)
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
                            + "AND country.region = '" + region + "' "
                            + "ORDER BY city.population DESC";

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
    } //Get use case 14

    public void printUseCase14(ArrayList<City> city)
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
            if (c13 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c13_string = String.format("%-20s %-15s %-12s", c13.name, c13.population, c13.region);
            System.out.println(c13_string);
        }
    } // Print use case 14

    /**
     * UseCase15
     */
    public ArrayList<City> getUseCase15 (int limit, String country)
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
    } // Get use case 15

    public void printUseCase15(ArrayList<City> city)
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
            if (c14 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c14_string = String.format("%-20s %-15s %-12s", c14.name, c14.population, c14.country);
            System.out.println(c14_string);
        }
    } // print use case 15

    /**
     * UseCase16
     */
    public ArrayList<City> getUseCase16(int limit, String district)
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
    } // Get use case16

    public void printUseCase16(ArrayList<City> city)
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
            if (c15 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c15_string = String.format("%-20s %-15s %-12s", c15.name, c15.population, c15.district);
            System.out.println(c15_string);
        }
    } //Print use case 16

    /**
     * implement UseCase17
     */
    public ArrayList<Country> getUseCase17()
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
    } //Get use case 17

    public void printUseCase17(ArrayList<Country> capital)
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
            if (c16 == null) {
                System.out.println("Null capital found.");
                continue;
            }
            String c16_string = String.format("%-20s %-15s", c16.name, c16.population);
            System.out.println(c16_string);
        }
    } //Print use case 17

    /**
     * implement UseCase18
     */
    public ArrayList<Country> getUseCase18(String continent)
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

            ArrayList<Country> capital19 = new ArrayList<>();
            while (rset.next())
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital.continent = rset.getString("continent");
                capital19.add(capital);
            }
            return capital19;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the capital cities in a continent, organised by largest population to smallest");
            return null;
        }
    } //get use case 18

    public void printUseCase18(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Continent"));
        // Loop over all cities in the list
        for (Country c19 : capital)
        {
            if (c19 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c19_string = String.format("%-20s %-15s %-12s", c19.name, c19.population, c19.continent);
            System.out.println(c19_string);
        }
    } //Print use case 18

    /**
     * UseCase19
     */
    public ArrayList<Country> getUseCase19(String region)
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
                            + "AND country.capital = city.ID "
                            + "AND country.region ='" + region +  "' "
                            + "ORDER BY city.population DESC";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<Country> capital8 = new ArrayList<>();
            while (rset.next())
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital.region = rset.getString("region");
                capital8.add(capital);
            }
            return capital8;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the capital cities in a region, organised by largest population to smallest");
            return null;
        }
    } //get use case 19

    public void printUseCase19(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Region"));
        // Loop over all cities in the list
        for (Country c18 : capital)
        {
            if (c18 == null) {
                System.out.println("Null city found.");
                continue;
            }
            String c18_string = String.format("%-20s %-15s %-12s", c18.name, c18.population, c18.region);
            System.out.println(c18_string);
        }
    } //Print use case 19

    /**
     * implement UseCase20
     */
    public ArrayList<Country> getUseCase20(int limit)
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

            ArrayList<Country> capital20 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                count++;
                capital20.add(capital);
            }
            return capital20;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the top N populated capital cities in the world where N is provided by the user.");
            return null;
        }
    } //Get use case 20

    public void printUseCase20(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s", "Name", "Population"));
        // Loop over all cities in the list
        for (Country c20 : capital)
        {
            if (c20 == null) {
                System.out.println("Null capital found.");
                continue;
            }
            String c20_string = String.format("%-20s %-15s", c20.name, c20.population);
            System.out.println(c20_string);
        }
    } //Print use case 20

    /**
     * implement UseCase21
     */
    public ArrayList<Country> getUseCase21(int limit, String continent)
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

            ArrayList<Country> capital21 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital.continent = rset.getString("continent");
                count++;
                capital21.add(capital);
            }
            return capital21;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the top N populated capital cities in a continent where N is provided by the user.");
            return null;
        }
    } //get use case 21

    public void printUseCase21(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Continent"));
        // Loop over all cities in the list
        for (Country c21 : capital)
        {
            if (c21 == null) {
                System.out.println("Null capital found.");
                continue;
            }
            String c21_string = String.format("%-20s %-15s %-12s", c21.name, c21.population, c21.continent);
            System.out.println(c21_string);
        }
    } //Print use case 21

    /**
     * implement UseCase22
     */
    public ArrayList<Country> getUseCase22(int limit, String region)
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
                            + "AND country.capital = city.ID "
                            + "AND country.region ='" + region +  "' "
                            + "ORDER BY city.population DESC";

            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<Country> capital22 = new ArrayList<>();
            int count = 0;
            while (rset.next() && count < limit)
            {
                Country capital = new Country();
                capital.name = rset.getString("name");
                capital.population = rset.getInt("population");
                capital.region = rset.getString("region");
                count++;
                capital22.add(capital);
            }
            return capital22;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the top N populated capital cities in a region where N is provided by the user.");
            return null;
        }
    } //get use case 22

    public void printUseCase22(ArrayList<Country> capital)
    {
        if (capital == null)
        {
            System.out.println("No capitals found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-15s %-12s", "Name", "Population", "Region"));
        // Loop over all cities in the list
        for (Country c22 : capital)
        {
            if (c22 == null) {
                System.out.println("Null capital found.");
                continue;
            }
            String c22_string = String.format("%-20s %-15s %-12s", c22.name, c22.population, c22.region);
            System.out.println(c22_string);
        }
    } //Print use case 22

    /**
     * implement UseCase23
     */
    public ArrayList<Population> getUseCase23() {
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
            System.out.println("Failed to get the population of people, people living in cities, and people not living in cities in each continent.");
            return null;
        }
    }

    public void printUseCase23(ArrayList<Population> population) {
        if (population == null) {
            System.out.println("No population data found.\n");
            return;
        }

        // Print header
        System.out.println(String.format("%-30s %-15s %-22s %s",
                "Continent", "Population", "Population not in Cities", "Population in Cities"));
        // Loop over all population data in the list
        for (Population data : population) {
            if (data == null) {
                System.out.println("Null population data found.");
                continue;
            }
            System.out.printf("%-30s %-15d %-22d %d%n", data.continent, data.population, data.population_nc, data.population_c);
        }
    }

    /**
     * implement UseCase24
     */
    public ArrayList<Population> getUseCase24() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement to get total population of countries in each region
            String strSelect =
                    "SELECT country.region, SUM(country.population) AS total_population, SUM(country.population) - SUM(city.population) AS total_population_nc, SUM(city.population) AS total_population_c "
                    + "FROM country, city "
                    + "WHERE city.countryCode = country.code "
                    + "GROUP BY country.region";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            ArrayList<Population> population = new ArrayList<>();

            // Get total population for each region
            while (rset.next()) {
                Population data = new Population();
                data.region = rset.getString("region");
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
            System.out.println("Failed to get the population of people, people living in cities, and people not living in cities in each region.");
            return null;
        }
    }

    public void printUseCase24(ArrayList<Population> population) {
        if (population == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-30s %-15s %-22s %s", "Region", "Population",  "Population not in Cities", "Population in Cities"));
        System.out.println("--------------------------------------------------------------------------------");

        // Loop over all population data in the list
        for (Population data : population) {
            if (data == null) {
                System.out.println("Null population data found.");
                continue;
            }
            System.out.printf("%-30s %-15d %-22d %d%n", data.region, data.population, data.population_nc, data.population_c);
        }
    }

    /**
     * implement UseCase25
     */
    public ArrayList<Population> getUseCase25() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement to get total population of countries in each continent
            String strSelect =
                    "SELECT country.name, SUM(country.population) AS total_population, SUM(country.population) - SUM(city.population) AS total_population_nc, SUM(city.population) AS total_population_c "
                            + "FROM country, city "
                            + "WHERE city.countryCode = country.code "
                            + "GROUP BY country.name";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            ArrayList<Population> population = new ArrayList<>();

            // Get total population for each continent
            while (rset.next()) {
                Population data = new Population();
                data.name = rset.getString("name");
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
            System.out.println("Failed to get the population of people, people living in cities, and people not living in cities in each country.");
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
                "Country", "Population",  "Population not in Cities", "Population in Cities"));

        // Loop over all population data in the list
        for (Population data : population) {
            if (data == null) {
                System.out.println("Null population data found.");
                continue;
            }
            System.out.printf("%-30s %-15d %-22d %d%n", data.name, data.population, data.population_nc, data.population_c);
        }
    }

    /**
     * implement UseCase26
     */
    public ArrayList<Country> getUseCase26()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(country.population) AS total_population "
                            + "FROM country ";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country26 = new ArrayList<Country>();

            while (rset.next())
            {
                Country c26 = new Country();
                c26.total_population = rset.getLong("total_population");
                country26.add(c26);

            }
            return country26;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data of population of the world accessible to organisation.");
            return null;
        }
    }

    public void printUseCase26(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s ", "Population of the world"));
                // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s",
                    c1.total_population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase27
     */
    public ArrayList<Country> getUseCase27(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.continent, SUM(country.population) AS total_population " +
                            "FROM country " +
                            "WHERE country.continent ='" + continent +  "' " +
                            "GROUP BY country.continent";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country27 = new ArrayList<Country>();

            while (rset.next())
            {
                Country c27 = new Country();
                c27.continent = rset.getString("continent");
                c27.total_population = rset.getLong("total_population");
                country27.add(c27);

            }
            return country27;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data of the population of a continent.");
            return null;
        }
    }


    public void printUseCase27(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-20s", "Continent", "Population of the continent"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s %-20s",
                    c1.continent, c1.total_population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCse28
     */
    public ArrayList<Country> getUseCase28(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.region, SUM(country.population) AS total_population " +
                            "FROM country " +
                            "WHERE country.region ='" + region +  "' " +
                            "GROUP BY country.region";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country27 = new ArrayList<Country>();

            while (rset.next())
            {
                Country c27 = new Country();
                c27.region = rset.getString("region");
                c27.total_population = rset.getLong("total_population");
                country27.add(c27);

            }
            return country27;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data of the population of a region.");
            return null;
        }
    }


    public void printUseCase28(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-20s", "Region", "Population of the region"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s %-20s",
                    c1.region, c1.total_population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase29
     */
    public ArrayList<Country> getUseCase29(String country)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT country.name, SUM(country.population) AS total_population " +
                            "FROM country " +
                            "WHERE country.name ='" + country +  "' " +
                            "GROUP BY country.name";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country27 = new ArrayList<Country>();

            while (rset.next())
            {
                Country c27 = new Country();
                c27.name = rset.getString("name");
                c27.total_population = rset.getLong("total_population");
                country27.add(c27);

            }
            return country27;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data the population of a country.");
            return null;
        }
    }


    public void printUseCase29(ArrayList<Country> country) {
        if (country == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-20s", "Country", "Population of the country"));
        // Loop over all countries in the list
        for (Country c1 : country) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s %-20s",
                    c1.name, c1.total_population);
            System.out.println(c1_string);
        }
    }

    /**
     * implement UseCase30
     */
    public ArrayList<City> getUseCase30(String district)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.district, SUM(city.population) AS total_population " +
                            "FROM city " +
                            "WHERE city.district ='" + district +  "' " +
                            "GROUP BY city.district";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<City> city29 = new ArrayList<City>();

            while (rset.next())
            {
                City c29 = new City();
                c29.district = rset.getString("district");
                c29.total_population = rset.getLong("total_population");
                city29.add(c29);

            }
            return city29;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data of the population of a district.");
            return null;
        }
    }


    public void printUseCase30(ArrayList<City> city) {
        if (city == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-20s", "District", "Population of the district"));
        // Loop over all countries in the list
        for (City c1 : city) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s %-20s",
                    c1.district, c1.total_population);
            System.out.println(c1_string);
        }
    }

    /**
     * UseCase31
     */
    public ArrayList<City> getUseCase31(String city)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population " +
                            "FROM city " +
                            "WHERE city.name ='" + city +  "' ";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<City> city29 = new ArrayList<City>();

            while (rset.next())
            {
                City c29 = new City();
                c29.name = rset.getString("name");
                c29.population = rset.getInt("population");
                city29.add(c29);

            }
            return city29;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get the data of the population of a city.");
            return null;
        }
    }


    public void printUseCase31(ArrayList<City> city) {
        if (city == null) {
            System.out.println("No population data found.\n");
            return;
        }
        // Print header
        System.out.println(String.format("%-20s %-20s", "City", "Population of the city"));
        // Loop over all countries in the list
        for (City c1 : city) {
            if (c1 == null) {
                System.out.println("Null population data found.");
                continue;
            }
            String c1_string = String.format("%-20s %-20s",
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    public static void main(String[] args)
    {
        App a = new App();

        if (args.length < 1) {
            a.connect("localhost:33060", 30000);
        } else {
            a.connect(args[0], Integer.parseInt(args[1]));
        }

        //print UseCase1
        ArrayList<Country> country1 = a.getUseCase1();
        a.printUseCase1(country1);

        //print UseCase2
        ArrayList<Country> country2 = a.getUseCase2("Africa");
        a.printUseCase2(country2);

        //print UseCase3
        ArrayList<Country> country3 = a.getUseCase3("Middle East");
        a.printUseCase3(country3);

        //print UseCase4
        ArrayList<Country> country4 = a.getUseCase4(5);
        a.printUseCase4(country4);

        //print UseCase5
        ArrayList<Country> country5 = a.getUseCase5("Europe", 3);
        a.printUseCase2(country5);

        //print UseCase6
        ArrayList<Country> country6 = a.getUseCase6("Middle East", 9);
        a.printUseCase3(country6);

        //print UseCase7
        ArrayList<City> city7 = a.getUseCase7();
        a.printUseCase7(city7);

        //print UseCase8
        ArrayList<City> city8 = a.getUseCase8("Europe");
        a.printUseCase8(city8);

        //print UseCase9
        ArrayList<City> city9 = a.getUseCase9("Western Europe");
        a.printUseCase9(city9);

        //print UseCase10
        ArrayList<City> city10 = a.getUseCase10("Germany");
        a.printUseCase10(city10);

        //print UseCase11
        ArrayList<City> city11 = a.getUseCase11("São Paulo");
        a.printUseCase11(city11);

        //print UseCase12
        ArrayList<City> city12 = a.getUseCase12(5);
        a.printUseCase12(city12);

        //print UseCase13
        ArrayList<City> city13 = a.getUseCase13(3, "Europe");
        a.printUseCase13(city13);

        //print UseCase14
        ArrayList<City> city14 = a.getUseCase14(3, "Western Europe");
        a.printUseCase14(city14);

        //print UseCase15
        ArrayList<City> city15 = a.getUseCase15(3, "Germany");
        a.printUseCase15(city15);

        //print UseCase16
        ArrayList<City> city16 = a.getUseCase16(2, "Mendoza");
        a.printUseCase16(city16);

        //print UseCase17
        ArrayList<Country> capital17 = a.getUseCase17();
        a.printUseCase17(capital17);

        //print UseCase18
        ArrayList<Country> capital18 = a.getUseCase18("Europe");
        a.printUseCase18(capital18);

        //print UseCase19
        ArrayList<Country> capital19 = a.getUseCase19("Southern Europe");
        a.printUseCase19(capital19);

        //print UseCase20
        ArrayList<Country> capital20 = a.getUseCase20(3);
        a.printUseCase20(capital20);

        //print UseCase21
        ArrayList<Country> capital21 = a.getUseCase21(3, "Europe");
        a.printUseCase21(capital21);

        //print UseCase22
        ArrayList<Country> capital22 = a.getUseCase22(3, "Western Europe");
        a.printUseCase22(capital22);

        //print UseCase23
        ArrayList<Population> p23 = a.getUseCase23();
        a.printUseCase23(p23);

        //print UseCase24
        ArrayList<Population> p24 = a.getUseCase24();
        a.printUseCase24(p24);

        //print UseCase25
        ArrayList<Population> p25 = a.getUseCase25();
        a.printUseCase25(p25);

        //print UseCase26
        ArrayList<Country> p26 = a.getUseCase26();
        a.printUseCase26(p26);

        //print UseCase27
        ArrayList<Country> p27 = a.getUseCase27("Europe");
        a.printUseCase27(p27);

        //print UseCase28
        ArrayList<Country> p28 = a.getUseCase28("Middle East");
        a.printUseCase28(p28);

        //print UseCase29
        ArrayList<Country> p29 = a.getUseCase29("Germany");
        a.printUseCase29(p29);

        //print UseCase30
        ArrayList<City> city30 = a.getUseCase30("Florida");
        a.printUseCase30(city30);

        //print UseCase31
        ArrayList<City> city31 = a.getUseCase31("Edinburgh");
        a.printUseCase31(city31);

        // Disconnect from database
        a.disconnect();

    }

}