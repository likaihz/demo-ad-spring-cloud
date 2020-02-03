package cn.likaihz.ad.service;

import cn.likaihz.ad.exception.AdException;
import cn.likaihz.ad.vo.CreateUserRequest;
import cn.likaihz.ad.vo.CreateUserResponse;

/**
 * @author Li Kai
 */
public interface IUserService {
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
