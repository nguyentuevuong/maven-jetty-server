package com.bachkhoa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaohiemController {

	@RequestMapping(value = "/baohiem", method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "baohiem";
	}
}
