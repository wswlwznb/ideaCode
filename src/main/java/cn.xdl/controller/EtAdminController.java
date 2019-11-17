package cn.xdl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.pojo.EtAdmin;
import cn.xdl.service.EtAdminService;
@Controller
public class EtAdminController {
	@Autowired
	private EtAdminService etAdminService;
	
	@RequestMapping("/etadmin/list")
	public ModelAndView load() {
		 ModelAndView mav = new ModelAndView();
		 mav.setViewName("list");
		 List<EtAdmin> list = etAdminService.loadEtAdmin();
		 mav.getModel().put("data", list);
		 return mav;
	 }
}
