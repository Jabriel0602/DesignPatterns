package com.test.design;

import com.demo.design.strategy.ContextStrategyFactory;
import com.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangzhanbang
 * @date 2018/11/15 13:34
 * @desc
 */
public class DesignTest extends BaseTest {

    @Autowired
    private ContextStrategyFactory contextStrategyFactory;

    @Test
    public void strategyDesign() {
        contextStrategyFactory.doStrategy("aContextStrategy").eat();
        contextStrategyFactory.doStrategy("bContextStrategy").eat();
    }
}
