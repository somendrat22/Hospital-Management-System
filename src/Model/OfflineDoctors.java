package Model;

import Model.Interfaces.Doctor;

public class OfflineDoctors implements Doctor {

   private String docId;
   private String docName;
   private String docDegree;
   private String docSpeciality;
   private int docAge;

    OfflineDoctors(String docId, String docName, String docDegree, String docSpeciality, int docAge){
        this.docId = docId;
        this.docDegree = docDegree;
        this.docName = docName;
        this.docAge = docAge;
        this.docSpeciality = docSpeciality;
    }


    public void diagnosis(){
        System.out.println("Doing diagnosis offline");
    }

    public void getMyPatients(){

    }

    public void getMyDetails(){
        System.out.println("Hey I am doctor " + docName);
        System.out.println("My doc degree is " + docDegree );
        System.out.println("My speiality is " + docSpeciality);
        System.out.println("My afe is " + docAge);
    }
}
