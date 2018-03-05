package com.lanou.module_info.domain;

public class Module_info {
    private Integer moduleId;

    private String name;

    public Module_info(Integer moduleId, String name) {
        this.moduleId = moduleId;
        this.name = name;
    }

    public Module_info() {
        super();
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Module_info{" +
                "moduleId=" + moduleId +
                ", name='" + name + '\'' +
                '}';
    }
}