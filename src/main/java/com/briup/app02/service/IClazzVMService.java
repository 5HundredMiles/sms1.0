package com.briup.app02.service;

import java.util.List;

import com.briup.app02.vm.ClazzVM;

public interface IClazzVMService {
	List<ClazzVM> findAllClazzVM() throws Exception;
}
