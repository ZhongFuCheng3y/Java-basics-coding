package 了解递归;

/**
 * Created by asd on 2016/9/7.
 */

/**
 * 递归: 方法定义中调用方法本身
 */
/*
   要点:
        1:方法的嵌套调用,不算是递归
            Math.max(Math.max(a,b),c);
        2:递归一定要有出口,否则就是死递归
        3:递归的次数不能太多,否则就会内存溢出
        4:构造方法不能递归使用
   举例:
 * 		A:从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
 * 			从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
 * 				从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
 * 					从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
 * 						...
 * 					庙挂了,或者山崩了
 * 		B:学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
 * 			 学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
 * 				学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
 * 					学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
 * 						...
 * 					娶不到媳妇或者生不了娃娃
 */
public class DiGuiDemo {
}
