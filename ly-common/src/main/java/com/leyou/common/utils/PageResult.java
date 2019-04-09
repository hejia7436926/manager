package com.leyou.common.utils;

import java.util.List;

/**
 * @version : 1.0
 * @ClassName: PageResult
 * @Description :
 * @auther: hejia
 * @date: 2019/4/9
 */
public class PageResult<T> {
    /**
     * 总条数
     */
    private Long total;

    /**
     * 总页数
     */
    private Long totalPage;

    /**
     * 当前页数据
     */
    private List<T> items;

    /**
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage totalPage
     */
    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * @return items
     */
    public List<T> getItems() {
        return items;
    }

    /**
     * @param items items
     */
    public void setItems(List<T> items) {
        this.items = items;
    }
}
