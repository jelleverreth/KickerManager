/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jelle
 */
public class SpelersBekijken {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickergamedb", "root", "");
            Statement stmt = con.createStatement();
            String query = "select * from tbl_speler";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String voornaam = rs.getString("Speler_Voornaam");
                String achternaam = rs.getString("Speler_Achternaam");
                System.out.println(voornaam + " " + achternaam);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
