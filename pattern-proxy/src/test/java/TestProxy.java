import service.OrderService;
import service.impl.ProxyOrder;

/**
 * Created by 戴天赐 on 2019/11/11.
 * 代理模式
 * 跟装饰器模式有些类似，但是区别是，装饰器模式是内部增强，而且代理模式是自己无法满足，利用第三方外包出去
 * 跟装饰器模式的相同点，代理类跟装饰器类，没有自己实现的具体功能
 */
public class TestProxy {
    public static void main(String[] args) {
        OrderService orderService = new ProxyOrder();
        orderService.saveOrder();
    }
}
