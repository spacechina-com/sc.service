package com.sc.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sc.api.model.Pd;
import com.sc.service.service.ICommonService;

@RestController
@RequestMapping("common")
public class CommonController extends BaseController {

	@Autowired
	ICommonService commonService;

	@RequestMapping(value = "/user/find", method = RequestMethod.POST)
	public Pd findUser(@RequestBody Pd pd) {
		try {
			pd = commonService.findUserById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "/info/find", method = RequestMethod.POST)
	public Pd findInfo(@RequestBody Pd pd) {
		try {
			pd = commonService.findInfoBy(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "listAllGoods", method = RequestMethod.POST)
	public List<Pd> listAllGoods(@RequestBody Pd pd) {
		List<Pd> data = null;
		try {
			data = commonService.listAllGoods(pd);
		} catch (Exception e) {
			data = new ArrayList<Pd>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listAllGoodsBatch", method = RequestMethod.POST)
	public List<Pd> listAllGoodsBatch(@RequestBody Pd pd) {
		List<Pd> data = null;
		try {
			data = commonService.listAllGoodsBatch(pd);
		} catch (Exception e) {
			data = new ArrayList<Pd>();
			e.printStackTrace();
		}
		return data;
	}

}
