//*
// *  Name: Siphosethu
// *  Student Number: 217237614
// *  Group: 10
// *
// */

package za.ac.cput.Factory;


import za.ac.cput.Entity.JobTitle;
import za.ac.cput.Util.SiphosethuHelper;

public class JobTitleFactory {
    public static JobTitle createAppointment(int employeeID, int doctorID, int secretaryID) {


        JobTitle jobTitle = new JobTitle.Builder().setSecretaryID(employeeID)
                .setEmployeeID(employeeID)
                .setSecretaryID(secretaryID)
                .setDoctorID(doctorID)
                .build();
        return jobTitle;
    }
}
