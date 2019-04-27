package com.leyou.common.utils.Exception;
/**
 * TODO
 *
 * @ClassName: test
 * @author: XJP
 * @since: 2019/4/25 0025 上午 0:24
 */

import org.apache.commons.lang3.StringUtils;

/**
 * TODO
 * @ClassName: test
 * @author: glorze.com_高老四
 * @since: 2019/4/25 0025 上午 0:24
 */
public class test {
    public static void main(String[] args) {
        String n = "yyy";
        if(StringUtils.isNotBlank(n)){

            throw new SimpleException(StatusCode.REANLNAME_OR_IDNUMBER_ERR);
        }
    }
}
