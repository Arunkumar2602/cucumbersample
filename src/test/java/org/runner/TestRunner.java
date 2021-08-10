package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", dryRun=false,glue="org.step",monochrome=true,
                   plugin= {"pretty","html:src\\test\\resources\\Reports\\greens.html"})

public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\green.html"); 
	}
           
	
}
