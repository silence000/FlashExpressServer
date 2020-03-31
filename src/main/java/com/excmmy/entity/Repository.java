package com.excmmy.entity;

public class Repository {
    // 发送
    private String keyword;
    private int current; // 当前页
    private int size; // 每页存放的数据条数
    // 返回参数
    private int currentPage; // 当前页页码
    private int pages; // 总页数
    private int pageSize; // 当前页面的数据条数
    private int total; // 查询到的所有数据条数
    private boolean hasNext; // 是否有下一页
    private boolean hasPrevious; // 是否有上一页
    // 返回数据
    private long productId;
    private String name;
    private Integer repertoryNum;
    private Integer alertNum;
    private Integer returnNum;
    private Integer diliveryNum;
    private Integer usableNum;

    public Repository() {
    }

    public Repository(String keyword, int current, int size, int currentPage, int pages, int pageSize, int total, boolean hasNext, boolean hasPrevious, long productId, String name, Integer repertoryNum, Integer alertNum, Integer returnNum, Integer diliveryNum, Integer usableNum) {
        this.keyword = keyword;
        this.current = current;
        this.size = size;
        this.currentPage = currentPage;
        this.pages = pages;
        this.pageSize = pageSize;
        this.total = total;
        this.hasNext = hasNext;
        this.hasPrevious = hasPrevious;
        this.productId = productId;
        this.name = name;
        this.repertoryNum = repertoryNum;
        this.alertNum = alertNum;
        this.returnNum = returnNum;
        this.diliveryNum = diliveryNum;
        this.usableNum = usableNum;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "keyword='" + keyword + '\'' +
                ", current=" + current +
                ", size=" + size +
                ", currentPage=" + currentPage +
                ", pages=" + pages +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", hasNext=" + hasNext +
                ", hasPrevious=" + hasPrevious +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                ", repertoryNum=" + repertoryNum +
                ", alertNum=" + alertNum +
                ", returnNum=" + returnNum +
                ", diliveryNum=" + diliveryNum +
                ", usableNum=" + usableNum +
                '}';
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRepertoryNum() {
        return repertoryNum;
    }

    public void setRepertoryNum(Integer repertoryNum) {
        this.repertoryNum = repertoryNum;
    }

    public Integer getAlertNum() {
        return alertNum;
    }

    public void setAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
    }

    public Integer getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    public Integer getDiliveryNum() {
        return diliveryNum;
    }

    public void setDiliveryNum(Integer diliveryNum) {
        this.diliveryNum = diliveryNum;
    }

    public Integer getUsableNum() {
        return usableNum;
    }

    public void setUsableNum(Integer usableNum) {
        this.usableNum = usableNum;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
}
