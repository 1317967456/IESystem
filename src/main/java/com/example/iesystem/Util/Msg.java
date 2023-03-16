package com.example.iesystem.Util;

public class Msg {

    private long code = 0;

    private long count = 0;

    private Object data;

    private String msg;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Msg() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Msg(long code, long count, Object data, String msg) {
        super();
        this.code = code;
        this.count = count;
        this.data = data;
        this.msg = msg;
    }

    public static Msg ok(String msg){
        return new Msg(200,0,null, msg);
    }

    public static Msg okCountData(long count,Object data){
        return new Msg(0,count,data,"ok");
    }

    public static Msg failure(String msg) {
        // TODO Auto-generated method stub
        return new Msg(500,0,null,msg);
    }
}
