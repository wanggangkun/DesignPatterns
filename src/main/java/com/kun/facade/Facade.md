组建一个家庭影院：

    DVD播放器、投影仪、自动屏幕、环绕立体声、爆米花机
    
外观模式：提供一个统一的接口，来访问子系统中一群功能相关接口

外观模式定义了一个高层接口，让子系统更容易使用。

最少知识原则：尽量减少对象之间的交互，只留几个“密友”

项目设计中就是不要让太多的类耦合在一起

如何遵循最少知识原则：

    对象的方法调用范围：
    
        该对象本身
        
        作为参数传进来的对象
        
        此方法创建和实例化的对象
        
        对象的组件
