package com.sc.service.service;

import com.sc.api.model.Pd;

public interface IUserService {
	Pd findById(Pd pd) throws Exception;
}
