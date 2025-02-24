
package PatientManagement.Patient.Encounters;

import PatientManagement.Clinic.Clinic;
import PatientManagement.Clinic.Event;
import PatientManagement.Patient.Patient;
import java.util.ArrayList;


public class EncounterHistory {
    Clinic clinic;
    ArrayList<Encounter> encounters = new ArrayList<Encounter>();
    Patient patient;

    public EncounterHistory(Patient p, Clinic c) {
        patient = p;
        clinic = c;
    }

    // each encounter must link to the event at the site
    public Encounter newEncounter(Patient p, String chiefcomplaint, Event ev) {
        Encounter e = new Encounter(p, chiefcomplaint, ev, clinic);
        encounters.add(e);
        patient = p;
        return e;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounters;
    }

}
