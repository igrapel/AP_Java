package com.company;
import java.sql.*;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Response
{
    //SQL Server connection details
    private String user; //igrapel
    private String password; //gables21
    String url = "jdbc:sqlserver://DESKTOP-TR5JF24\\SQLEXPRESS;databaseName=Contacts";
    String time;
    //BIT IO connection details
    String sql_statement;
    Connection c;
    String bitApiKey;
    String bitDB;
    String bitUser;
    String bitHost;
    String bitPort;
    Properties props;
    /**
     *Costructor
     * @param user  SQL server user name (igrapel)
     * @param pw    SQL server password (gables21)
     */
    public Response(String user, String pw) {
        try {
            // Step 1: "Load" the JDBC driver
            //Class.forName("com.imaginary.sql.msql.MsqlDriver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Step 2: Establish the connection to the database
            this.user = user;
            password = pw;

            try {
                Connection conn = DriverManager.getConnection(url, this.user, password);
            } catch (SQLException e) {
                System.out.println("SQL server connection error");
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

        //Bit io connection details
        c = null;
        bitApiKey = "L3zS_SjMWrcphg3R5VHcP7RQ3hXY";
        bitDB = "bitdotio";
        bitUser = "igrapel_demo_db_connection";
        bitHost = "db.bit.io";
        bitPort = "5432"; // We keep this as a string here as we are concact'ing it into the connection string
        props = new Properties();
        props.setProperty("sslmode", "require");
        props.setProperty("user", bitUser);
        props.setProperty("password", bitApiKey);
    }

    /**
     * Store correspondence
     * @param student
     * @param contact
     * @param date
     * @param comment
     */
    public void storeCorrespondenseLocal(String student, String contact, String date, String comment)
    {
        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement statement = conn.createStatement();
            String SQL_cols = "(Student, email, date_sent, Comment)";
            String SQL_values = "VALUES ('" + student + "', '" + contact + "', '" + date + "', '" + comment + "')";
            String SQL_statement = "INSERT INTO Parents" + SQL_cols +SQL_values;
            System.out.println(SQL_statement);
            statement.executeUpdate(SQL_statement);
        } catch(SQLException e){
            System.out.println("There is an error");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param summaryOfParentResponse   Summary of parent response
     * @param time                      Time of correspondence in format: 2021-11-16 17:40:25.0000000
     *
     * Updates the response column based on time of correspondence
     */
    public void updateResponse(String summaryOfParentResponse, String time)
    {
        //SQL Server
        try
        {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement statement = conn.createStatement();
            this.time = time;
            String comment = summaryOfParentResponse;
            String SQL_statement = "UPDATE Parents SET response = '" + comment + "' WHERE date_sent = '" + this.time + "'";
            System.out.println(SQL_statement);
            statement.executeUpdate(SQL_statement);
        }
        catch(SQLException e)
        {
            System.out.println("There is an error");
            e.printStackTrace();
        }

        //BIT io
        //set time
        int indexSpace = this.time.indexOf(" ");
        String date_bit = this.time.substring(0,indexSpace) + "T" + this.time.substring(indexSpace + 1);

        sql_statement = "UPDATE \"igrapel/Parents\".\"parents\" SET response = " + "'" + summaryOfParentResponse + "' WHERE date = '" + date_bit + "'";
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://" + bitHost + ":" + bitPort + "/" + bitDB, props);
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql_statement);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        Response test = new Response("igrapel", "gables21");
        test.updateResponse("Parent emailed she will \"take care of situation\"",
                "2021-11-15 17:09:50.0000000");
    }
}
