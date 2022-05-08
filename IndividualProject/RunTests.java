package IndividualProject;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import IndividualProject.BalancedArray.BalancedTest;
import IndividualProject.CheckDivisible.DivisibilityTest;
import IndividualProject.DaphneArray.DaphneTest;
import IndividualProject.VanillaArray.VanillaTest;
import IndividualProject.ZeroBalanceArray.ZeroBalanceTest;
 
public class RunTests {
    public static void main(String[] args) {
        boolean allPassed = true;
        Result result;
        System.out.println("Running Divisible tests...");
        result = JUnitCore.runClasses(DivisibilityTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.printf("Total tests: %s, Failed: %s%n", result.getRunCount(), result.getFailureCount());
        if(!result.wasSuccessful())
            allPassed = false;

        System.out.println("Running Vanilla tests...");
        result = JUnitCore.runClasses(VanillaTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.printf("Total tests: %s, Failed: %s%n", result.getRunCount(), result.getFailureCount());
        if(!result.wasSuccessful())
            allPassed = false;

        System.out.println("Running ZeroBalance tests...");
        result = JUnitCore.runClasses(ZeroBalanceTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.printf("Total tests: %s, Failed: %s%n", result.getRunCount(), result.getFailureCount());
        if(!result.wasSuccessful())
            allPassed = false;

        System.out.println("Running Daphne tests...");
        result = JUnitCore.runClasses(DaphneTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.printf("Total tests: %s, Failed: %s%n", result.getRunCount(), result.getFailureCount());
        if(!result.wasSuccessful())
            allPassed = false;
        
        System.out.println("Running Balanced tests...");
        result = JUnitCore.runClasses(BalancedTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.printf("Total tests: %s, Failed: %s%n", result.getRunCount(), result.getFailureCount());
        if(!result.wasSuccessful())
            allPassed = false;
        
        if(allPassed)
            System.out.println("All tests passed!");
        else
            System.out.println("Some tests failed!");
   }
}
