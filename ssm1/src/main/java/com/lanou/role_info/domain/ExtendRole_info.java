package com.lanou.role_info.domain;

import com.lanou.module_info.domain.Module_info;

import java.util.ArrayList;
import java.util.List;

public class ExtendRole_info extends Role_info {
    private List<Module_info> moduleInfos;

    private ArrayList<Integer> moduleIds;

    public List<Module_info> getModuleInfos() {
        return moduleInfos;
    }

    public void setModuleInfos(List<Module_info> moduleInfos) {
        this.moduleInfos = moduleInfos;
    }

    public ArrayList<Integer> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(ArrayList<Integer> moduleIds) {
        this.moduleIds = moduleIds;
    }

    @Override
    public String toString() {
        return "ExtendRole_info{" +

                ", moduleIds=" + moduleIds +
                '}';
    }
}



