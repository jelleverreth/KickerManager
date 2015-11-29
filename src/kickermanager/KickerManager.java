/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

import java.io.Console;
import java.sql.*;
import java.util.Scanner;

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
            Scanner in = new Scanner(System.in);
            String input = "start";

            while (!input.equalsIgnoreCase("stop")) {
                if (in != null) {
                    System.out.print("Selecteer (speler toevoegen/spelers bekijken/speler zoeken/stop): ");
                    input = in.nextLine();
                    switch (input) {
                        case "speler toevoegen":
                            SpelerToevoegen.main(null);
                            break;
                        case "spelers bekijken":
                            SpelersBekijken.main(null);
                            break;
                        case "speler zoeken":
                            SpelerZoeken.main(null);
                            break;

                    }
                } else {
                    input = "stop";
                }

            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());

        }
    }
}
