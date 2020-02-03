package cn.likaihz.ad.vo;

import lombok.AllArgsConstructor;

import java.util.Date;

/**
 * @author Li Kai
 */
@AllArgsConstructor
public class CreateUserResponse {
    private Long userId;
    private String username;
    private String token;
    private Date createTime;
    private Date updateTime;
}
