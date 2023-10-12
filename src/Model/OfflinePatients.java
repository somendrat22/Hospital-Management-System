package Model;

import Database.DoctorDB;
import Database.PatientDB;
import Model.Interfaces.Patient;

public class OfflinePatients implements Patient {

    String pId;
    String patientName;
    String patientIllness;
    String patientGender;

    int patientAge;

    int bedNumber;



    public OfflinePatients(String pId, String patientName, String patientIllness,int patientAge,  String patientGender, int bedNumber) {
        this.pId = pId;
        this.patientName = patientName;
        this.patientIllness = patientIllness;
        this.patientGender = patientGender;
        this.bedNumber = bedNumber;
        this.patientAge = patientAge;

    }


    public String getPatientName(){
        return patientName;
    }



    public void getMyDetails(){
        System.out.println("Hey I am patient " + patientName);
        System.out.println("My patientId " + pId );
        System.out.println("My Illness is " + patientIllness);
        System.out.println("My bed number is" + bedNumber);
    }

    public String getPid(){
        return pId;
    }
    public void getMyBedNumber(){
        System.out.println(bedNumber);
    }


}
