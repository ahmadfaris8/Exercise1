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
public class Exercise1Resume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resume by Ahmad Faris Azam\n ");
        
        biodata b = new biodata();
        workSkills s = new workSkills();
        workExperience e = new workExperience();
        talents t = new talents();
        result r = new result();
        cgpa c = new cgpa();
        
        System.out.println("Name : " + b.name + "\nAge : " + b.age + "\nBirthday : " + b.birth + "\nMaritial Status : " + b.maritialStat + "\nAddress : " + b.address + "\nTelephone : " + b.tel);
        System.out.println("Work Skills : " + s.skills);
        System.out.println("Work Experiences : " + e.experince);
        System.out.println("Talents : " + t.talents);
        System.out.println("Exam Result" + "\nSubject : " + r.subject + "\nGrade : " + r.grade);
        c.displayCgpa();
        System.out.printf("Final Cgpa is %.2f", c.calcCgpa());
    }
    
}
