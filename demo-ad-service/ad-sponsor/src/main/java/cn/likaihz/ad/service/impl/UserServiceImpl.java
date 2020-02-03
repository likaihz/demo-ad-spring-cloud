package cn.likaihz.ad.service.impl;

import cn.likaihz.ad.constant.Constants;
import cn.likaihz.ad.dao.AdUserRepository;
import cn.likaihz.ad.entity.AdUser;
import cn.likaihz.ad.exception.AdException;
import cn.likaihz.ad.service.IUserService;
import cn.likaihz.ad.utils.CommonUtils;
import cn.likaihz.ad.vo.CreateUserRequest;
import cn.likaihz.ad.vo.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Li Kai
 */
@Service
public class UserServiceImpl implements IUserService {
    private final AdUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser = userRepository.findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())));

        return new CreateUserResponse(newUser.getId(),
                                      newUser.getUsername(),
                                      newUser.getToken(),
                                      newUser.getCreateTime(),
                                      newUser.getUpdateTime());
    }

}
