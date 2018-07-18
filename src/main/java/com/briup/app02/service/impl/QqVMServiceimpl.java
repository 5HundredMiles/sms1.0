package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.dao.extend.QqVMMapper;
import com.briup.app02.service.IClazzVMService;
import com.briup.app02.service.IQqVMService;
import com.briup.app02.vm.ClazzVM;
import com.briup.app02.vm.QqVM;

@Service
public class QqVMServiceimpl implements IQqVMService {
	@Autowired
	private QqVMMapper qqVMMapper;
	
	@Override
	public List<QqVM> findAllQqVM() throws Exception {
		return qqVMMapper.findAllQqVM();
	}
}
