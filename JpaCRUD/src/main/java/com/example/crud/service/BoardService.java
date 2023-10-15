package com.example.crud.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.crud.domain.Board;
import com.example.crud.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;

	public void register(Board board) {
		boardRepository.save(board);
	}

	public List<Board> list() {
		return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "idx"));
	}

	public Board detail(int idx) {
		return boardRepository.findById(idx).orElse(null);
	}

	public void update(Board board) {
		boardRepository.save(board);
	}

	public void delete(int idx) {
		boardRepository.deleteById(idx);
	}
}
