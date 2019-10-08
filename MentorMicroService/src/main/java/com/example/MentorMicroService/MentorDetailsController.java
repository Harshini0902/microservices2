package com.example.MentorMicroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/mentordetailsapi")
public class MentorDetailsController {
	@Autowired
	private MentorDetailsService mentorDetailsService;

	@RequestMapping("/mentordetails")
	public List<MentorDetails> getUserDetails() {
		return mentorDetailsService.getMentorDetails();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mentordetails")
	public void addMentorDetails(@RequestBody MentorDetails mentorDetails) {
		mentorDetailsService.setMentorDetails(mentorDetails);
	}

	@RequestMapping("/mentordetails/{courseName}")
	public List<MentorDetails> getMentorDetails(@PathVariable String courseName ) {
		return mentorDetailsService.getMentorDetails(courseName);
	}

}
