package com.hmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.domain.dto.LoginFormDTO;
import com.hmall.domain.po.User;
import com.hmall.domain.vo.UserLoginVO;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);
}
