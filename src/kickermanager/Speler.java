/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

import java.sql.Date;

/**
 *
 * @author Jelle
 */
public class Speler {

    //algemene attributen
    private String voornaam;
    private String achternaam;
    private Date geboortedatum;
    private boolean geslacht; // false is vrouwelijk true is mannelijk
    private int ranking;
    private int eloRanking;
    private int talent;

    //spits attributen
    private double trekTechniekAanval;
    private double trekSnelheidAanval;
    private double duwTechniekAanval;
    private double duwSnelheidAanval;
    private double rechtdoorTechniek;
    private double rechtdoorSnelheid;
    private double pasMiddenveld;
    private double verdedigingMiddenveld;
    private double kapTechniek;
    private double kapSnelheid;
    private double goalAfdekken;
    private double reflexAanval;
    private double teamworkAanval;
    private double patroonherkenning;

    //keeper attributen
    private double trekTechniekVerdediging;
    private double trekSnelheidVerdediging;
    private double duwTechniekVerdediging;
    private double duwSnelheidVerdediging;
    private double biljaren;
    private double reflexenVerdediging;
    private double spelInzicht;
    private double passenTechniek;
    private double passenSnelheid;
    private double teamworkVerdediging;

    //mentale attributen
    private double agressie;
    private double fairplay;
    private double aanpassingsvermogen;
    private double kalmte;
    private double leiderschap;

