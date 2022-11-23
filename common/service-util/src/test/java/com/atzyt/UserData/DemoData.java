package com.atzyt.UserData;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class DemoData {
    @ExcelProperty(value = "字符串标题",index = 0)
    private String string;
    @ExcelProperty("日期标题")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(value = "yyyy-MM-dd HH:mm:ss")
    @ExcelIgnore
    private Date date;
    @ExcelProperty(value = "数字标题",index = 1)
    private Double doubleData;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
