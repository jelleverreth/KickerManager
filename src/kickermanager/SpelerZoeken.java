/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Jelle
 */
public class SpelerZoeken {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            String input = "start";
            System.out.print("Zoeken op voornaam: ");
            input = in.nextLine();

            //connectie met databank en uitvoeren van sqlcommando
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickergamedb", "root", "");
            Statement stmt = con.createStatement();
            String query = "select * from tbl_speler where Speler_Voornaam LIKE \"" + input + "\"";
            ResultSet rs = stmt.executeQuery(query);

            //ophalen van spelerstatistieken
            while (rs.next()) {
                String id = rs.getString("Speler_ID");
                String voornaam = rs.getString("Speler_Voornaam");
                String achternaam = rs.getString("Speler_Achternaam");
                String geboortedatum = rs.getString("Speler_Geboortedatum");
                String ranking = rs.getString("Speler_Ranking") + "p";
                String eloRanking = rs.getString("Speler_Elo_Ranking");
                String talent = rs.getString("Speler_Talent");
                String trekTechniekAanval = rs.getString("Speler_TrekTechniekAanval");
                String trekSnelheidAanval = rs.getString("Speler_TrekSnelheidAanval");
                String duwTechniekAanval = rs.getString("Speler_DuwTechniekAanval");
                String duwSnelheidAanval = rs.getString("Speler_DuwSnelheidAanval");
                String rechtdoorTechniek = rs.getString("Speler_RechtdoorTechniek");
                String rechtdoorSnelheid = rs.getString("Speler_RechtdoorSnelheid");
                String pasMiddenveld = rs.getString("Speler_PasMiddenveld");
                String verdedigingMiddenveld = rs.getString("Speler_VerdedigingMiddenveld");
                String kapTechniek = rs.getString("Speler_KapTechniek");
                String kapSnelheid = rs.getString("Speler_KapSnelheid");
                String goalAfdekken = rs.getString("Speler_GoalAfdekken");
                String reflexAanval = rs.getString("Speler_ReflexAanval");
                String teamworkAanval = rs.getString("Speler_TeamworkAanval");
                String patroonherkenning = rs.getString("Speler_Patroonherkenning");
                String trekTechniekVerdediging = rs.getString("Speler_TrekTechniekVerdediging");
                String trekSnelheidVerdediging = rs.getString("Speler_TrekSnelheidVerdediging");
                String duwTechniekVerdediging = rs.getString("Speler_DuwTechniekVerdediging");
                String duwSnelheidVerdediging = rs.getString("Speler_DuwSnelheidVerdediging");
                String biljaren = rs.getString("Speler_Biljaren");
                String reflexenVerdediging = rs.getString("Speler_ReflexenVerdediging");
                String spelInzicht = rs.getString("Speler_SpelInzicht");
                String passenTechniek = rs.getString("Speler_PassenTechniek");
                String passenSnelheid = rs.getString("Speler_PassenSnelheid");
                String teamworkVerdediging = rs.getString("Speler_TeamworkVerdediging");
                String agressie = rs.getString("Speler_Agressie");
                String fairplay = rs.getString("Speler_Fairplay");
                String aanpassingsvermogen = rs.getString("Speler_Aanpassingsvermogen");
                String kalmte = rs.getString("Speler_Kalmte");
                String leiderschap = rs.getString("Speler_Leiderschap");
                String geslacht = rs.getString("Speler_Geslacht");
                if (geslacht.equals("0")) {
                    geslacht = "man";
                } else {
                    geslacht = "vrouw";
                }

                //afdrukken van spelerstatistieken
                System.out.println("ID:" + id);
                System.out.println("Naam: " + voornaam + " " + achternaam);
                System.out.println("Geboortedatum: " + geboortedatum);
                System.out.println("Geslacht: " + geslacht);
                System.out.println("Ranking: " + ranking);
                System.out.println("Elo ranking: " + eloRanking);
                System.out.println("Talent:" + talent);
                System.out.println("Agressie: " + agressie);
                System.out.println("Fairplay: " + fairplay);
                System.out.println("Aanpassingsvermogen: " + aanpassingsvermogen);
                System.out.println("Kalmte: " + kalmte);
                System.out.println("Leiderschap: " + leiderschap);
                System.out.println("Trektechniek aanval: " + trekTechniekAanval);
                System.out.println("Treksnelheid aanval: " + trekSnelheidAanval);
                System.out.println("Duwtechniek aanval: " + duwTechniekAanval);
                System.out.println("Duwsnelheid aanval: " + duwSnelheidAanval);
                System.out.println("Rechtdoortechniek: " + rechtdoorTechniek);
                System.out.println("Rechtdoorsnelheid: " + rechtdoorSnelheid);
                System.out.println("Pas middenveld: " + pasMiddenveld);
                System.out.println("Verdediging middenveld: " + verdedigingMiddenveld);
                System.out.println("Kaptechniek: " + kapTechniek);
                System.out.println("Kapsnelheid: " + kapSnelheid);
                System.out.println("Goal afdekken: " + goalAfdekken);
                System.out.println("Reflex aanval: " + reflexAanval);
                System.out.println("Teamwork aanval: " + teamworkAanval);
                System.out.println("Patroonherkenning: " + patroonherkenning);
                System.out.println("Trektechniek verdediging: " + trekTechniekVerdediging);
                System.out.println("Treksnelheid verdediging: " + trekSnelheidVerdediging);
                System.out.println("Duwtechniek verdediging: " + duwTechniekVerdediging);
                System.out.println("Duwsnelheid verdediging: " + duwSnelheidVerdediging);
                System.out.println("Biljaren: " + biljaren);
                System.out.println("Reflex verdediging: " + reflexenVerdediging);
                System.out.println("Spelinzicht: " + spelInzicht);
                System.out.println("Pastechniek: " + passenTechniek);
                System.out.println("Passnelheid: " + passenSnelheid);
                System.out.println("Teamwork verdediging: " + teamworkVerdediging);

                input = "x";
                while (input.equals("x")) {
                    System.out.println("Selecteer (aanpassen/verwijderen/terug)");
                    input = in.nextLine();
                    switch (input) {
                        case ("aanpassen"):
                            break;
                        case ("verwijderen"):
                            
                            break;
                        case ("terug"):
                            break;
                        default:
                            input = "x";
                            break;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());

        }
    }
}