    public Speler(String voornaam, String achternaam, Date geboortedatum, boolean geslacht, int ranking, 
            int eloRanking, int talent, double trekTechniekAanval, double trekSnelheidAanval, double duwTechniekAanval, 
            double duwSnelheidAanval, double rechtdoorTechniek, double rechtdoorSnelheid, double pasMiddenveld, 
            double verdedigingMiddenveld, double kapTechniek, double kapSnelheid, double goalAfdekken, double reflexAanval, 
            double teamworkAanval, double patroonherkenning, double trekTechniekVerdediging, double trekSnelheidVerdediging, 
            double duwTechniekVerdediging, double duwSnelheidVerdediging, double biljaren, double reflexenVerdediging, 
            double spelInzicht, double passenTechniek, double passenSnelheid, double teamworkVerdediging, double agressie, 
            double fairplay, double aanpassingsvermogen, double kalmte, double leiderschap) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
        this.ranking = ranking;
        this.eloRanking = eloRanking;
        this.talent = talent;
        this.trekTechniekAanval = trekTechniekAanval;
        this.trekSnelheidAanval = trekSnelheidAanval;
        this.duwTechniekAanval = duwTechniekAanval;
        this.duwSnelheidAanval = duwSnelheidAanval;
        this.rechtdoorTechniek = rechtdoorTechniek;
        this.rechtdoorSnelheid = rechtdoorSnelheid;
        this.pasMiddenveld = pasMiddenveld;
        this.verdedigingMiddenveld = verdedigingMiddenveld;
        this.kapTechniek = kapTechniek;
        this.kapSnelheid = kapSnelheid;
        this.goalAfdekken = goalAfdekken;
        this.reflexAanval = reflexAanval;
        this.teamworkAanval = teamworkAanval;
        this.patroonherkenning = patroonherkenning;
        this.trekTechniekVerdediging = trekTechniekVerdediging;
        this.trekSnelheidVerdediging = trekSnelheidVerdediging;
        this.duwTechniekVerdediging = duwTechniekVerdediging;
        this.duwSnelheidVerdediging = duwSnelheidVerdediging;
        this.biljaren = biljaren;
        this.reflexenVerdediging = reflexenVerdediging;
        this.spelInzicht = spelInzicht;
        this.passenTechniek = passenTechniek;
        this.passenSnelheid = passenSnelheid;
        this.teamworkVerdediging = teamworkVerdediging;
        this.agressie = agressie;
        this.fairplay = fairplay;
        this.aanpassingsvermogen = aanpassingsvermogen;
        this.kalmte = kalmte;
        this.leiderschap = leiderschap;
    }

    
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public boolean isGeslacht() {
        return geslacht;
    }

    public void setGeslacht(boolean geslacht) {
        this.geslacht = geslacht;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getEloRanking() {
        return eloRanking;
    }

    public void setEloRanking(int eloRanking) {
        this.eloRanking = eloRanking;
    }

    public int getTalent() {
        return talent;
    }

    public void setTalent(int talent) {
        this.talent = talent;
    }

    public double getTrekTechniekAanval() {
        return trekTechniekAanval;
    }

    public void setTrekTechniekAanval(double trekTechniekAanval) {
        this.trekTechniekAanval = trekTechniekAanval;
    }

    public double getTrekSnelheidAanval() {
        return trekSnelheidAanval;
    }

    public void setTrekSnelheidAanval(double trekSnelheidAanval) {
        this.trekSnelheidAanval = trekSnelheidAanval;
    }

    public double getDuwTechniekAanval() {
        return duwTechniekAanval;
    }

    public void setDuwTechniekAanval(double duwTechniekAanval) {
        this.duwTechniekAanval = duwTechniekAanval;
    }

    public double getDuwSnelheidAanval() {
        return duwSnelheidAanval;
    }

    public void setDuwSnelheidAanval(double duwSnelheidAanval) {
        this.duwSnelheidAanval = duwSnelheidAanval;
    }

    public double getRechtdoorTechniek() {
        return rechtdoorTechniek;
    }

    public void setRechtdoorTechniek(double rechtdoorTechniek) {
        this.rechtdoorTechniek = rechtdoorTechniek;
    }

    public double getRechtdoorSnelheid() {
        return rechtdoorSnelheid;
    }

    public void setRechtdoorSnelheid(double rechtdoorSnelheid) {
        this.rechtdoorSnelheid = rechtdoorSnelheid;
    }

    public double getPasMiddenveld() {
        return pasMiddenveld;
    }

    public void setPasMiddenveld(double pasMiddenveld) {
        this.pasMiddenveld = pasMiddenveld;
    }

    public double getVerdedigingMiddenveld() {
        return verdedigingMiddenveld;
    }

    public void setVerdedigingMiddenveld(double verdedigingMiddenveld) {
        this.verdedigingMiddenveld = verdedigingMiddenveld;
    }

    public double getKapTechniek() {
        return kapTechniek;
    }

    public void setKapTechniek(double kapTechniek) {
        this.kapTechniek = kapTechniek;
    }

    public double getKapSnelheid() {
        return kapSnelheid;
    }

    public void setKapSnelheid(double kapSnelheid) {
        this.kapSnelheid = kapSnelheid;
    }

    public double getGoalAfdekken() {
        return goalAfdekken;
    }

    public void setGoalAfdekken(double goalAfdekken) {
        this.goalAfdekken = goalAfdekken;
    }

    public double getReflexAanval() {
        return reflexAanval;
    }

    public void setReflexAanval(double reflexAanval) {
        this.reflexAanval = reflexAanval;
    }

    public double getTeamworkAanval() {
        return teamworkAanval;
    }

    public void setTeamworkAanval(double teamworkAanval) {
        this.teamworkAanval = teamworkAanval;
    }

    public double getPatroonherkenning() {
        return patroonherkenning;
    }

    public void setPatroonherkenning(double patroonherkenning) {
        this.patroonherkenning = patroonherkenning;
    }

    public double getTrekTechniekVerdediging() {
        return trekTechniekVerdediging;
    }

    public void setTrekTechniekVerdediging(double trekTechniekVerdediging) {
        this.trekTechniekVerdediging = trekTechniekVerdediging;
    }

    public double getTrekSnelheidVerdediging() {
        return trekSnelheidVerdediging;
    }

    public void setTrekSnelheidVerdediging(double trekSnelheidVerdediging) {
        this.trekSnelheidVerdediging = trekSnelheidVerdediging;
    }

    public double getDuwTechniekVerdediging() {
        return duwTechniekVerdediging;
    }

    public void setDuwTechniekVerdediging(double duwTechniekVerdediging) {
        this.duwTechniekVerdediging = duwTechniekVerdediging;
    }

    public double getDuwSnelheidVerdediging() {
        return duwSnelheidVerdediging;
    }

    public void setDuwSnelheidVerdediging(double duwSnelheidVerdediging) {
        this.duwSnelheidVerdediging = duwSnelheidVerdediging;
    }

    public double getBiljaren() {
        return biljaren;
    }

    public void setBiljaren(double biljaren) {
        this.biljaren = biljaren;
    }

    public double getReflexenVerdediging() {
        return reflexenVerdediging;
    }

    public void setReflexenVerdediging(double reflexenVerdediging) {
        this.reflexenVerdediging = reflexenVerdediging;
    }

    public double getSpelInzicht() {
        return spelInzicht;
    }

    public void setSpelInzicht(double spelInzicht) {
        this.spelInzicht = spelInzicht;
    }

    public double getPassenTechniek() {
        return passenTechniek;
    }

    public void setPassenTechniek(double passenTechniek) {
        this.passenTechniek = passenTechniek;
    }

    public double getPassenSnelheid() {
        return passenSnelheid;
    }

    public void setPassenSnelheid(double passenSnelheid) {
        this.passenSnelheid = passenSnelheid;
    }

    public double getTeamworkVerdediging() {
        return teamworkVerdediging;
    }

    public void setTeamworkVerdediging(double teamworkVerdediging) {
        this.teamworkVerdediging = teamworkVerdediging;
    }

    public double getAgressie() {
        return agressie;
    }

    public void setAgressie(double agressie) {
        this.agressie = agressie;
    }

    public double getFairplay() {
        return fairplay;
    }

    public void setFairplay(double fairplay) {
        this.fairplay = fairplay;
    }

    public double getAanpassingsvermogen() {
        return aanpassingsvermogen;
    }

    public void setAanpassingsvermogen(double aanpassingsvermogen) {
        this.aanpassingsvermogen = aanpassingsvermogen;
    }

    public double getKalmte() {
        return kalmte;
    }

    public void setKalmte(double kalmte) {
        this.kalmte = kalmte;
    }

    public double getLeiderschap() {
        return leiderschap;
    }

    public void setLeiderschap(double leiderschap) {
        this.leiderschap = leiderschap;
    }
    
    
}
