package com.gestiondepartement.historique;


import com.gestiondepartement.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
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
		h.setId(2);
		h.setAnnee(2018);
		h.setMoyenne(12);
		Classe classe = new Classe() ;classe.setId(1);classe.setNom("IF4B");
		Etudiant et = new Etudiant();et.setId(1);et.setCin("12547874"); et.setNom("bilel");et.setPrenom("mekrazi");
		h.setClasse(classe);
		h.setEtudiant(et);

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
