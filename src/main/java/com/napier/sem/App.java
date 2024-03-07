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
            System.out.println("Failed to get all the countries in a continent organised by largest population to smallest");
            return null;
        }
    }



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
                            + "ORDER BY country.population ASC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            ArrayList<Country> country5 = new ArrayList<Country>();
            while (rset.next())
            {
                Country country = new Country();
                country.name = rset.getString("name");
                country.population = rset.getInt("population");
                country5.add(country);
            }
            return country5;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get all the countries in a continent organised by largest population to smallest");
            return null;
        }
    }

    /*public Country getUseCase5()
    {


        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                     "SELECT country.name, country.population "
                    + "FROM country "
                    + "ORDER BY country.population ASC";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // Return new country if valid.
            // Check one is returned
            if (rset.next())
            {

                Country country5 = new Country();
                country5.name = rset.getString("name");
                country5.population = rset.getInt("population");

                return country5;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country");
            return null;
        }
    }*/

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        //print UseCase1
        ArrayList<Country> country = a.getUseCase1("Africa");
        a.printUseCase1(country);

        ArrayList<Country> country5 = a.getUseCase5();
        a.printUseCase5(country5);

        ArrayList<City> city10 = a.getUseCase10();
        a.printUseCase10(city10);

        ArrayList<City> city11 = a.getUseCase11();
        a.printUseCase11(city11);

        ArrayList<City> city12 = a.getUseCase12();
        a.printUseCase12(city12);

        ArrayList<City> city13 = a.getUseCase13();
        a.printUseCase13(city13);

        ArrayList<City> city14 = a.getUseCase14();
        a.printUseCase14(city14);

        ArrayList<City> city15 = a.getUseCase15();
        a.printUseCase15(city15);

        ArrayList<Capital> capital16 = a.getUseCase16();
        a.printUseCase16(capital16);

        ArrayList<Capital> capital17 = a.getUseCase17();
        a.printUseCase17(capital17);

        // Disconnect from database
        a.disconnect();
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
            String c1_string = String.format("%-20s %-15s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.continent, c1.population);
            System.out.println(c1_string);
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
            String c1_string = String.format("%-20s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.population);
            System.out.println(c1_string);
        }
    }

    public ArrayList<City> getUseCase10()
    {
        try
        {
            // Create the SQL Statement
            Statement stmt = con.createStatement();

            // Create string for SQL statement
            String strSelect =
                    "SELECT city.name, city.population"
                            + "FROM district"
                            + "ORDER BY city.population ASC";
            // Execute the SQL Statement
            ResultSet rset = stmt.executeQuery(strSelect);

            ArrayList<City> city10 = new ArrayList<>();
            while (rset.next())
            {
                City city = new City();
                city.name = rset.getString("name");
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
}