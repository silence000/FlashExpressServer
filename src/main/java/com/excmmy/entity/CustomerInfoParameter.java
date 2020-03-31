package com.excmmy.entity;

import com.excmmy.bean.CustomerInfo;

public class CustomerInfoParameter extends CustomerInfo {
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

    public CustomerInfoParameter(){
    }

    public CustomerInfoParameter(CustomerInfo customerInfo){
        super(customerInfo.getId(),
                customerInfo.getGmtCreate(),
                customerInfo.getGmtModified(),
                customerInfo.getIsDelete(),
                customerInfo.getName(),
                customerInfo.getSeries(),
                customerInfo.getStatus(),
                customerInfo.getPid(),
                customerInfo.getEmployer(),
                customerInfo.getTelephone(),
                customerInfo.getMobile(),
                customerInfo.getAddress(),
                customerInfo.getPostcode(),
                customerInfo.getEmail()
        );
    }

    @Override
    public String toString() {
        return "CustomerInfoParameter{" +
                "current=" + current +
                ", size=" + size +
                ", currentPage=" + currentPage +
                ", pages=" + pages +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", hasNext=" + hasNext +
                ", hasPrevious=" + hasPrevious +
                "} " + super.toString();
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
