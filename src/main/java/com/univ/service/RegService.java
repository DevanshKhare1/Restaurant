package com.univ.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.univ.model.BookModel;
import com.univ.model.ContactModel;
import com.univ.model.RegModel;
import com.univ.repository.BookingRepository;
import com.univ.repository.ContactRepository;
import com.univ.repository.RestaurantRepository;

@Service
public class RegService {
	@Autowired
	public RestaurantRepository RestaurantRepo;
    
	@Autowired
	public BookingRepository BookingRepo;
    
	@Autowired
	public ContactRepository ContactRepo;
    
	
	public List<RegModel> getAllRegistration()
	{
		List<RegModel> users= new ArrayList<>();
		RestaurantRepo.findAll().forEach(users::add);
		return users;
	}

    public boolean search1(String unm,String pw)
    {
    	List<RegModel> logindata = new ArrayList<>();
//    	String id=new String();
//    	String pw1=new String();
//    	id=unm;
//    	pw1=pw;
    	logindata=RestaurantRepo.search(unm,pw);
    if(logindata.isEmpty())	
    return false;
    else
    return true;
    }
    public Boolean search(String unm,String pw)
    {
    	List<RegModel> logindata = new ArrayList<>();
//    	String id=new String();
//    	String pw1=new String();
//    	id=unm;
//    	pw1=pw;
    	logindata=RestaurantRepo.search(unm,pw);
    if(logindata.isEmpty())	
    return false;
    else
    return true;
    }
	public void addUser(RegModel subject) {
		RestaurantRepo.save(subject);
		
	}
	public int  createRequest(ContactModel Cm) {
	 ContactRepo.save(Cm);
	return 1;
		
	} 
	public int addBooking(BookModel booking)
	{
		BookingRepo.save(booking);
		return 1;
	}

	public void deleteBooking(BookModel b) {
		BookingRepo.delete(b);
	}
//	   public List show(BookModel user) {
//			return this.RestaurantRepo.findAllById(user);}
}