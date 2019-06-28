package com.sc.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sc.api.model.Page;
import com.sc.api.model.Pd;
import com.sc.service.service.IActivitiesService;

@RestController
@RequestMapping("activities")
public class ActivitiesController extends BaseController {

	@Autowired
	IActivitiesService activitiesService;

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<Pd> listAll(@RequestBody Pd pd) {
		List<Pd> data = null;
		try {
			data = activitiesService.listAll(pd);
		} catch (Exception e) {
			data = new ArrayList<Pd>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listPage", method = RequestMethod.POST)
	public Page listPage(@RequestBody Pd pd) {
		Page page = getPage(pd);
		List<Pd> data = null;
		try {
			data = activitiesService.listPage(page);
		} catch (Exception e) {
			data = new ArrayList<Pd>();
			e.printStackTrace();
		}
		page.setData(data);
		return page;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public Pd save(@RequestBody Pd pd) {
		try {
			activitiesService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public Pd edit(@RequestBody Pd pd) {
		try {
			activitiesService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public Pd delete(@RequestBody Pd pd) {
		try {
			activitiesService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public Pd find(@RequestBody Pd pd) {
		try {
			pd = activitiesService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}
