package com.gestiondepartement.historique;

import java.util.ArrayList;
import java.util.List;

import com.gestiondepartement.classes.EtudiantHistorique;
import com.gestiondepartement.classes.GetEtudiantsHistoriqueRequest;
import com.gestiondepartement.classes.GetEtudiantsHistoriqueResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class EtudiantHistoriqueDetailsEndpoint {


	@Autowired
	private EtudiantHistoriqueRepository etudiantHistoriqueRepository ;

	// GetCourseDetailsRequest
	@PayloadRoot(namespace = "http://GestionDepartement.com", localPart = "GetEtudiantsHistoriqueRequest")
	@ResponsePayload
	public GetEtudiantsHistoriqueResponse processEtudiantsHistoriqueRequest(@RequestPayload GetEtudiantsHistoriqueRequest request) {

		EtudiantHistorique h = new EtudiantHistorique() ;
		h.setId(1);
		h.setName("bilel");

		etudiantHistoriqueRepository.save(h) ;

		GetEtudiantsHistoriqueResponse res = new GetEtudiantsHistoriqueResponse() ;

		res.getEtudiantHistorique().add(h) ;
		return res ;
	}

//	private GetCourseDetailsResponse mapCourseDetails(Course course) {
//		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
//		response.setCourseDetails(mapCourse(course));
//		return response;
//	}
//
//	private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {
//		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
//		for (Course course : courses) {
//			CourseDetails mapCourse = mapCourse(course);
//			response.getCourseDetails().add(mapCourse);
//		}
//		return response;
//	}
//
//	private CourseDetails mapCourse(Course course) {
//		CourseDetails courseDetails = new CourseDetails();
//
//		courseDetails.setId(course.getId());
//
//		courseDetails.setName(course.getName());
//
//		courseDetails.setDescription(course.getDescription());
//		return courseDetails;
//	}
//
//	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetAllCourseDetailsRequest")
//	@ResponsePayload
//	public GetAllCourseDetailsResponse processAllCourseDetailsRequest(
//			@RequestPayload GetAllCourseDetailsRequest request) {
//
//		List<Course> courses = service.findAll();
//
//		return mapAllCourseDetails(courses);
//	}
//
//	@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "DeleteCourseDetailsRequest")
//	@ResponsePayload
//	public DeleteCourseDetailsResponse deleteCourseDetailsRequest(@RequestPayload DeleteCourseDetailsRequest request) {
//
//		Status status = service.deleteById(request.getId());
//
//		DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
//		response.setStatus(mapStatus(status));
//
//		return response;
//	}
//
//	private com.in28minutes.courses.Status mapStatus(Status status) {
//		if (status == Status.FAILURE)
//			return com.in28minutes.courses.Status.FAILURE;
//		return com.in28minutes.courses.Status.SUCCESS;
//	}
}
