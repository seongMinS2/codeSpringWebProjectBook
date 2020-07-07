package org.zzanga.service;

import java.util.List;

import org.zzanga.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bon);
	
	public List<BoardVO> getList();
}
