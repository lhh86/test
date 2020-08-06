package com.test.enums;

public enum CommonData {
    COMMON_SUCCESS(200,"处理成功"),
    COMMON_FAILD(500,"处理失败")
    ;
    private Integer code;
    private String info;

    private CommonData(Integer code,String info){
        this.code=code;
        this.info=info;
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

}
