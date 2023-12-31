package com.example.summer;

import com.example.summer.bean.BoardVO;
import com.example.summer.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO boardDAO;

    @Override
    public int insertBoard(BoardVO vo) {
        return boardDAO.insertBoard(vo);
    }
    @Override
    public int deleteBoard(int id){
        return boardDAO.deleteBoard(id);
    }
    @Override
    public int updateBoard(BoardVO vo){
        return boardDAO.updateBoard(vo);
    }
    @Override
    public BoardVO getBoard(int seq) {
        return boardDAO.getBoard(seq);
    }
    @Override
    public List<BoardVO> getBoardList(){
        return boardDAO.getBoardList();
    }
}
