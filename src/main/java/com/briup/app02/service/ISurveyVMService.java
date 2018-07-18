package com.briup.app02.service;

import java.util.List;

import com.briup.app02.vm.ClazzVM;
import com.briup.app02.vm.QqVM;
import com.briup.app02.vm.SurveyVM;

public interface ISurveyVMService {
	List<SurveyVM> findAllSurveyVM() throws Exception;
}
