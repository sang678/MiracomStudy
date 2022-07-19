/**
 * 
 */
package com.cloud.study.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author CrazyCow
 *
 */
@Entity(name = "test_data")
@Data
public class TestDataEntity {

	@Id
	long id;
	String data;
}
