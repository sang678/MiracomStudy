/**
 * 
 */
package com.cloud.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.study.dto.TestDataDTO;
import com.cloud.study.repository.TestDataRepository;

/**
 * @author CrazyCow
 *
 */
@Service
public class TestDataService {
	
	@Autowired
	TestDataRepository repository;
	
	public TestDataDTO getData(Long id) {
		return TestDataDTO.builder().id(id).data(repository.getReferenceById(id).getData()).build();
	}
}
