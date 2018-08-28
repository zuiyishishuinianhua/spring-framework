package org.springframework.personal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chenyao
 * @date 2018/8/28.
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean = beanFactory.getBean("myTestBean", MyTestBean.class);
        System.out.println(myTestBean.getTestStr());
    }
}
