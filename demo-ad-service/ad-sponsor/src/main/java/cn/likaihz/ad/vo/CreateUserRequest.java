package cn.likaihz.ad.vo;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

/**
 * @author Li Kai
 */
@Data
public class CreateUserRequest {
    private String username;

    public boolean validate() {
        return !StringUtils.isEmpty(username);
    }
}
