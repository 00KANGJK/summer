package com.example.summer.dao;

import com.example.summer.bean.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class BoardDAO {

    @Autowired
    SqlSession sqlSession;

    private final String BOARD_INSERT = "insert into Board2(address, location, holiday, price) values (?,?,?,?)";
    private final String BOARD_UPDATE = "update Board2 set address =?, location=?, holiday=?, price=? where seq=?";
    private final String BOARD_DELETE = "delete from Board2 where seq=?";

    public int insertBoard(BoardVO vo){
        int count = sqlSession.insert("Board.insertBoard",vo);
        return count;
    }

    public int deleteBoard(int id){
        int count = sqlSession.delete("Board.deleteBoard",id);
        return count;
    }

    public int updateBoard(BoardVO vo){
        int count = sqlSession.update("Board.updateBoard",vo);
        return count;
    }

    private final String BOARD_GET = "select * from Board2 where seq=?";

    public BoardVO getBoard(int seq){
        BoardVO one = sqlSession.selectOne("Board.getBoard",seq);
        return one;
    }

    private final String BOARD_LIST = "select * from Board2 order by seq desc";

    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
}
