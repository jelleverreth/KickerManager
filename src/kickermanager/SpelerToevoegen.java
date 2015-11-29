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
import java.util.Scanner;

/**
 *
 * @author Jelle
 */
public class SpelerToevoegen {

    public static void main(String[] args) {
        //declaratie variabelen
        try {
            Scanner in = new Scanner(System.in);

            String voornaam;
            String achternaam;
            String geboortedatum;
            String ranking;
            String eloRanking;
            String talent;
            String trekTechniekAanval;
            String trekSnelheidAanval;
            String duwTechniekAanval;
            String duwSnelheidAanval;
            String rechtdoorTechniek;
            String rechtdoorSnelheid;
            String pasMiddenveld;
            String verdedigingMiddenveld;
            String kapTechniek;
            String kapSnelheid;
            String goalAfdekken;
            String reflexAanval;
            String teamworkAanval;
            String patroonherkenning;
            String trekTechniekVerdediging;
            String trekSnelheidVerdediging;
            String duwTechniekVerdediging;
            String duwSnelheidVerdediging;
            String biljaren;
            String reflexenVerdediging;
            String spelInzicht;
            String passenTechniek;
            String passenSnelheid;
            String teamworkVerdediging;
            String agressie;
            String fairplay;
            String aanpassingsvermogen;
            String kalmte;
            String leiderschap;
            String geslacht;

            //lezen spelersstatistieken
            System.out.println("Voornaam:");
            voornaam = in.nextLine();
            System.out.println("Achternaam:");
            achternaam = in.nextLine();
            System.out.println("Geboortedatum (voorbeeld: 1992-5-24):");
            geboortedatum = in.nextLine();
            System.out.println("Ranking (4/3/2/1):");
            ranking = in.nextLine();
            System.out.println("Elo ranking:");
            eloRanking = in.nextLine();
            System.out.println("Talent:");
            talent = in.nextLine();

            do {
                System.out.println("Geslacht (man/vrouw):");
                geslacht = in.nextLine();
                switch (geslacht) {
                    case "man":
                        geslacht = "0";
                        break;
                    case "vrouw":
                        geslacht = "1";
                        break;
                    default:
                        geslacht = "opnieuw";
                        break;
                }
            } while (geslacht.equals("opnieuw"));

            System.out.println("Agressie:");
            agressie = in.nextLine();

            System.out.println("Fairplay:");
            fairplay = in.nextLine();

            System.out.println("Aanpassingsvermogen:");
            aanpassingsvermogen = in.nextLine();

            System.out.println("Kalmte:");
            kalmte = in.nextLine();

            System.out.println("Leiderschap:");
            leiderschap = in.nextLine();

            System.out.println("Trektechniek aanval:");
            trekTechniekAanval = in.nextLine();

            System.out.println("Treksnelheid aanval:");
            trekSnelheidAanval = in.nextLine();

            System.out.println("Duwtechniek aanval:");
            duwTechniekAanval = in.nextLine();

            System.out.println("Duwsnelheid aanval:");
            duwSnelheidAanval = in.nextLine();

            System.out.println("Rechtdoortechniek:");
            rechtdoorTechniek = in.nextLine();

            System.out.println("Rechtdoorsnelheid:");
            rechtdoorSnelheid = in.nextLine();

            System.out.println("Pas middenveld:");
            pasMiddenveld = in.nextLine();

            System.out.println("Verdediging middenveld:");
            verdedigingMiddenveld = in.nextLine();

            System.out.println("Kaptechniek:");
            kapTechniek = in.nextLine();

            System.out.println("Kapsnelheid:");
            kapSnelheid = in.nextLine();

            System.out.println("Goal afdekken:");
            goalAfdekken = in.nextLine();

            System.out.println("Reflex aanval:");
            reflexAanval = in.nextLine();

            System.out.println("Teamwork aanval:");
            teamworkAanval = in.nextLine();

            System.out.println("Patroonherkenning:");
            patroonherkenning = in.nextLine();

            System.out.println("Trektechniek verdediging:");
            trekTechniekVerdediging = in.nextLine();

            System.out.println("Treksnelheid verdediging:");
            trekSnelheidVerdediging = in.nextLine();

            System.out.println("Duwtechniek verdediging:");
            duwTechniekVerdediging = in.nextLine();

            System.out.println("Duwsnelheid verdediging:");
            duwSnelheidVerdediging = in.nextLine();

            System.out.println("Biljaren:");
            biljaren = in.nextLine();

            System.out.println("Verdedigingsreflexen:");
            reflexenVerdediging = in.nextLine();

            System.out.println("Spelinzicht");
            spelInzicht = in.nextLine();

            System.out.println("Techniek van passen:");
            passenTechniek = in.nextLine();

            System.out.println("Snelheid van passen:");
            passenSnelheid = in.nextLine();

            System.out.println("Teamwork verdediging:");
            teamworkVerdediging = in.nextLine();

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kickergamedb", "root", "");
            Statement stmt = con.createStatement();

            String query = "INSERT INTO `tbl_speler`(`Speler_Voornaam`, `Speler_Achternaam`, `Speler_Geboortedatum`, `Speler_Ranking`, `Speler_Elo_Ranking`, `Speler_Talent`, `Speler_TrekTechniekAanval`, `Speler_TrekSnelheidAanval`, `Speler_DuwTechniekAanval`, `Speler_DuwSnelheidAanval`, `Speler_RechtdoorTechniek`, `Speler_RechtdoorSnelheid`, `Speler_PasMiddenveld`, `Speler_VerdedigingMiddenveld`, `Speler_KapTechniek`, `Speler_KapSnelheid`, `Speler_GoalAfdekken`, `Speler_ReflexAanval`, `Speler_TeamworkAanval`, `Speler_Patroonherkenning`, `Speler_TrekTechniekVerdediging`, `Speler_TrekSnelheidVerdediging`, `Speler_DuwTechniekVerdediging`, `Speler_DuwSnelheidVerdediging`, `Speler_Biljaren`, `Speler_ReflexenVerdediging`, `Speler_SpelInzicht`, `Speler_PassenTechniek`, `Speler_PassenSnelheid`, `Speler_TeamworkVerdediging`, `Speler_Agressie`, `Speler_Fairplay`, `Speler_Aanpassingsvermogen`, `Speler_Kalmte`, `Speler_Leiderschap`, `Speler_Geslacht`) VALUES ( \"" + voornaam + "\",\"" + achternaam + "\",\"" + geboortedatum + "\",\"" + ranking + "\",\"" + eloRanking + "\",\"" + talent + "\",\"" + trekTechniekAanval + "\",\"" + trekSnelheidAanval + "\",\"" + duwTechniekAanval + "\",\"" + duwSnelheidAanval + "\",\"" + rechtdoorTechniek + "\",\"" + rechtdoorSnelheid + "\",\"" + pasMiddenveld + "\",\"" + verdedigingMiddenveld + "\",\"" + kapTechniek + "\",\"" + kapSnelheid + "\",\"" + goalAfdekken + "\",\"" + reflexAanval + "\",\"" + teamworkAanval + "\",\"" + patroonherkenning + "\",\"" + trekTechniekVerdediging + "\",\"" + trekSnelheidVerdediging + "\",\"" + duwTechniekVerdediging + "\",\"" + duwSnelheidVerdediging + "\",\"" + biljaren + "\",\"" + reflexenVerdediging + "\",\"" + spelInzicht + "\",\"" + passenTechniek + "\",\"" + passenSnelheid + "\",\"" + teamworkVerdediging + "\",\"" + agressie + "\",\"" + fairplay + "\",\"" + aanpassingsvermogen + "\",\"" + kalmte + "\",\"" + leiderschap + "\",\"" + geslacht + "\")" ;
            stmt.executeUpdate(query);
            
            //INSERT INTO `tbl_speler`(`Speler_Voornaam`, `Speler_Achternaam`, `Speler_Geboortedatum`, `Speler_Ranking`, `Speler_Elo_Ranking`, `Speler_Talent`, `Speler_TrekTechniekAanval`, `Speler_TrekSnelheidAanval`, `Speler_DuwTechniekAanval`, `Speler_DuwSnelheidAanval`, `Speler_RechtdoorTechniek`, `Speler_RechtdoorSnelheid`, `Speler_PasMiddenveld`, `Speler_VerdedigingMiddenveld`, `Speler_KapTechniek`, `Speler_KapSnelheid`, `Speler_GoalAfdekken`, `Speler_ReflexAanval`, `Speler_TeamworkAanval`, `Speler_Patroonherkenning`, `Speler_TrekTechniekVerdediging`, `Speler_TrekSnelheidVerdediging`, `Speler_DuwTechniekVerdediging`, `Speler_DuwSnelheidVerdediging`, `Speler_Biljaren`, `Speler_ReflexenVerdediging`, `Speler_SpelInzicht`, `Speler_PassenTechniek`, `Speler_PassenSnelheid`, `Speler_TeamworkVerdediging`, `Speler_Agressie`, `Speler_Fairplay`, `Speler_Aanpassingsvermogen`, `Speler_Kalmte`, `Speler_Leiderschap`, `Speler_Geslacht`) VALUES ( \"" + voornaam + "\",[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10],[value-11],[value-12],[value-13],[value-14],[value-15],[value-16],[value-17],[value-18],[value-19],[value-20],[value-21],[value-22],[value-23],[value-24],[value-25],[value-26],[value-27],[value-28],[value-29],[value-30],[value-31],[value-32],[value-33],[value-34],[value-35],[value-36],[value-37])
            System.out.println("Speler toegevoegd");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
