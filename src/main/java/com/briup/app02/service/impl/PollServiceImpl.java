package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.briup.app02.dao.PollMapper;
import com.briup.app02.service.IPollService;

@Service
public class PollServiceImpl implements IPollService {
	@Autowired
	private PollMapper pollManager;	
	//------------------------select All---------------------------------
	@Override
	public List<School>  selectSchool() throws Exception {
		return pollManager.selectSchool();
	}
	@Override
	public List<Grade> selectAllGrade() throws Exception {
		return pollManager.selectAllGrade();
	}
	@Override
	public List<Clazz> selectAllClass() throws Exception {
		return pollManager.selectAllClass();
	}
	@Override
	public List<User> selectAllUser() throws Exception {
		return pollManager.selectAllUser();
	}
	@Override
	public List<Course> selectAllCourse() throws Exception {
		return pollManager.selectAllCourse();
	}
	@Override
	public List<Option> selectAllOption() throws Exception {
		return pollManager.selectAllOption();
	}
	@Override
	public List<Question> selectAllQuestion() throws Exception {
		return pollManager.selectAllQuestion();
	}
	@Override
	public List<Qq> selectAllQq() throws Exception {
		return pollManager.selectAllQq();
	}
	@Override
	public List<Questionnaire> selectAllQuestionNaire() throws Exception {
		return pollManager.selectAllQuestionNaire();
	}
	@Override
	public List<Survey> selectAllSurvey() throws Exception {
		return pollManager.selectAllSurvey();
	}
	@Override
	public List<Answer> selectAllAnswer() throws Exception {
		return pollManager.selectAllAnswer();
	}
	//------------------------select All---------------------------------
	
	//---------------------select by id---------------------------------------------------
	
	@Override
	public Clazz selectClassById(Long id) {
		return pollManager.selectClassById(id);
	}
	@Override
	public User selectUserById(Long id) {
		return pollManager.selectUserById(id);
	}
	@Override
	public Course selectCourseById(Long id) {
		
		return pollManager.selectCourseById(id);
	}
	@Override
	public Grade selectGradeById(Long id) throws Exception {
		return pollManager.selectGradeById(id);
	}
	@Override
	public Question selectQuestionById(Long id) throws Exception {
		return pollManager.selectQuestionById(id);
	}
	@Override
	public Questionnaire selectQuestionnaireById(Long id) throws Exception {
		return pollManager.selectQuestionnaireById(id);
	}
	@Override
	public Survey selectSurveyById(Long id) throws Exception {
		return pollManager.selectSurveyById(id);
	}
	
	@Override
	public List<Option> findByQuestionId(long id) throws Exception {
		return pollManager.findByQuestionId(id);
	}
	//-----------------------insert----------------------------------------------------
	@Override
	public void insertGrade(Grade grade) throws Exception {
		 pollManager.insertGrade(grade);
		
	}
	@Override
	public void insertClass(Clazz clazz) throws Exception {
		pollManager.insertClass(clazz);
		
	}
	@Override
	public void insertUser(User user) throws Exception {
		pollManager.insertUser(user);
		
	}
	@Override
	public void insertCourse(Course course) throws Exception {
		pollManager.insertCourse(course);
		
	}
	@Override
	public void insertSchool(School school) throws Exception {
		pollManager.insertSchool(school);
		
	}
	@Override
	public void insertOption(Option option) throws Exception {
		pollManager.insertOption(option);
		
	}
	@Override
	public void insertQuestion(Question question) throws Exception {
		pollManager.insertQuestion(question);
		
	}
	@Override
	public void insertQq(Qq qq) throws Exception {
		pollManager.insertQq(qq);
		
	}
	@Override
	public void insertQuestionNaire(Questionnaire questionnaire) {
		pollManager.insertQuestionNaire(questionnaire);
		
	}
	@Override
	public void insertSurvey(Survey survey) throws Exception {
		pollManager.insertSurvey(survey);
		
	}
	@Override
	public void insertAnswer(Answer answer) throws Exception {
		pollManager.insertAnswer(answer);
		
	}
	
	//-----------------------insert----------------------------------------------------
	
	//------------------------delete---------------------------------------------------
	@Override
	public void deleteSchoolById(Long id) throws Exception {
		pollManager.deleteSchoolById(id);
		
	}
	@Override
	public void deleteGradeById(Long id) throws Exception {
		pollManager.deleteGradeById(id);
		
	}
	@Override
	public void deleteClassById(Long id) throws Exception {
		pollManager.deleteClassById(id);
		
	}
	@Override
	public void deleteUserById(Long id) throws Exception {
		pollManager.deleteUserById(id);
		
	}
	@Override
	public void deleteCourseById(Long id) throws Exception {
		pollManager.deleteCourseById(id);
		
	}
	@Override
	public void deleteOptionById(Long id) throws Exception {
		pollManager.deleteOptionById(id);
		
	}
	@Override
	public void deleteQuestionById(Long id) throws Exception {
		pollManager.deleteQuestionById(id);
		
	}
	@Override
	public void deleteQqById(Long id) throws Exception {
		pollManager.deleteQqById(id);
		
	}
	@Override
	public void deleteQuestionNaireById(Long id) throws Exception {
		pollManager.deleteQuestionNaireById(id);
		
	}
	@Override
	public void deleteSurveyById(Long id) throws Exception {
		pollManager.deleteSurveyById(id);
		
	}
	@Override
	public void deleteAnswerById(Long id) throws Exception {
		pollManager.deleteAnswerById(id);
		
	}
	//------------------------delete---------------------------------------------------
	
	//---------------------------Update-------------------------------------------------
	@Override
	public void UpdateSchoolById(School school) throws Exception {
		pollManager.UpdateSchoolById(school);
		
	}
	@Override
	public void UpdateGradeById(Grade grade) throws Exception {
		pollManager.UpdateGradeById(grade);
		
	}
	@Override
	public void UpdateClassById(Clazz clazz) throws Exception {
		pollManager.UpdateClassById(clazz);
		
	}
	@Override
	public void UpdateUserById(User user) throws Exception {
		pollManager.UpdateUserById(user);
		
	}
	@Override
	public void UpdateCourseById(Course course) throws Exception {
		pollManager.UpdateCourseById(course);
		
	}
	@Override
	public void UpdateOptionById(Option option) throws Exception {
		pollManager.UpdateOptionById(option);
		
	}
	@Override
	public void UpdateQuestionById(Question question) throws Exception {
		pollManager.UpdateQuestionById(question);
		
	}
	@Override
	public void UpdateQqById(Qq qq) throws Exception {
		pollManager.UpdateQqById(qq);
		
	}
	@Override
	public void UpdateQuestionNaireById(Questionnaire questionnaire) throws Exception {
		pollManager.UpdateQuestionNaireById(questionnaire);
		
	}
	@Override
	public void UpdateSurveyById(Survey survey) throws Exception {
		pollManager.UpdateSurveyById(survey);
		
	}
	@Override
	public void UpdateAnswerById(Answer answer) throws Exception {
		pollManager.UpdateAnswerById(answer);
		
	}
	//---------------------------Update-------------------------------------------------
	
}
