package com.atzyt.UserData;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
@Slf4j
public class DemoDataListener implements ReadListener<DemoData> {

    @Override
    public void invokeHead(Map<Integer, ReadCellData<?>> headMap, AnalysisContext context) {
        log.info("表头信息"+headMap);
    }

    @Override
    public void invoke(DemoData demoData, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", JSON.toJSONString(demoData));

    }

    /**
     * 读取后操作
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("所有数据解析完成！");
    }
}
