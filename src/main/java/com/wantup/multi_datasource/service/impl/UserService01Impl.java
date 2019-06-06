package com.wantup.multi_datasource.service.impl;

import com.wantup.multi_datasource.mapper.TblUserMapper;
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
public class UserService01Impl{

    @Autowired
    private TblUserMapper tblUserMapper;

    @Transactional(transactionManager = "test1TransactionManager")
    public int insertUser(String username, String password) {
        int insertUserInfo = this.tblUserMapper.insertUserInfo(username, password);
        //int i = 1/0;
        return insertUserInfo;
    }
}
