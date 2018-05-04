package org.eking.apims.common.utils;

import java.util.List;

/**
* 分页工具类
* @Author wangyu
* @Date 2018/4/27
*/
public class PageInfo<T> {

    List<T> list;
    //每页显示数
    public static Integer pageSize = 10;
    //页码
    Integer pageNumber;
    //总数
    Integer total;
    //总页数
    Integer pages;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public PageInfo(List<T> list, Integer pageSize, Integer pageNumber, Integer total, Integer pages) {
        this.list = list;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.total = total;
        this.pages = pages;
    }

    public PageInfo() {
    }
}