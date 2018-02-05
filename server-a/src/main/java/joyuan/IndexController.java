package joyuan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope
 *当运行时发现有配置更新的时候，通过调用RefreshScope.refresh(beanName)或RefreshScope.refreshAll()
 *
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${my.test}")
    String test;

    @RequestMapping("/")
    public String index(){

        return test;
    }
}
