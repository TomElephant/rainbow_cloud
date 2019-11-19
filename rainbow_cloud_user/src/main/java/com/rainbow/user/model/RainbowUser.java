package com.rainbow.user.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 郑立轩
 * @since: 2019/11/19
 * create at : 2019/11/19 21:43
 */
@Data
public class RainbowUser implements Serializable {
    private static final long serialVersionUID = -1877960009126534682L;
    private String userNum;
    private String phone;
    private Long id;
    private String userName;
    private String password;

}
