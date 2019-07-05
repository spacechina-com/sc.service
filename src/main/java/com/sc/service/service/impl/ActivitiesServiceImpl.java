package com.sc.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.IActivitiesService;

@Service
public class ActivitiesServiceImpl implements IActivitiesService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<Pd> listPage(Page page) throws Exception {
		return (List<Pd>) dao.findForList("ActivitiesMapper.listPage", page);
	}

	@Override
	public List<Pd> listAll(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("ActivitiesMapper.listAll", pd);
	}

	@Override
	public void save(Pd pd) throws Exception {
		dao.save("ActivitiesMapper.save", pd);
	}

	@Override
	public void delete(Pd pd) throws Exception {
		dao.delete("ActivitiesMapper.delete", pd);
	}

	@Override
	public void edit(Pd pd) throws Exception {
		dao.update("ActivitiesMapper.edit", pd);
	}

	@Override
	public Pd findById(Pd pd) throws Exception {
		return (Pd) dao.findForObject("ActivitiesMapper.findById", pd);
	}

	@Override
	public void savePrizeitems(Pd pd) throws Exception {
		dao.save("ActivitiesMapper.savePrizeitems", pd);
	}

	@Override
	public List<Pd> listAllPrizeitems(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("ActivitiesMapper.listAllPrizeitems", pd);
	}

	@Override
	public void deletePrizeitems(Pd pd) throws Exception {
		dao.delete("ActivitiesMapper.deletePrizeitems", pd);
	}

	@Override
	public Pd findBy(Pd pd) throws Exception {
		return (Pd) dao.findForObject("ActivitiesMapper.findBy", pd);
	}

	@Override
	public void saveBatchs(Pd pd) throws Exception {
		dao.save("ActivitiesMapper.saveBatchs", pd);
	}

	@Override
	public List<Pd> listAllBatchs(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("ActivitiesMapper.listAllBatchs", pd);
	}

	@Override
	public void deleteBatchs(Pd pd) throws Exception {
		dao.delete("ActivitiesMapper.deleteBatchs", pd);
	}

}
