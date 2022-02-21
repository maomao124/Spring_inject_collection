package t1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Project name(项目名称)：Spring注入集合
 * Package(包名): t1
 * Class(类名): Collection
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/21
 * Time(创建时间)： 21:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Collection
{
    //1 数组类型属性
    private String[] courses;
    //2 list 集合类型属性
    private List<String> list;
    //3 map 集合类型属性
    private Map<String, String> maps;
    //4 set 集合类型属性
    private Set<String> sets;

    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps)
    {
        this.maps = maps;
    }

    public void setSets(Set<String> sets)
    {
        this.sets = sets;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("courses：").append(Arrays.toString(courses));
        stringbuilder.append("list：").append(list).append('\n');
        stringbuilder.append("maps：").append(maps).append('\n');
        stringbuilder.append("sets：").append(sets).append('\n');
        return stringbuilder.toString();
    }
}
