import Model.Hospital;

public class Main {
    public static void main(String[] args) {

        Hospital aiims = new Hospital("Aiims New Delhi", 1000, "New Delhi", 123456);

        aiims.appointDoctor("SOM", "MBBS", 23, "Heart");
        aiims.appointDoctor("TIW", "MBBS", 40, "Brain");
        aiims.appointDoctor("Raj", "MBBS", 27, "Stomach");


        aiims.getHospitalName();
        aiims.getTotalBeds();
        aiims.getDoctorDetails("HSP3");
        aiims.getTotalPatientsAvailble();
        aiims.admitPatient("Somendra", "Fever", 30, "Male");
        aiims.admitPatient("Dilip", "cardiac", 20, "Male");
        aiims.admitPatient("Arjun", "Fever", 35, "Male");
        aiims.getPatientDetails("Patient1");

        aiims.getPatientDetails("Patient3");

        aiims.getTotalPatientsAvailble();



    }
}