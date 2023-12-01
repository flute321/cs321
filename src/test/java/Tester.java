
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

        obj.add_DB(dataEntry);
        assertTrue(obj.getSize() == 0);

    }


    @Test
    public void checkRetrieveDB() {

        Business obj = new Business();
        DataEntry dataEntry = new DataEntry(null, null);
        obj.add_DB(dataEntry);
        assertTrue(obj.retrieve_DB(0) != null);

    }

    


}