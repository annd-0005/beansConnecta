package vn.sun.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import vn.sun.services.client.JobTypeServices;
import vn.sun.services.client.UserServices;

public class BaseController {

	@Autowired
	protected UserServices userService;
	@Autowired
	protected MessageSource messageSource;
	@Autowired
	protected JobTypeServices jobTypeService;
}
