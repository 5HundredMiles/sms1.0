package com.briup.app02.service;

import java.util.List;

import com.briup.app02.vm.AnswerVM;

public interface IAnswerVMService {
	List<AnswerVM> findAllAnswerVM() throws Exception;
}
