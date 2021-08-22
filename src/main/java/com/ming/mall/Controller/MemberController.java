package com.ming.mall.Controller;

import java.lang.reflect.Member;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ming.mall.Service.MemberService;
import com.ming.mall.VO.MemberVO;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;
	
	// ���̵� �ߺ� üũ
	@ResponseBody
	@RequestMapping(value="/idChk", method = RequestMethod.POST)
	public int idChk(MemberVO vo) throws Exception {
		int result = service.idChk(vo);
		return result;
	}
	
	// ȸ������ get
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getRegister() throws Exception {
		logger.info("get register");
	}
	
	// ȸ������ post
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception {
		logger.info("post register");
		int result = service.idChk(vo);
		try {
			if(result == 1) {
				return "/member/register";
			}else if(result == 0) {
				service.register(vo);
			}
			// ��⿡��~ �Էµ� ���̵� �����Ѵٸ� -> �ٽ� ȸ������ �������� ���ư��� 
			// �������� �ʴ´ٸ� -> register
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return "redirect:/";
	}
	
	//�α���
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		MemberVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login() throws Exception {
//		return "home";
//	}
	
	//�α׾ƿ�
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	//ȸ����������
	@RequestMapping(value="/memberUpdateView", method = RequestMethod.GET)
	public String registerUpdateView() throws Exception{
		
		return "/memberUpdateView";
	}

	@RequestMapping(value="/memberUpdate", method = RequestMethod.POST)
	public String registerUpdate(MemberVO vo, HttpSession session) throws Exception{
		
		service.memberUpdate(vo);
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	// ȸ�� Ż�� get
		@RequestMapping(value="/memberDeleteView", method = RequestMethod.GET)
		public String memberDeleteView() throws Exception{
			return "/memberDeleteView";
		}
		
	// ȸ�� Ż�� post
		@RequestMapping(value="/memberDelete", method = RequestMethod.POST)
		public String memberDelete(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception{
			
			// ���ǿ� �ִ� member�� ������ member������ �־��ݴϴ�.
			MemberVO member = (MemberVO) session.getAttribute("member");
			// ���ǿ��ִ� ��й�ȣ
			String sessionPass = member.getUserPass();
			// vo�� ������ ��й�ȣ
			String voPass = vo.getUserPass();
			
			if(!(sessionPass.equals(voPass))) {
				rttr.addFlashAttribute("msg", false);
				return "redirect:/mall/memberDeleteView";
			}
			service.memberDelete(vo);
			session.invalidate();
			return "redirect:/";
		}
		// �н����� üũ
		@ResponseBody
		@RequestMapping(value="/passChk", method = RequestMethod.POST)
		public int passChk(MemberVO vo) throws Exception {
			int result = service.passChk(vo);
			return result;
		}
		
	
}
