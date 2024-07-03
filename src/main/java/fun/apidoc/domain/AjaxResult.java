package fun.apidoc.domain;

/**
 * @author: sanyuan
 * @Desc:
 * @create: 2024-06-07 20:18
 **/
public class AjaxResult {

    private String status;
    private String msg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    private Object result;
}
