package com.sc.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sc.api.model.Pd;
import com.sc.service.dao.DaoSupport;
import com.sc.service.service.ICommonService;

@Service
public class CommonImpl implements ICommonService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public Pd findUserById(Pd pd) throws Exception {
		return (Pd) dao.findForObject("CommonMapper.findUserById", pd);
	}

	@Override
	public List<Pd> listAllGoods(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("CommonMapper.listAllGoods", pd);
	}

	@Override
	public List<Pd> listAllGoodsBatch(Pd pd) throws Exception {
		return (List<Pd>) dao.findForList("CommonMapper.listAllGoodsBatch", pd);
	}

}
