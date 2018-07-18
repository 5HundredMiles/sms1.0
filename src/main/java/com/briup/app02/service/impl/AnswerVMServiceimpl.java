package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.dao.extend.AnswerVMMapper;
import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.service.IAnswerVMService;
import com.briup.app02.service.IClazzVMService;
import com.briup.app02.vm.AnswerVM;
import com.briup.app02.vm.ClazzVM;

@Service
public class AnswerVMServiceimpl implements IAnswerVMService {
	@Autowired
	private AnswerVMMapper answerVMMapper;
	
	@Override
	public List<AnswerVM> findAllAnswerVM() throws Exception {
		return answerVMMapper.findAllAnswerVM();
	}
}
