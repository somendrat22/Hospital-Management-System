package Model;

import Database.DoctorDB;
import Database.PatientDB;
import Model.Interfaces.Doctor;

public class Hospital {

    private String hospitalName;
    private int totalBeds;
    private String hospitalAddress;
    private int hospitalPhoneNumber;

    DoctorDB doctorsDatabase;
    PatientDB patientsDatabase;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
        doctorsDatabase = new DoctorDB();
        patientsDatabase = new PatientDB();
    }

    public void getHospitalName(){
        System.out.println(hospitalName);

    }

    public void getTotalBeds(){
        System.out.println(totalBeds);
    }

    public void getHospitalAddress(){
        System.out.println(hospitalAddress);
    }

    public void getHospitalPhoneNumber(){
        System.out.println(hospitalPhoneNumber);
    }


    public void getTotalPatientsAvailble(){

    }

    public void getTotalDoctors(){

    }

    public void getPatientDetails(String pId){

    }

    public void getDoctorDetails(String docId){

    }

    public void admitPatient(String patientName, String patientIllness, int patientAge, String patientGender ){

    }

    // 12
    // HSP13
    public void appointDoctor(String doctorName, String doctorDegree, int doctorAge, String doctorSpeciality){
        int totalDocs  = doctorsDatabase.getTotalDocs();
        String docId = "HSP" + (totalDocs + 1);
        Doctor doc = new OfflineDoctors(docId, doctorName, doctorDegree, doctorSpeciality, doctorAge);
        doctorsDatabase.addDoctorToDB(doc);
    }



}
