package com.sc.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Menu;
import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<Menu> listRoleMenu(Pd pd) throws Exception {
		return (List<Menu>) dao.findForList("MenuMapper.menurolelist", pd);
	}

}
