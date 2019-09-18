package com.ImportsFiles.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ImportsFiles.Models.OfficeResponsibility;
import com.ImportsFiles.Models.User;
import com.ImportsFiles.repository.OfficeResponsabilityRepository;
import com.ImportsFiles.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OfficeResponsabilityRepository officeResponsabilityRepository;
	
//	@RequestMapping(value = "/teste", method = RequestMethod.GET)
//	public String form() {
//		List<OfficeResponsabilityRepository> cargo = officeResponsabilityRepository.findAll();
//		return "user/teste";
//	}

	@ModelAttribute("officeResponsabilitys")
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String form(User user) {
		//String nome = user.getOfficeResponsibility().getName();
		//userRepository.save(user);
		return "redirect:/registerUser";
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView ListOfficeResponsability() {
		ModelAndView mv = new ModelAndView("user/registerUser");
		Iterable<OfficeResponsibility> officeResponsabilitys = officeResponsabilityRepository.findAll();
		mv.addObject("officeResponsabilitys", officeResponsabilitys);
		return mv;
		//return "user/teste";
	}

}
