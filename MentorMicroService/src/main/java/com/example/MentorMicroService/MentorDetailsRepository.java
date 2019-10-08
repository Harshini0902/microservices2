package com.example.MentorMicroService;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface MentorDetailsRepository extends CrudRepository<MentorDetails,String>{
	
//	@Query(value="select user_name from mentor_details where user_name=userName",nativeQuery=true)
//	String checkUserNameExists(String userName);
	
	@Query(value="select * from mentor_details where course_name=?1",nativeQuery=true)
	List<MentorDetails> searchMentor(String courseName);

}
