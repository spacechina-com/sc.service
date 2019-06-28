package com.sc.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.IModalitiesService;

@Service
public class ModalitiesServiceImpl implements IModalitiesService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<Pd> listPage(Page page) throws Exception {
		return (List<Pd>) dao.findForList("ModalitiesMapper.listPage", page);
	}

	@Override
	public List<Pd> listAll(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("ModalitiesMapper.listAll", pd);
	}

	@Override
	public void save(Pd pd) throws Exception {
		dao.save("ModalitiesMapper.save", pd);
	}

	@Override
	public void delete(Pd pd) throws Exception {
		dao.delete("ModalitiesMapper.delete", pd);
	}

	@Override
	public void edit(Pd pd) throws Exception {
		dao.update("ModalitiesMapper.edit", pd);
	}

	@Override
	public Pd findById(Pd pd) throws Exception {
		return (Pd) dao.findForObject("ModalitiesMapper.findById", pd);
	}

}
