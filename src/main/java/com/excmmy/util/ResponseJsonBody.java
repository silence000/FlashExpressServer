package com.excmmy.util;

import java.io.Serializable;

public class ResponseJsonBody implements Serializable {
    private int code;
    private String msg;
    private Object data;
    private Object extra;

    public ResponseJsonBody() {
    }

    public ResponseJsonBody(int code, String msg, Object data, Object extra) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ResponseJsonBody{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", extra=" + extra +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }
}
