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
import com.sc.service.service.IMemberService;

@RestController
@RequestMapping("member")
public class MemberController extends BaseController {

	@Autowired
	IMemberService memberService;

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<Pd> listAll(@RequestBody Pd pd) {
		List<Pd> data = null;
		try {
			data = memberService.listAll(pd);
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
			data = memberService.listPage(page);
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
			memberService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "saveAddress", method = RequestMethod.POST)
	public Pd saveAddress(@RequestBody Pd pd) {
		try {
			memberService.saveAddress(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public Pd edit(@RequestBody Pd pd) {
		try {
			memberService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "editAddress", method = RequestMethod.POST)
	public Pd editAddress(@RequestBody Pd pd) {
		try {
			memberService.editAddress(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public Pd delete(@RequestBody Pd pd) {
		try {
			memberService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public Pd find(@RequestBody Pd pd) {
		try {
			pd = memberService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findBy", method = RequestMethod.POST)
	public Pd findBy(@RequestBody Pd pd) {
		try {
			pd = memberService.findBy(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findAddress", method = RequestMethod.POST)
	public Pd findAddress(@RequestBody Pd pd) {
		try {
			pd = memberService.findAddress(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}
