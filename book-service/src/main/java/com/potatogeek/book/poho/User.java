package com.potatogeek.book.poho;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2022/9/18 18:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String name;
    private String userId;
}
