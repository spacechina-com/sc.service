package com.sc.service.controller;

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
	ICommonService userService;

	@RequestMapping(value = "/user/find", method = RequestMethod.POST)
	public Pd find(@RequestBody Pd pd) {
		try {
			pd = userService.findUserById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}
