package com.univ.repository;

import org.springframework.data.repository.CrudRepository;

import com.univ.model.ContactModel;

public interface ContactRepository extends CrudRepository<ContactModel, Integer>
{

}
