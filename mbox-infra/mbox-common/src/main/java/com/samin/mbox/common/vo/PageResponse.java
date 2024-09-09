package com.samin.mbox.common.vo;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
public class PageResponse<T> extends BaseResponse<Page<T>> {

    Integer page;
    Integer size;
    Long total;
    List<T> content = new ArrayList<>(0);

    public static <T> PageResponse<T> success(Page<T> data) {
        PageResponse<T> resp = new PageResponse<>();
        resp.setPage(data.getNumber());
        resp.setSize(data.getSize());
        resp.setTotal(data.getTotalElements());
        resp.setContent(data.getContent());
        resp.setCode(0);
        resp.setMsg("success");
        resp.setData(null);
        return resp;
    }

    public <R> PageResponse<R> map(Function<? super T, ? extends R> mapper) {
        PageResponse<R> resp = new PageResponse<>();
        resp.setPage(this.getPage());
        resp.setSize(this.getSize());
        resp.setTotal(this.getTotal());
        resp.setCode(0);
        resp.setMsg("success");
        resp.setContent(this.getContent()
                .stream()
                .map(mapper)
                .collect(Collectors.toList()));
        return resp;
    }
}