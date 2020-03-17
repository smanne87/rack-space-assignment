package com.rackspace;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rackspace.utils.CommonUtils;

@SpringBootTest
public class CommonUtilsTest {
	@Test
	public void removeDuplicateWithNoData() {
		Integer array[] = {};
		Integer[] resultantArray = CommonUtils.removeDuplicatesFromArray(array);
		assertThat(array).isEqualTo(resultantArray);
	}
	
	@Test
	public void removeWithDupliateData() {

		Integer array[] = { 7, 28, 28, 15, 15, 40, 90, 90, 45, 45, 99 };
		Integer[] uniqueSortedArray = CommonUtils.removeDuplicatesFromArray(array);
		int expectedArraySizeResult = 7;
		assertThat(uniqueSortedArray.length).isEqualTo(expectedArraySizeResult);
	}
	
	@Test
	public void removeWithNegativeDupliateData() {

		Integer[] array = { -7, -7, 15, 40, 90, 45, 99 };
		Integer[] uniqueSortedArray = CommonUtils.removeDuplicatesFromArray(array);
		
		int expectedResul[] = { -7, 15, 40, 45, 90, 99 };

		assertThat(uniqueSortedArray).isEqualTo(expectedResul);
	}
	
	@Test
	public void removeWithNoDupliateData() {

		Integer[] array = { 7, 15, 40, 90, 45, 99 };
		Integer[] uniqueSortedArray = CommonUtils.removeDuplicatesFromArray(array);
		int expectedResul[] = { 7, 15, 40, 45, 90, 99 };
		assertThat(uniqueSortedArray).isEqualTo(expectedResul);
	}
	
	@Test
	public void reverseString() {

		String actualString = "hello world";
		String expectedString = "world hello";

		String resultString = CommonUtils.reverseString(actualString);
		assertThat(resultString.trim()).isEqualTo(expectedString.trim());
	}

	@Test
	public void reverseStringWithSingleString() {

		String actualString = "helloworld";
		String expectedString = "helloworld";

		String resultString = CommonUtils.reverseString(actualString);
		System.out.println(resultString);
		assertThat(resultString.trim()).isEqualTo(expectedString.trim());
	}


}
