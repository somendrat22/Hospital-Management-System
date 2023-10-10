package Database;

import Model.Interfaces.Doctor;
import Model.Interfaces.Patient;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {


    HashMap<String, Doctor>  docDetails;
    HashMap<String, ArrayList<Patient>> docVsPatients;
    public DoctorDB(){
        docDetails = new HashMap<>();
        docVsPatients = new HashMap<>();
    }

    public int getTotalDocs(){
        return docDetails.size();
    }

    public ArrayList<Patient> getAssignedPatients(String docId){
        return docVsPatients.get(docId);
    }

    public Doctor assignPatientToDoctor(Patient p){
        String docId = "";
        int min = Integer.MAX_VALUE; // which doctor is handeling minimum patients
        for(String docIds : docVsPatients.keySet()){
            if(min > docVsPatients.get(docIds).size()){
                min = docVsPatients.get(docIds).size();
                docId = docIds;
            }
        }

        ArrayList<Patient> allPatients = docVsPatients.get(docId);
        allPatients.add(p);

        return docDetails.get(docId);

    }

    // doctor  -> getDociId()
    // online doctor ->
    // offline doctor ->

    // Interfaces -> getDocId


    public void addDoctorToDB(Doctor d){
        String docId = d.docId(); // ->
        docDetails.put(docId, d);
        docVsPatients.put(docId, new ArrayList<>());
        System.out.println("New Doctor got added into Doctor Database with docId -> " + docId);
    }

}
