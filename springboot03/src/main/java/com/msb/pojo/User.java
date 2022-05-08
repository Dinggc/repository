package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Auther:GDC
 * @Date:2022/4/26 - 20:56
 * @Description:com.msb.pojo
 * @version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {
    private Integer uid;
    private String uname;
    private String password;
}
