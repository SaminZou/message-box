package com.samin.mbox.common.util;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 日期工具类
 * <p>
 * Description: 日期工具类
 * <p>
 * Created By: Samin
 * <p>
 * Created Date: 2024-09-19
 */
@Data
public class DateUtil {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String getDisplayTime(LocalDateTime dateTime) {
        return Objects.nonNull(dateTime) ? DTF.format(dateTime) : "";
    }
}