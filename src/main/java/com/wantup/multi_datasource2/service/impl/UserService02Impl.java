package com.wantup.multi_datasource2.service.impl;

import com.wantup.multi_datasource2.mapper.TblUser2Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *
 * </p>
 *
 * @author 赵洛伟
 * @since 2019-06-05
 */
@Slf4j
@Service
public class UserService02Impl {

    @Autowired
    private TblUser2Mapper tblUser2Mapper;

    @Transactional(transactionManager = "test2TransactionManager")
    public int insertUser(String username, String password) {
        int insertUserInfo = this.tblUser2Mapper.insertUserInfo(username, password);
        //int i = 1/0;
        return insertUserInfo;
    }
}
