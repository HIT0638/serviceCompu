package com.hmall.service;

import com.hmall.domain.dto.PayApplyDTO;
import com.hmall.domain.dto.PayOrderFormDTO;
import com.hmall.domain.po.PayOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO applyDTO);

    void tryPayOrderByBalance(PayOrderFormDTO payOrderFormDTO);
}
