package navychang.www.netlibrary.entity;

/**
 * Created by navychang on 16/10/2.
 */
public class HttpResult<T> {
    /**
     * data : {"jlbtotalmsg":{"clubnum":2,"todaynum":3,"totalnum":174}}
     * success : true
     * msg : 查询成功
     */
    private T data;
    private boolean success = false;
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
