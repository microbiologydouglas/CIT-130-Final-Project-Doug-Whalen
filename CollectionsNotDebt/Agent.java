/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsNotDebt;

class Agent {
    private int idNumber;
    private String codeName;
    private String areaOfFocus;
    private String realName;    
    private boolean assStatus;
    private long contactInfo;
    private double stealthiness;
    private boolean secretCoverUpheld;
    
    public int getIDNumber() {
        return idNumber;
    }
    
    public String getCodeName() {
        return codeName;
    }
        
    public String getAreaOfFocus() {
        return areaOfFocus;
    }
    
    public String getRealName() {
        return realName;
    }
    
    public boolean isAssStatus() {
        return assStatus;
    }
    
    public long getContactInfo() {
        return contactInfo;
    }
    
    public double getStealthiness() {
        return stealthiness;
    }
    
    public boolean getSecretCoverUpheld() {
        return secretCoverUpheld;
    }
    
    public void setIDNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public void setCodeName (String codeName) {
        this.codeName = codeName;
    }
       
    public void setAreaOfFocus (String areaOfFocus) {
        this.areaOfFocus = areaOfFocus;
    }
    
    public void setRealName (String realName) {
        this.realName = realName;
    }
    
    public void setAssStatus (boolean assStatus) {
        this.assStatus = assStatus;
    }
    
    public void setContactInfo (long contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public void setStealthiness (double stealthiness) {
        this.stealthiness = stealthiness;
    }
    
    public void setSecretCoverUpheld (boolean secretCoverUpheld) {
        this.secretCoverUpheld = secretCoverUpheld;
    }
    
} // close class Agent
    
    
    
    /*public String getWholeNOCList() {
        return "Agent ID: " + this.idNumber + "\n";
    }
    */
    



/* public class ParentalPractice {

    public static void main(String[] args) {
        Student stud = new Student();
        EleSchoolStudent elemStud = new EleSchoolStudent();
        stud.age = 19;
        stud.gender = "female";
        stud.name = "Jill St. John";
        stud.studID = 0010001007;
    */
        /* I can store a subclass in a variable typed
        to the superclass! Handy because I can write
        code that operates on the superclass before
        the subclass has even been written
        */
    /*    
        stud = elemStud;
        EleSchoolStudent anotherElemStudVar;
        anotherElemStudVar = (EleSchoolStudent)stud;
        anotherElemStudVar.age = 6;
        EleSchoolStudent ESS1;
        ESS1 = (EleSchoolStudent)stud;
        ESS1.age = 5;
        ESS1.allergies = "NONE";
        ESS1.emergencyContactPhone = 2345678901;
        ESS1.gender = "M";
        ESS1.name = "Macauley Caulkin";
        ESS1.studID = 1989;
        HSStudent HSS1 = new HSStudent();
        HSS1.GPA = 2.5f;
        HSS1.age = 16;
        HSS1.allergies = "homework";
        HSS1.custodialParent = "Archie Bunker";
        HSS1.emergencyContactPhone = 7778888;
        HSS1.extracurriculars = "marijuana";
        HSS1.gender = "M";
        HSS1.name = "Spiccoli";
        HSS1.studID = 666;
        HSS1.totDetHours = 10500;
        HSS1.walker = true;
        CollegeStudent CSS1 = new CollegeStudent();
        CSS1.GPA = 3.8f;
        CSS1.age = 23;
        CSS1.allergies = "juniper";
        CSS1.doubleMajor = false;
        CSS1.emergencyContactPhone = 8889999;
        CSS1.gender = "F";
        CSS1.legStateRes = "MO";
        CSS1.major = "Biochemistry";
        CSS1.name = "Amy Farrah Fowler";
        CSS1.studID = 1234321;
        
        */
        
        /* See section 11.9: demonstrate to your neighbor that
        you can use instanceof correctly and carry out a typecast
        
                
        System.out.println("This student's info: " + stud.age  + stud.gender + stud.name + stud.studID);
        
        
       
    }
    
}



/**
 *
 * @author douglas.whalen554

public class NOCList {
    
}

*/
