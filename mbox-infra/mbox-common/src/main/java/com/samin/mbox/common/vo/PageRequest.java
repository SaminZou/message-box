package com.samin.mbox.common.vo;

import lombok.Data;

@Data
public class PageRequest {

    private int page;
    private int size;

    /**
     * 前端从 1 开始，Spring Data JPA 是从 0 开始分页
     * @param page
     */
    public void setPage(int page) {
        if (page > 0) {
            this.page = page - 1;
        } else if (page < 0) {
            this.page = 0;
        } else {
            this.page = page;
        }
    }
}
