package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.service.IClazzVMService;
import com.briup.app02.vm.ClazzVM;

@Service
public class ClazzVMServiceimpl implements IClazzVMService {
	@Autowired
	private ClazzVMMapper clazzVMMapper;
	
	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		return clazzVMMapper.findAllClazzVM();
	}
}
