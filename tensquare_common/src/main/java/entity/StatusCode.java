package entity;

/**
 * @program: tensquare_parent
 * @description:
 * @author: mint
 * @create: 2019-09-01 15:47
 **/
public class StatusCode {

    public static final int OK = 20000; // 成功
    public static final int ERROR = 20001; // 失败
    public static final int LOGINERROR = 20002; // 用户名或密码错误
    public static final int ACCESSERROT = 20003; // 权限不足
    public static final int REMOTEERROR = 20004; // 远程调用失败
    public static final int REPERROR = 20005; // 重复操作
}