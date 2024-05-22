package Week6.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedAnnotation implements IRetryAnalyzer,IAnnotationTransformer{
	 int count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count<1) {
			count++;
			return true;
		}
		
		// TODO Auto-generated method stub
		return false;
	}
	
	  public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		    // not implemented
		  
		  annotation.setRetryAnalyzer(RetryFailedAnnotation.class);
		  }

}
