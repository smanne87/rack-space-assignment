package com.rackspace.service.impl;

import org.springframework.stereotype.Service;

import com.rackspace.service.AssignmentService;
import com.rackspace.utils.CommonUtils;

@Service
public class AssignmentServiceImpl implements AssignmentService {

	@Override
	public String reverseString(String string) {
		return CommonUtils.reverseString(string);
	}

	@Override
	public Integer[] getUniqueIntArray(Integer[] inArray) {
		return CommonUtils.removeDuplicatesFromArray(inArray);
	}

}
