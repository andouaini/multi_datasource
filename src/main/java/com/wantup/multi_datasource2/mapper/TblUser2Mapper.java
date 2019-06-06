package com.wantup.multi_datasource2.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wantup.multi_datasource.entity.TblUser;
import com.wantup.multi_datasource2.entity.TblUser2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 赵洛伟
 * @since 2019-06-05
 */
@Mapper
@Repository(value = "tblUser2Mapper")
public interface TblUser2Mapper extends BaseMapper<TblUser2> {

    // 查询语句
    @Select("SELECT * FROM tbl_user2 WHERE username = #{username}")
    TblUser findByName(@Param("username") String username);

    // 添加
    @Insert(" INSERT INTO tbl_user2(username, password) VALUES(#{username},#{password}) ")
    int insertUserInfo(@Param("username") String username,
                       @Param("password") String password);
}
