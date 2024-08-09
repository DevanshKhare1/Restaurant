package com.univ.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.univ.model.BookModel;
import com.univ.model.ContactModel;
import com.univ.model.RegModel;
import com.univ.service.RegService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class RestaurantController {
     @Autowired
	RegService regService;
     
     HttpSession hs=null;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("index");
		return mv1;
	}
	@RequestMapping("/index")
	public ModelAndView home2()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("index");
		return mv1;
	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("about");
		return mv1;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("login");
		return mv1;
	}
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute("log") RegModel log,HttpServletRequest req,
		       Model model)
	{
		ModelAndView mv1=new ModelAndView();
		if(log.getUnm().isBlank())
		{	mv1.setViewName("login");
		
		}else
		{	
			boolean x=this.regService.search(log.getUnm(),log.getPw());
			if(x)
			{
				mv1.setViewName("index");	
				 hs=  req.getSession(true);
				
			}else
			{
				mv1.setViewName("login");
			}
		}	
		
		return mv1;
	}
	@RequestMapping("/registration")
	public ModelAndView registration()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("register");
		return mv1;
	}
	@RequestMapping(path="/register", method = RequestMethod.POST)
	public ModelAndView reg(@ModelAttribute("reg")  RegModel reg,
			       Model model)
	{
	ModelAndView mv=new ModelAndView();

		if (reg.getUnm().isBlank()) {
			mv.setViewName("redirect:/login");
		}
		this.regService.addUser(reg);
		mv.setViewName("login");

		return mv;
	}
	@RequestMapping("/booking")
	public ModelAndView booking()
	{
		ModelAndView mv=new ModelAndView();
		if(hs!=null)
		mv.setViewName("booking");
		else
		mv.setViewName("login");
			return mv;	
	}
	@RequestMapping(path="/book",method = RequestMethod.GET)
	public ModelAndView book(@ModelAttribute("book") BookModel book,   
			        HttpServletRequest req,Model model)
	{
	ModelAndView mv=new ModelAndView();	
		if (book.getName().isBlank()) {
			mv.setViewName("redirect:/booking");
		}
		 int x=this.regService.addBooking(book);
		if(x==1)
		{
			mv.setViewName("index");
		}
		else
		{
			mv.setViewName("booking");
		}
		return mv;
	}
	@RequestMapping("/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("contact");
			return mv;	
	}
	@RequestMapping(path="/contactUs", method = RequestMethod.GET)
	public ModelAndView reg(@ModelAttribute("con") ContactModel con,   
			        HttpServletRequest req,Model model)
	{
	ModelAndView mv=new ModelAndView();	
		if (con.getName().isBlank()) {
			mv.setViewName("redirect:/register");
		}
		int x = this.regService.createRequest(con);
		if(x>0)
		mv.setViewName("contact");
		else
		mv.setViewName("contact");
		return mv;
	}

	

	@RequestMapping("/menu")
	public ModelAndView menu()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("menu");
			return mv;	
	}

	@RequestMapping("/mybooking")
	public ModelAndView myBooking()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("mybooking");
			return mv;	
	}
//	@RequestMapping(path="mybooking", method = RequestMethod.POST)
//	public ModelAndView show(@ModelAttribute("show") BookModel show,   
//	        HttpServletRequest req,Model model)
//	{
//		
//		ModelAndView mv=new ModelAndView();
//		if (show.getEmail().isBlank()) {
//			mv.setViewName("redirect:/booking");
//		}
//		
//		mv.setViewName("index");	
//		List<BookModel> lt = this.regService.show(show.);
//		
//		if(hs!=null)
//	    {
//			hs.invalidate();
//			hs=null;
//	    }
//	    hs=  req.getSession(true);
//	    BookModel cd=(BookModel)lt.get(0);
//	    String unm=cd.getName();
//	    hs.setAttribute("unm",unm);
//		mv.setViewName("mybookingshow");
//		return mv;
//	}
	@RequestMapping("/service")
	public ModelAndView service()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("service");
			return mv;	
	}
	@RequestMapping("/team")
	public ModelAndView team()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("team");
			return mv;	
	}
		@RequestMapping("/testimonial")
	public ModelAndView testimonial()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("testimonial");
			return mv;	
	}
	@RequestMapping("/logout")
	public ModelAndView logout()
	{
		ModelAndView mv=new ModelAndView();
		if(hs!=null)
		{
			hs.invalidate();	
			hs=null;
		}
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/Deletebook")
	public ModelAndView DeleteBooking()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Deletebooking");
			return mv;	
	}
	@RequestMapping(path="/Deletebooking",method = RequestMethod.GET)
	public ModelAndView Dbook(@ModelAttribute("Dbook") BookModel Dbook,   
			        HttpServletRequest req,Model model)
	{
	ModelAndView mv=new ModelAndView();	
//		if (Dbook.getEmail().isBlank()) {
//			mv.setViewName("redirect:/booking");
//		}
		this.regService.deleteBooking(Dbook);
//		if(x>0)
//		mv.setViewName("Booking");
//		else
		mv.setViewName("booking");
		return mv;
	}
}