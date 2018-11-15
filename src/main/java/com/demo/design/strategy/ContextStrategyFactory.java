package com.demo.design.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangzhanbang
 * @date 2018/11/15 11:31
 * @desc 策略上下文
 */
@Component
public class ContextStrategyFactory {

    /**
     *
     * 功能描述:线程安全的HashMap
     */
    @Autowired
    private Map<String, IContextStrategy> contextStrategy = new ConcurrentHashMap<>();

    public IContextStrategy doStrategy(String type) {
        return this.contextStrategy.get(type);
    }

}
