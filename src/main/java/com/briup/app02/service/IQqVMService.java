package com.briup.app02.service;

import java.util.List;

import com.briup.app02.vm.ClazzVM;
import com.briup.app02.vm.QqVM;

public interface IQqVMService {
	List<QqVM> findAllQqVM() throws Exception;
}
