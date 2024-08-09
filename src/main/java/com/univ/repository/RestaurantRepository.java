package com.univ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.univ.model.RegModel;

public interface RestaurantRepository extends CrudRepository<RegModel,Integer> {
	//query for login check
	 @Query(value = "SELECT c FROM RegModel c WHERE c.unm =?1 AND c.pw= ?2")
	    public List<RegModel> search(String keyword,String pw);
}
