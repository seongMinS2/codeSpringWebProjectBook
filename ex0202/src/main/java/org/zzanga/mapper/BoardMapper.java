package org.zzanga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zzanga.domain.BoardVO;

public interface BoardMapper {
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	
	//insert
	//PK값 알 필요가 없는 경우
	public void insert(BoardVO board);
	
	//PK값 알아야 하는 경우
	public void insertSelectKey(BoardVO board);
	
	//read
	public BoardVO read(Long bno);
	
	//delet
	public int delete(Long bno);
	
	//update
	public int update(BoardVO board);
}
