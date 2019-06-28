package com.sc.service.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public Pd findById(Pd pd) throws Exception {
		return (Pd) dao.findForObject("UserMapper.findById", pd);
	}

}
