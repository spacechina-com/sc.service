package com.sc.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.IExpressService;

@Service
public class ExpressServiceImpl implements IExpressService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<Pd> listPage(Page page) throws Exception {
		return (List<Pd>) dao.findForList("ExpressMapper.listPage", page);
	}

	@Override
	public List<Pd> listAll(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("ExpressMapper.listAll", pd);
	}

	@Override
	public void save(Pd pd) throws Exception {
		dao.save("ExpressMapper.save", pd);
	}

	@Override
	public void delete(Pd pd) throws Exception {
		dao.delete("ExpressMapper.delete", pd);
	}

	@Override
	public void edit(Pd pd) throws Exception {
		dao.update("ExpressMapper.edit", pd);
	}

	@Override
	public Pd findById(Pd pd) throws Exception {
		return (Pd) dao.findForObject("ExpressMapper.findById", pd);
	}

}
