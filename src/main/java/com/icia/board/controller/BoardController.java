package com.icia.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired // BoardService를 주입받는 것. spring이 객체를 주입받는 것
	private BoardService bs;
	
	//기본 페이지
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	//글쓰기 페이지(insert) 출력
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertForm() {
		return "insert";
	}

	//글 등록(insert) 처리
		@RequestMapping(value="/insert", method=RequestMethod.POST)
		public String save(@ModelAttribute BoardDTO board) {
			System.out.println("BoardController.insert(): " + board);

			int result = bs.insert(board);

			return "index";

		}
		
	//글목록 처리
		@RequestMapping(value="/findAll", method=RequestMethod.GET)
		public String findAll(Model model) {
			List<BoardDTO> boardList = bs.findAll();
			model.addAttribute("boardList", boardList);
			return "findAll";
		}
}
