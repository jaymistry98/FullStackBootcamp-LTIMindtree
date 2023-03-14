package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Insurance;

@Repository
public interface InsuranceApp extends CrudRepository<Insurance, Integer> {

}
