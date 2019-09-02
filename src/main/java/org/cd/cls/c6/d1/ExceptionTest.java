package org.cd.cls.c6.d1;

/**
 * @description: 空指针异常
 * @author: Mr.Wang
 * @create: 2019-09-02 22:22
 **/
public class ExceptionTest {
    public static void main(String[] args) throws AddException {
        //空指针异常NullPointerException
        /*String s = null;
        s.indexOf("a");
        System.out.println("end");*/

        /*try {//（数字格式异常）NumberFormatException
            int num = Integer.parseInt("abc");
            System.out.println(num);
        }catch (NumberFormatException e){
            //捕获异常try/catch
            System.err.println("不是有效数字！");
            throw new AddException("不是有效数字"); //向上继续抛出异常
        }catch(Exception e){
            e.printStackTrace();//打印异常栈
            throw e;
        }*/


        System.out.println(test());
        System.out.println(test0());

        /**
         * NullPointerException 和 NumberFormatException 有一个共同的父类 Throwable 它有
         * 4个public构造方法：
         * public Throwable()
         * public Throwable(String message)
         * public Throwable(String message, Throwable cause)
         * public Throwable(Throwable cause)
         * message:异常消息，cause：触发该异常的其它异常
         *
         *
         * fillInStackTrace()：保存异常栈信息
         *
         *  Throwable 所有异常的基类，它有两个子类： Error和Exception
         *  Error: 表示系统错误或资源耗尽，由 Java 系统自己使用，应用程序不应抛出和处理,
         *      虚拟机错误(VirtualMacheError)及其子类内存溢出错误（ OutOfMemory-Error)和栈溢出错误（StackOverflowError）
         *  Exception：表示应用程序错误，它有很多子类，应用程序也可以通过继承 Exception其子类创建自定义异常，
         *      子类：IOException （输入输出 1/0 异常）、RuntimeException （运行时异常）、 SQLException （数据库 SQL 异常）
         *      RuntimeException：表示的实际含义是未受检异常（unchecked exception），相对而言， Exception 的其他
         *                      子类 Exception 自身则是受检异常（ checked exception), Error 及其子类也是未受检异常。
         *
         *
         *  try{
         *      //可能抛出 ExceptionA ExceptionB
         * } catch (ExceptionA | ExceptionB e) { //jdk1.7以上支持语法 多个异常可以用 | 操作符
         *      e.printStackTrace() ;
         * }
         */

    }

    //实际执行过程是：在执行到 try 内的 return ret ；语句前，
    // 会先将返回值 ret 保存在 个临时变量中，然后才执行 finally 语句，最后 try 再返回那
    //个临时变量 finally 中对 ret 的修改不会被返回
    public static int test(){
        int ret = 0;
        try{
            return  ret;
        }finally {
            ret = 2;
        }
    }

    //int a = 5 / 0; 会触发 ArithmeticException ，但是 finally 中有 return 语句，这个方法
    //就会返回 ，而不再向上传递异常了 finally 中，如果 finally 中抛出了异常，则原异常也
    //会被掩盖，
    public static int test0() throws AddException {
        int ret = 0;
        try{
            int a = 5 / 0;
            return  ret;
        }finally {
            /**
             * finally 中抛出了 AddException ，则原异常 ArithmeticException 就丢失了 所以，一般而言 ，
             * 为避免混淆，应该避免在 finally 中使用 return 语句或者抛出异常，如果调用的
             * 他代码可能抛出异常 则应该捕获异常并进行处理。
             */
            throw new AddException("Hello");
            //return 2;
        }
    }
}
