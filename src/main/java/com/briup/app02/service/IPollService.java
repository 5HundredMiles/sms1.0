package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Answer;
import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.Course;
import com.briup.app02.bean.Grade;
import com.briup.app02.bean.Option;
import com.briup.app02.bean.Qq;
import com.briup.app02.bean.Question;
import com.briup.app02.bean.Questionnaire;
import com.briup.app02.bean.School;
import com.briup.app02.bean.Survey;
import com.briup.app02.bean.User;

public interface IPollService {
	//-------------------------selectAll-----------------------------
	List<School>  selectSchool() throws Exception;
	List<Grade> selectAllGrade() throws Exception;
	List<Clazz> selectAllClass() throws Exception;
	List<User> selectAllUser() throws Exception;
	List<Course> selectAllCourse() throws Exception;
	List<Option> selectAllOption()  throws Exception;
	List<Question> selectAllQuestion()  throws Exception;
	List<Qq> selectAllQq()  throws Exception;
	List<Questionnaire> selectAllQuestionNaire()  throws Exception;
	List<Survey> selectAllSurvey()  throws Exception;
	List<Answer> selectAllAnswer()  throws Exception;
	//-------------------------selectAll-----------------------------
	
	//-------------------------select By Id---------------------------------
	Clazz selectClassById(Long id) throws Exception;
	User selectUserById(Long id) throws Exception;
	Course selectCourseById(Long id) throws Exception;
	Grade  selectGradeById(Long id)throws Exception;
	Question selectQuestionById(Long id) throws Exception;
	Questionnaire selectQuestionnaireById(Long id) throws Exception;
	Survey selectSurveyById(Long id) throws Exception;
	
	List<Option> findByQuestionId(long id) throws Exception;
	//-------------------------select By Id---------------------------------
	
	//-------------------------insert-----------------------------------
	void insertGrade(Grade grade) throws Exception;
	void insertClass(Clazz clazz) throws Exception;
	void insertUser(User user) throws Exception;
	void insertCourse(Course course) throws Exception;
	void insertSchool(School school) throws Exception;
	void insertOption(Option option) throws Exception;
	void insertQuestion(Question question) throws Exception;
	void insertQq(Qq qq) throws Exception;
	void insertQuestionNaire(Questionnaire questionnaire);
	void insertSurvey(Survey survey) throws Exception;
	void insertAnswer(Answer answer) throws Exception;
	//-------------------------insert-----------------------------------
	
	//--------------------------delete------------------------------------------
	void deleteSchoolById(Long id)  throws Exception;
	void deleteGradeById(Long id)  throws Exception;
	void deleteClassById(Long id)  throws Exception;
	void deleteUserById(Long id)  throws Exception;
	void deleteCourseById(Long id)  throws Exception;
	void deleteOptionById(Long id)  throws Exception;
	void deleteQuestionById(Long id)  throws Exception;
	void deleteQqById(Long id)  throws Exception;
	void deleteQuestionNaireById(Long id)  throws Exception;
	void deleteSurveyById(Long id)  throws Exception;
	void deleteAnswerById(Long id)  throws Exception;
	//--------------------------delete------------------------------------------
	
	//--------------------------Update-----------------------------------------
	void UpdateSchoolById(School school) throws Exception;
	void UpdateGradeById(Grade grade) throws Exception;
	void UpdateClassById(Clazz clazz) throws Exception;
	void UpdateUserById(User user) throws Exception;
	void UpdateCourseById(Course course) throws Exception;
	void UpdateOptionById(Option option) throws Exception;
	void UpdateQuestionById(Question question) throws Exception;
	void UpdateQqById(Qq qq) throws Exception;
	void UpdateQuestionNaireById(Questionnaire questionnaire) throws Exception;
	void UpdateSurveyById(Survey survey) throws Exception;
	void UpdateAnswerById(Answer answer) throws Exception;
	//--------------------------Update-----------------------------------------
}
