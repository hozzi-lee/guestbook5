package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestController {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	// addList
	@RequestMapping(value = "/addList", method = { RequestMethod.GET, RequestMethod.POST })
	public String addList(Model model) {
//		List<GuestbookVo> gList = guestbookDao.getList();
//		model.addAttribute("gList", gList);
		model.addAttribute("gList", guestbookDao.getList());
		
		return "/WEB-INF/views/addList.jsp";
	}
	
	// add
	@RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		guestbookDao.insert(guestbookVo);
		
		return "redirect:/addList";
	}
	
	// deleteForm
	@RequestMapping(value = "/deleteForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteForm() {

		return "/WEB-INF/views/deleteForm.jsp";
	}
	
	// delete
	@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@ModelAttribute GuestbookVo guestbookVo) {
		guestbookDao.delete(guestbookVo);
		
		return "redirect:/addList";
	}

}
