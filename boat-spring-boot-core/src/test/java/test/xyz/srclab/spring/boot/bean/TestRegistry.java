package test.xyz.srclab.spring.boot.bean;

import org.jetbrains.annotations.NotNull;
import xyz.srclab.spring.boot.bean.BeanProperties;
import xyz.srclab.spring.boot.bean.BeanRegistry;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestRegistry extends BeanRegistry {

    @Resource
    private TestProperties testProperties;

    @NotNull
    @Override
    protected Map<String, Object> registeredSingletons() {
        Map<String, Object> result = new HashMap<>();
        result.put("bean1", testProperties.getBean1());
        result.put("bean2", testProperties.getBean2());
        return result;
    }

    @NotNull
    @Override
    protected Set<BeanProperties> registeredBeans() {
        Set<BeanProperties> result = new HashSet<>();
        BeanProperties beanProperties = new BeanProperties();
        beanProperties.setName("testBean");
        beanProperties.setClassName(TestBean.class.getName());
        result.add(beanProperties);
        return result;
    }
}
