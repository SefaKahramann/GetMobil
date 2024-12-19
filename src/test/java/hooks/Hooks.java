package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.GWD;

public class Hooks {

    @After
    public void after() {
        GWD.tearDown();
    }
}
