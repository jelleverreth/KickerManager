/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickermanager;

/**
 *
 * @author Jelle
 */
public class Match {

    private int goalsThuisPloeg;
    private int goalsUitPloeg;
    private Speler[] thuisPloeg = new Speler[2];
    private Speler[] uitPloeg = new Speler[2];

    {
        goalsThuisPloeg = 0;
        goalsUitPloeg = 0;
    }

    public Match(Speler thuisVer, Speler thuisAan, Speler uitVer, Speler uitAan) {
        thuisPloeg[0] = thuisVer;
        thuisPloeg[1] = thuisAan;
        uitPloeg[0] = uitVer;
        uitPloeg[1] = uitAan;
    }

}
