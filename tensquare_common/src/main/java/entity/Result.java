package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: tensquare_parent
 * @description:
 * @author: mint
 * @create: 2019-09-01 15:41
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean flag;
    private Integer code;
    private String message;
    private Object data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
