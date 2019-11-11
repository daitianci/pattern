package service.impl;

import service.OrderService;

/**
 * Created by 戴天赐 on 2019/11/11.
 */
public class ProxyOrder implements OrderService {
    OrderService orderService = new OutOrderServiceImpl();

    public void saveOrder() {
        orderService.saveOrder();
    }
}
