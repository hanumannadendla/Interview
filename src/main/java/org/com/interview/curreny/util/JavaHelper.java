package org.com.interview.curreny.util;

public class JavaHelper {
	
	public Float splitCurrencyIntoValue(String s) {
		return Float.parseFloat(s.trim().split("$")[1]);
	}
	public Float floatSum(Float f1,Float f2) {
		return Float.sum(f1, f2);
	}
	public boolean greaterThanZero(Float f1) {
		 if(f1>0) {
			 return true;
		 }else
			 return false;
	}

}
