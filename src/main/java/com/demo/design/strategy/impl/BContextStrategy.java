package com.demo.design.strategy.impl;

import com.demo.design.strategy.IContextStrategy;
import org.springframework.stereotype.Component;

/**
 * @author yangzhanbang
 * @date 2018/11/15 11:29
 * @desc 策略实现接口
 */
@Component("bContextStrategy")
public class BContextStrategy implements IContextStrategy {

    @Override
    public void say() {
        System.out.println("B 策略");
    }
}
