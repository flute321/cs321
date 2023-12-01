package CS321.src.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import CS321.src.main.Approval;
import CS321.src.main.Business;
import CS321.src.main.DataEntry;
import CS321.src.main.Workflow;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import java.beans.Transient;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //Data Entry test functions

    @Test
    public void testValidateText() {
        DataEntry dataEntry = new DataEntry(null, null);

        // Valid input
        dataEntry.setFirstName("John");
        dataEntry.setLastName("Doe");
        dataEntry.setEmail("john.doe@example.com");
        dataEntry.setCity("City");
        dataEntry.setState("State");
        dataEntry.setJob("Job");
        dataEntry.setEducation("Education");
        assertTrue(dataEntry.validateText());

        // Invalid input
        dataEntry.setFirstName("John123"); // Contains digits
        assertFalse(dataEntry.validateText());

    }

    @Test
    public void testValidateNumbers() {
        DataEntry dataEntry = new DataEntry(null, null);

        // Valid input
        dataEntry.setPhoneNumber("12345678901"); // 11 digits
        dataEntry.setDob(20201231); // 8 digits
        assertTrue(dataEntry.validateNumbers());

        // Invalid input
        dataEntry.setPhoneNumber("1234567890"); // Less than 11 digits
        assertFalse(dataEntry.validateNumbers());

    }

    @Test
    public void testValidateNumEntries() {
        DataEntry dataEntry = new DataEntry(null, null);

        // Valid input
        assertTrue(dataEntry.validateNumEntries("12345")); // Valid integer

        // Invalid input
        assertFalse(dataEntry.validateNumEntries("abc")); // Not a valid integer

    }


    
   
    ////////////////////////////////////////////////////////////////////////////
    //testing workflow class


     
   

    /////////////////////////////////////////////////
    //Approval Test cases



     
   

   


    public static void main(String[] args)
    {
        testDeny();
        testApprove();
        testClearScreen();
        testDisplayScreen();
        testGetAlienNumber();
        testGetCurrentStep();
        testGetImmigrant();
        testGetNext();
        testHasNext();
        testSetAlienNumber();
        testSetCurrentStep();
        testSetImmigrant();
        

    }




}