package com.excmmy.util;

import java.io.Serializable;

public class PageInfo implements Serializable {
    // 分页查询时使用
    private int current; // 当前页
    private int size; // 每页存放的数据条数
    // 查看分页状态时使用
    private int currentPage; // 当前页页码
    private int pages; // 总页数
    private int pageSize; // 当前页面的数据条数
    private int total; // 查询到的所有数据条数
    private boolean hasNext; // 是否有下一页
    private boolean hasPrevious; // 是否有上一页

    public PageInfo() {
    }

    public PageInfo(int current, int size, int currentPage, int pages, int pageSize, int total, boolean hasNext, boolean hasPrevious) {
        this.current = current;
        this.size = size;
        this.currentPage = currentPage;
        this.pages = pages;
        this.pageSize = pageSize;
        this.total = total;
        this.hasNext = hasNext;
        this.hasPrevious = hasPrevious;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "current=" + current +
                ", size=" + size +
                ", currentPage=" + currentPage +
                ", pages=" + pages +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", hasNext=" + hasNext +
                ", hasPrevious=" + hasPrevious +
                '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }
}
