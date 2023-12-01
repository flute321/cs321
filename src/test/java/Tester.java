
import static org.junit.Assert.*;
import org.junit.Test;


import CS321.src.main.Workflow;
import CS321.src.main.Approval;
import CS321.src.main.Business;
import CS321.src.main.DataEntry;

import java.beans.Transient;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //testing Workflow class
   @Test
    public void checkWorkflow() {

        Workflow wf = new Workflow();
        assertTrue(wf.getTable() != null);
    }



    /////////////////////////////////////////////////
    //Business Object Test cases
  
    @Test
    public void checkAddDB() {

        Business obj = new Business();
        DataEntry dataEntry = new DataEntry(null, null);


        // Valid input
        dataEntry.setFirstName("John");
        dataEntry.setLastName("Doe");
        dataEntry.setEmail("john.doe@example.com");
        dataEntry.setCity("City");
        dataEntry.setState("State");
        dataEntry.setJob("Job");
        dataEntry.setEducation("Education");
        dataEntry.setPhoneNumber("12345678901");
        dataEntry.setDob(20201231); 
        dataEntry.setPhoneNumber("1234567890"); 

        obj.add_DB(dataEntry);
        assertTrue(obj.getSize() == 0);

    }


    @Test
    public void checkRetrieveDB() {

        Business obj = new Business();
        DataEntry dataEntry = new DataEntry(null, null);


        // Valid input
        dataEntry.setFirstName("John");
        dataEntry.setLastName("Doe");
        dataEntry.setEmail("john.doe@example.com");
        dataEntry.setCity("City");
        dataEntry.setState("State");
        dataEntry.setJob("Job");
        dataEntry.setEducation("Education");
        dataEntry.setPhoneNumber("12345678901");
        dataEntry.setDob(20201231); 
        dataEntry.setPhoneNumber("1234567890"); 

        obj.add_DB(dataEntry);
        assertTrue(obj.retrieve_DB(0) != null);

    }

    


}