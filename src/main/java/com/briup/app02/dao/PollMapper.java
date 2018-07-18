package com.briup.app02.dao;

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

public interface PollMapper {

	//----------------select All---------------------------------
	List<School> selectSchool();
	List<Grade> selectAllGrade();
	List<Clazz> selectAllClass();
	List<User> selectAllUser();
	List<Course> selectAllCourse();
	List<Option> selectAllOption();
	List<Question> selectAllQuestion();
	List<Qq> selectAllQq();
	List<Questionnaire> selectAllQuestionNaire();
	List<Survey> selectAllSurvey();
	List<Answer> selectAllAnswer();
	//----------------select All---------------------------------
	//----------------select by id ----------------------------------
	Clazz selectClassById(Long id);
	User selectUserById(Long id);
	Course selectCourseById(Long id);
	Grade  selectGradeById(Long id);
	Question selectQuestionById(Long id);
	Questionnaire selectQuestionnaireById(Long id);
	Survey selectSurveyById(Long id);
	
	List<Option> findByQuestionId(long id);
	//----------------select by id ----------------------------------
	
	//----------------insert--------------------------------------
	void insertGrade(Grade grade);
	void insertClass(Clazz clazz);
	void insertUser(User user);
	void insertCourse(Course course);
	void insertSchool(School school);
	void insertOption(Option option);
	void insertQuestion(Question question);
	void insertQq(Qq qq);
	void insertQuestionNaire(Questionnaire questionnaire);
	void insertSurvey(Survey survey);
	void insertAnswer(Answer answer);
	//----------------insert--------------------------------------
	
	//----------------delete-------------------------------
	void deleteSchoolById(Long id);
	void deleteGradeById(Long id);
	void deleteClassById(Long id);
	void deleteUserById(Long id);
	void deleteCourseById(Long id);
	void deleteOptionById(Long id);
	void deleteQuestionById(Long id);
	void deleteQqById(Long id);
	void deleteQuestionNaireById(Long id);
	void deleteSurveyById(Long id);
	void deleteAnswerById(Long id);
	//----------------delete-------------------------------
	
	//------------------Update----------------------------------
	void UpdateSchoolById(School school);
	void UpdateGradeById(Grade grade);
	void UpdateClassById(Clazz clazz);
	void UpdateUserById(User user);
	void UpdateCourseById(Course course);
	void UpdateOptionById(Option option);
	void UpdateQuestionById(Question question);
	void UpdateQqById(Qq qq);
	void UpdateQuestionNaireById(Questionnaire questionnaire);
	void UpdateSurveyById(Survey survey);
	void UpdateAnswerById(Answer answer);
	//------------------Update----------------------------------
}

