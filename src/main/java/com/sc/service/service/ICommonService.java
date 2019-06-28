package com.sc.service.service;

import java.util.List;

import com.sc.api.model.Pd;

public interface ICommonService {

	Pd findUserById(Pd pd) throws Exception;

	List<Pd> listAllGoods(Pd pd) throws Exception;

	List<Pd> listAllGoodsBatch(Pd pd) throws Exception;
}
