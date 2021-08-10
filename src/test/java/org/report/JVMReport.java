package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
         public static void generateJVMReport(String jsonFile) {
        	 String path = System.getProperty("user.dir");
       	  File reportDirectory = new File(path + "\\src\\test\\resources\\Reports");
       	  
       	  Configuration configuration = new Configuration(reportDirectory,"adactin hotel Automation");
       	  configuration.addClassifications("OS", "Windows 10");
       	  configuration.addClassifications("Browser", "Chrome");
       	  configuration.addClassifications("Version", "89");
       	  configuration.addClassifications("Sprint", "34");
       	  
       	  List<String> jsonFiles = new ArrayList<String>();
       	  jsonFiles.add(jsonFile);
       	  
       	   ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
       	   builder.generateReports();


		}
}
