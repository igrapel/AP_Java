package com.company.q4;

public class StudentRecord {
   private int[] scores;


   private double average(int first, int last) {
      int sum = 0;
      for (int i = first; i <= last; i++) {
         sum += scores[i];
      }
      return (double) sum / (last - first + 1);
   }

   private boolean hasImproved() {
      for (int i = 1; i < scores.length; i++) {
         if (scores[i] > scores[i + 1]) {
            return false;
         }
      }
      return true;
   }

   public double finalAverage() {
      if (hasImproved()) { return average(scores.length / 2, scores.length);}
      else { return average(0, scores.length); }
   }
}
