package Model;

public class Hospital {

    private String hospitalName;
    private int totalBeds;
    private String hospitalAddress;
    private int hospitalPhoneNumber;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
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


    public void appointDoctor(String doctorName, String doctorDegree, String doctorAge, String doctorSpeciality){

    }



}
