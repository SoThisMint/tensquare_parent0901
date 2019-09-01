package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: tensquare_parent
 * @description:
 * @author: mint
 * @create: 2019-09-01 15:45
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    private long total;
    private List<T> rows;
}
