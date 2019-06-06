package com.wantup.multi_datasource.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wantup.multi_datasource.entity.TblUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 赵洛伟
 * @since 2019-06-05
 */
@Mapper
@Repository(value = "tblUserMapper")
public interface TblUserMapper extends BaseMapper<TblUser> {
    // 查询语句
    @Select("SELECT * FROM tbl_user WHERE username = #{username}")
    TblUser findByName(@Param("username") String username);

    // 添加
    @Insert(" INSERT INTO tbl_user(username, password) VALUES(#{username},#{password}) ")
    int insertUserInfo(@Param("username") String username,
                        @Param("password") String password);
}
