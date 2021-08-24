package com.ming.mall.Controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ming.mall.Service.BoardService;
import com.ming.mall.VO.BoardVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	// �Խ��� �� �ۼ� ȭ��	
	@RequestMapping(value = "board/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
	}
	
	// �Խ��� �� �ۼ�
	@RequestMapping(value = "board/write", method = RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception{
		logger.info("write");
		service.write(boardVO);
		return "redirect:/";
	}
	
	// �Խ��� ��� ��ȸ
	@RequestMapping(value = "board/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		logger.info("list");
		model.addAttribute("list",service.list());
		return "board/list";
		
	}
	
}