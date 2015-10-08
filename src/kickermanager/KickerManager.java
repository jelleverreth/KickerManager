/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

import java.sql.*;

/**
 *
 * @author Jelle & Evert
 */
public class KickerManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       // TODO code application logic here
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickergamedb", "root", "");
            Statement stmt = con.createStatement();
            String query = "select * from test";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("voornaam");
                System.out.println(name);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
