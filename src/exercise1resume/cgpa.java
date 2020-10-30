/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1resume;

/**
 *
 * @author user
 */
public class cgpa {
    double gpa[] = {3.68, 3.60, 3.59, 3.55, 3.50};
    double cgpa = 3.58;
    double total = 0;
    double average;
    
    public void displayCgpa(){
    System.out.println("Cgpa Results : ");
    System.out.println("Sem 1 = " + gpa[0]);
    System.out.println("Sem 2 = " + gpa[1]);
    System.out.println("Sem 3 = " + gpa[2]);
    System.out.println("Sem 4 = " + gpa[3]);
    System.out.println("Sem 5 = " + gpa[4]);    
}
    public double calcCgpa(){
        for (int i = 0; i<gpa.length; i++){
            total+=gpa[i];
        }
        if (gpa.length != 0){
            average = total/gpa.length;
        }
        else {
            average = 0.00;
        }
        return average;
    }
    
}
