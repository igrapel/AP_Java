/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRQ2014.Q4;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList;
    
    public Stats(ScoreInfo s)
    {
        scoreList = new ArrayList<ScoreInfo>();
        scoreList.add(s);
    }
    
    public Stats(ScoreInfo s, ScoreInfo t)
    {
        scoreList = new ArrayList<ScoreInfo>();
        scoreList.add(s);
        scoreList.add(t);
    }
    
    public Stats(ScoreInfo s, ScoreInfo t, ScoreInfo q)
    {
        scoreList = new ArrayList<ScoreInfo>();
         scoreList.add(s);
        scoreList.add(t);
         scoreList.add(q);
    }
    public boolean record(int score)
    {
        int i = 0;
        while(i <scoreList.size())
        {
            if(scoreList.get(i).getScore() == score)
            {
            scoreList.get(i).increment();
            return false;
            }
            
            if(score < scoreList.get(i).getScore())
            {
            scoreList.add(i, new ScoreInfo(score));
            return true;     
            }
            i++;
        }
        
        scoreList.add(new ScoreInfo(score));
        return true;      
            
    }
    
public void recordScores(int[] stuScores)
{
  for(int score : stuScores)
    record(score);
}
        
    public static void main(String[] args)
    {
        ScoreInfo s1 = new ScoreInfo(60);
        ScoreInfo s2 = new ScoreInfo(70);
        ScoreInfo s3 = new ScoreInfo(80);
        ScoreInfo s4 = new ScoreInfo(90);
        ScoreInfo s5 = new ScoreInfo(99);
        
        Stats test = new Stats(s1, s2, s3);
        System.out.println(test.record(75));
        
        for(ScoreInfo s : test.scoreList)
        {
            System.out.println(s.getScore());
        }
    }
}
