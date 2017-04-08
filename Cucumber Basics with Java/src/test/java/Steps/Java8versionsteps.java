package Steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by vens on 3/17/2017.
 */
public class Java8versionsteps implements En {
    public Java8versionsteps() {
        And("^I just need to see how step looks for cucumber-Java(\\d+)$", (Integer arg0) -> {
            System.out.println("The value from new Step class is " +arg0);

        });
    }
}
