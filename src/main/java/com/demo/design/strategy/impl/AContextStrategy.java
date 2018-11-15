package com.demo.design.strategy.impl;

import com.demo.design.strategy.IContextStrategy;
import org.springframework.stereotype.Component;

/**
 * @author yangzhanbang
 * @date 2018/11/15 11:30
 * @desc 策略实现接口
 */
@Component("aContextStrategy")
public class AContextStrategy implements IContextStrategy {

    @Override
    public void say() {
        System.out.println("A 策略");
    }
}
