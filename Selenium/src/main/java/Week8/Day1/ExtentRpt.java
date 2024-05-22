package Week8.Day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentRpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/report.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
			ExtentTest test=extent.createTest("CreateTest Lead", "Smoke Testing");
		
		test.assignAuthor("Arun");
		test.assignCategory("Smoke");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(".././screenshots/multiple.png").build());
		
		extent.flush();
		
				
	}

}
