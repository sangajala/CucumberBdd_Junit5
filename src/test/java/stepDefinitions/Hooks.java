package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
    @Before
    public void connectToDatabase()
    {
        System.out.println("connect to data base");
    }

    @After
    public void closeDatabaseConnection()
    {
        System.out.println("disconnect from data base");
    }
}
