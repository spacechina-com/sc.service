package com.sc.service.service;

import java.util.List;

import com.sc.api.model.Menu;
import com.sc.api.model.Pd;

public interface IMenuService {

	List<Menu> listRoleMenu(Pd pd) throws Exception;
}
