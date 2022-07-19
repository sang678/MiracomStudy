/**
 * 
 */
package com.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.study.entity.TestDataEntity;

/**
 * @author CrazyCow
 *
 */
@Repository
public interface TestDataRepository extends JpaRepository<TestDataEntity, Long>{

}
