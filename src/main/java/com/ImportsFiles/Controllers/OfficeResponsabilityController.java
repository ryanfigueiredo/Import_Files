package com.ImportsFiles.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ImportsFiles.Models.OfficeResponsibility;
import com.ImportsFiles.repository.OfficeResponsabilityRepository;

@Controller
public class OfficeResponsabilityController {

	@Autowired
	private OfficeResponsabilityRepository officeResponsabilityRepository;

	@RequestMapping(value = "/registerOfficeResponsability", method = RequestMethod.GET)
	public String form() {
		return "officeResponsability/RegisterOfficeResponsability";
	}

	@RequestMapping(value = "/registerOfficeResponsability", method = RequestMethod.POST)
	public String form(OfficeResponsibility officeResponsibility) {
		officeResponsabilityRepository.save(officeResponsibility);
		return "redirect:/registerOfficeResponsability";
	}

}
