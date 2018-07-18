package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.dao.extend.QqVMMapper;
import com.briup.app02.dao.extend.SurveyVMMapper;
import com.briup.app02.service.IClazzVMService;
import com.briup.app02.service.IQqVMService;
import com.briup.app02.service.ISurveyVMService;
import com.briup.app02.vm.ClazzVM;
import com.briup.app02.vm.QqVM;
import com.briup.app02.vm.SurveyVM;

@Service
public class SurveyVMServiceimpl implements ISurveyVMService {
	@Autowired
	private SurveyVMMapper surveyVMMapper;
	
	@Override
	public List<SurveyVM> findAllSurveyVM() throws Exception {
		return surveyVMMapper.findAllSurveyVM();
	}

}
