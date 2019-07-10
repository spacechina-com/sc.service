package com.sc.service.service;

import java.util.List;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;

public interface IActivitiesService {

	void save(Pd pd) throws Exception;

	void delete(Pd pd) throws Exception;

	void edit(Pd pd) throws Exception;

	Pd findById(Pd pd) throws Exception;

	List<Pd> listPage(Page page) throws Exception;

	List<Pd> listAll(Pd pd) throws Exception;

	void savePrizeitems(Pd pd) throws Exception;

	List<Pd> listAllPrizeitems(Pd pd) throws Exception;

	void deletePrizeitems(Pd pd) throws Exception;

	Pd findBy(Pd pd) throws Exception;

	void saveBatchs(Pd pd) throws Exception;

	List<Pd> listAllBatchs(Pd pd) throws Exception;

	void deleteBatchs(Pd pd) throws Exception;

	List<Pd> listAllCodes(Pd pd) throws Exception;

	void saveCodes(Pd pd) throws Exception;
}
