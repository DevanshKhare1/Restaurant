package com.univ.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.univ.model.BookModel;
import com.univ.model.RegModel;

public interface BookingRepository extends CrudRepository<BookModel,Integer>
{

	 @Query(value = "SELECT c FROM BookModel c WHERE c.email =?1 ")
	    public List<BookModel> search(String keyword);
}
