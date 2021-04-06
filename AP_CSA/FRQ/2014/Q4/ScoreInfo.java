/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRQ2014.Q4;

public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int sScore) 
    {
        score = sScore;
        numStudents = 1;
    }
    
    public void increment()
    { numStudents++; }

    public int getScore() {
        return score;
    }

    public int getNumStudents() {
        return numStudents;
    }
    
    
    
    
}
