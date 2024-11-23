package Runtime学习;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();

        System.out.println(rt.availableProcessors());
        //可用的处理器数量
        System.out.println(rt.maxMemory() / 1024 / 1024);
        //最大内存
        System.out.println(rt.totalMemory());
        //已经分配的内存

        //rt.exec() ;
        //Process exec = rt.exec("calc");
        //calc调用的是计算器
        //Process exec = rt.exec("notepad");
        //notepad调用的是记事本
        //Process exec = rt.exec("cmd");
        //cmd调用的是命令行
        //Process exec1 = rt.exec("regedit");
        //regedit调用的是注册表，注意要是管理员权限
        //不然会报错，CreateProcess error=740, 请求的操作需要提升。
        //Process exec = rt.exec("cmd /c start");
        //Process exec = rt.exec("taskmgr");
        //taskmgr调用的是任务管理器


    }


}

