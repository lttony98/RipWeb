package com.rest;

import com.dao.QuestionCollectionDAO;
import com.dao.UserDAO;
import com.entities.Question;
import com.entities.QuestionCollection;
import com.entities.User;
import com.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@RestController
@RequestMapping("/1.0/db")
public class DatabaseAPIController {

	@Autowired
	QuestionCollectionDAO questionCollectionDAO;

	@Autowired
	UserDAO userDAO;

	@GetMapping(value = "/collection/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse getQuestionsInCollectionById(@RequestParam int questionCollectionId, HttpServletResponse res) {
		QuestionCollection questionCollection = questionCollectionDAO.getQuestionCollectionById(questionCollectionId);
		if (questionCollection != null) {
			ApiResponse response = new ApiResponse();
			response.setType(ApiResponse.ApiResponseType.OK);
			response.setContent(questionCollection);
			return response;
		}
		res.setStatus(HttpServletResponse.SC_NOT_FOUND);
		return null;
	}

}

//class QuestionCollectionResponse {
//	private QuestionCollection info;
//	private Set<Question> questions;
//
//	public QuestionCollection getInfo() { return info; }
//	public void setInfo(QuestionCollection info) { this.info = info; }
//
//	public Set<Question> getQuestions() { return questions; }
//	public void setQuestions(Set<Question> questions) { this.questions = questions; }
//}
