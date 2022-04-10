package data_structures;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class UseMap {

    private static Iterator<java.lang.Object> Object;

    public static void main(String[] args, Iterator<java.lang.Object> Map) throws Exception {
        /*
         * Implement code to demonstrate how to interact with a database connection, using a Map
         * You must insert the map into a table, and then you must submit & execute a query to retrieve
         * all the data_structures.data (retrieval does not need to be stored as a map)
         *
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */


        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;

        HashMap<Object, Object> map = new HashMap<>();
        map.put(8454, "lamia");
        map.put(4567, "azar");
        map.put(7898, "rahim");

        // Retrieving "Keys" & "Values" using an Iterator
        Iterator<Object> mapIter = map.keySet().iterator();
        Object key;

        while (mapIter.hasNext()) {
            key = mapIter.next();
            System.out.println("KEY: " + key);
            System.out.println("VALUE: " + key);


             SharedStepsDatabase(); {
                Properties prop = null;

               // try {
                 //   prop = loadProperties();
                //} catch (IOException ioException) {
                  //  ioException.printStackTrace();
                //}

                if (prop != null) {
                    String driverClass = prop.getProperty("MYSQLJDBC.driver");
                    String host = prop.getProperty("MYSQLJDBC.host");
                    String user = prop.getProperty("MYSQLJDBC.userName");
                    String password = prop.getProperty("MYSQLJDBC.password");

                    try {
                        Class.forName(driverClass);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    try {
                        connect = DriverManager.getConnection(host, user, password);
                        System.out.println("CONNECTED TO DATABASE!");
                    } catch (SQLException sql) {
                        System.out.println("\nUNABLE TO ESTABLISH CONNECTION TO DATABASE:\n" + sql.getMessage() + "\n");
                    }
                }
            }


            String tableName = ("'test_sort");
                try {
                    ps = connect.prepareStatement("DROP TABLE IF EXISTS " + tableName + ";");
                    ps.executeUpdate();
                    ps = connect.prepareStatement("CREATE TABLE " + tableName + " (`key` VARCHAR(45) DEFAULT 1 NOT NULL, `value` VARCHAR(45) NULL);");
                    ps.executeUpdate();

                    StringBuilder sql = new StringBuilder("INSERT INTO ").append(tableName).append(" (`key`, `value`)").append(" VALUES (");


                         for (java.lang.Object o : map.keySet()) {

                         }
                     {
                        sql.append("'").append(key).append("', '").append(map.get(key)).append("'), (");
                    }
                    String sqlString = sql.toString();
                    sqlString = sqlString.substring(0, sqlString.length() - 3);
                    ;

                    ps = connect.prepareStatement(sqlString);
                    ps.executeUpdate();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    private static void SharedStepsDatabase() {
    }
}
