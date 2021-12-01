package com.icia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository br;

	public int insert(BoardDTO board) {
		
		System.out.println("BoardService.insert() 메서드 호출");
		System.out.println("객체값" + board);
		
		int result = br.insert(board);
		
		return result;
				

	}

	public List<BoardDTO> findAll() {
		List<BoardDTO> boardList = br.findAll();
		return boardList;
	}

}
