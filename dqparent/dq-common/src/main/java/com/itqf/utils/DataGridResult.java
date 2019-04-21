package com.itqf.utils;

import java.util.List;

/**
 * easyui的datagrid插件的分页响应对象
 */
public class DataGridResult {
    private  long total;
    private List<?> rows;
    //{total:xxx,rows:[{},{},{}]}


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
