package com.cyh.entity.common;

public class Swagger {

    //Swagger 中parameter的名称
    private String name;

    //parameter 的描述
    private String desc;

    //ModelRef(type = "")
    private String model_type;

    //Could be header, cookie, body, query etc.
    private String parameter_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public String getParameter_type() {
        return parameter_type;
    }

    public void setParameter_type(String parameter_type) {
        this.parameter_type = parameter_type;
    }
}
