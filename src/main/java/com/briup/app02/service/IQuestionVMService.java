package com.briup.app02.service;

import java.util.List;

import com.briup.app02.vm.QuestionVM;

public interface IQuestionVMService {
	List<QuestionVM> findAllQuestionVM() throws Exception;
}
