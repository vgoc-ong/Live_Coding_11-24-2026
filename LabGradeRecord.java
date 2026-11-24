/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author GOC-ONG_CPE113
 */
public class LabGradeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LabGradeRecord1 ana = new LabGradeRecord1 ("ana", 80, 90);
     LabGradeRecord1 ben = new LabGradeRecord1 ("ben",101,85);
    
     //Pag compute sa grade ni ANA !
    System.out.println(ana.getFinalGrade() + " | Passing: " + ana.isPassing());
      
    //Pag compute sa grade mi BEN !
    System.out.println(ben.getFinalGrade() + " | Passing: " + ben.isPassing());
    
    
    // Computation sa grades ni ANA og BEN!
    System.out.println(ana.updateScores(95, 101) + " | Grade: " + ana.getFinalGrade());
    System.out.println(ana.updateScores(74, 75) + " | " + ana.getFinalGrade() + " | Passing: " + ana.isPassing());
    System.out.println(ana.updateScores(75, 75) + " | " + ana.getFinalGrade() + " | Passing: " + ana.isPassing());
    System.out.println("Ben: " + ben.getFinalGrade() + " | Passing: " + ben.isPassing());
    }
    
}


// ANSWER THE QUESTION
// If you assign the first sccores, the second one will be invalid it leaves the
// object in partial modified state where it will become invalid. Validating 
// both inputs guarantees an valid scores on both and it never changes.