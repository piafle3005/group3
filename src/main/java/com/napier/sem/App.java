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

    //Usecase 1
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
            String c1_string = String.format("%-20s %-15s %,-12d", // Verwenden Sie , zur Formatierung der Population mit Tausender-Trennzeichen
                    c1.name, c1.region, c1.population);
            System.out.println(c1_string);
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

        // Disconnect from database
        a.disconnect();
    }

}