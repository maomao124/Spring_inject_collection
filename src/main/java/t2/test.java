package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring注入集合
 * Package(包名): t2
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/21
 * Time(创建时间)： 21:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private static final Log LOGGER = LogFactory.getLog(t1.test.class);

    public static void main(String[] args)
    {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取名为 employee 的 Bean
        JavaCollection collection = context.getBean("javaCollection",JavaCollection.class);
        //通过日志打印员工信息
        LOGGER.info(collection.toString());
    }
}
