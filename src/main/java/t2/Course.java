package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Project name(项目名称)：Spring注入集合
 * Package(包名): t2
 * Class(类名): Course
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/21
 * Time(创建时间)： 21:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Course
{
    private static final Log LOGGER = LogFactory.getLog(Course.class);
    //课程编号
    private Integer courseId;
    //课程名称
    private String courseName;

    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("courseId：").append(courseId).append('\n');
        stringbuilder.append("courseName：").append(courseName).append('\n');
        return stringbuilder.toString();
    }
}
