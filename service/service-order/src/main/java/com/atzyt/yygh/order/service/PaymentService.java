package com.atzyt.yygh.order.service;


import com.atzyt.yygh.model.order.OrderInfo;
import com.atzyt.yygh.model.order.PaymentInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

public interface PaymentService extends IService<PaymentInfo> {

    //向支付记录表添加信息
    /**
     * 保存交易记录
     * @param order
     * @param status 支付类型（1：微信 2：支付宝）
     */
    void savePaymentInfo(OrderInfo order, Integer status);

    //更新订单状态
    void paySuccess(String out_trade_no, Map<String, String> resultMap);

    /**
     * 获取支付记录
     * @param orderId
     * @param paymentType
     * @return
     */
    PaymentInfo getPaymentInfo(Long orderId, Integer paymentType);

}
