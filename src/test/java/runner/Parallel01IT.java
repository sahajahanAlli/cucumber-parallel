//package runner;
//import java.lang.management.ManagementFactory;
//
//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.java.Before;
//import cucumber.api.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//
//@CucumberOptions(strict = true,
//    features = {"src/test/java/features"},
//    format = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty"},
//    monochrome = false,
//    tags = {"~@ignored"},
//    glue = { "seleniumgluecode" })
//
//
//
//public class Parallel01IT {
//
//	@Before
//	public void before() {
//	    long threadId = Thread.currentThread().getId();
//	    String processName = ManagementFactory.getRuntimeMXBean().getName();
//	    System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
//	}
//}