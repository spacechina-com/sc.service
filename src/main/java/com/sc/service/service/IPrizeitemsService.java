package com.sc.service.service;

import java.util.List;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;

public interface IPrizeitemsService {

	void save(Pd pd) throws Exception;

	void delete(Pd pd) throws Exception;

	void edit(Pd pd) throws Exception;

	Pd findById(Pd pd) throws Exception;

	List<Pd> listPage(Page page) throws Exception;

	List<Pd> listAll(Pd pd) throws Exception;
}
