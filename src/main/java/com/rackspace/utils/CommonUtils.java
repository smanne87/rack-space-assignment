package com.rackspace.utils;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonUtils {
	public static String reverseString(String string) {
		StringBuilder reversedString = new StringBuilder("");

		if (string != null && !string.isEmpty()) {
			String[] strings = string.split(" ");
			
			for (int i = strings.length - 1; i >= 0 ; i--) {
				if (i != strings.length - 1)
					reversedString.append(" ").append(strings[i]);
				else
					reversedString.append(strings[i]);
			}
		}
		
		return reversedString.toString();
	}
	
	public static Integer[] removeDuplicatesFromArray(Integer[] inArray) {
		if(inArray.length <= 1) {
			return inArray;
		}
		
		Set<Integer> arrayToSet = new TreeSet<Integer>(Arrays.asList(inArray));
		Integer[] uniqueArray = new Integer[arrayToSet.size()];
		int i = 0;
		for (Integer in : arrayToSet) {
			uniqueArray[i] = in;
			i++;
		}
		return uniqueArray;
	}
}
