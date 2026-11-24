/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class LabGradeRecord1 {
    private String studentName;
    private int quizScore;
    private int labScore;
    
   public LabGradeRecord1(String studentName, int quizScore,int labScore){
       this.studentName = studentName;
       if(quizScore < 0 || quizScore > 100){
           this.quizScore = 0;
       }else{
           this.quizScore = quizScore;
       }
       
       if (labScore < 0 || labScore > 100){
           this.labScore = 0;
       }else{
           this.labScore =  labScore;
       }
   }
 public boolean updateScores (int quizScores, int labScores){
     if (quizScore < 0 || quizScore > 100 || labScore < 0 || labScore > 100){
         return false;
     }
     
     this.quizScore = quizScore;
     this.labScore = labScore;
      return true;
 }
 public double getFinalGrade(){
     return (this.quizScore * 0.40) + (this.labScore * 0.60);
 }
 public boolean isPassing(){
     return getFinalGrade() >= 75.0;
 }
}


