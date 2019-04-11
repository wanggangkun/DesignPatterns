有些对象我们只需要一个：线程池、缓存、硬件设备等

如果多个实例会有造成冲突、结果的不一致性等问题

单例模式：确保一个类最多只有一个实例，并提供一个全局访问点

多线程问题

优化：

    同步（synchronized）getInstance方法
    
    “急切”创建实例
    
        public static ChocolateFactory uniqueInstance = new ChocolateFactory();
        
    双重检查加锁
    
        public volatile static ChocolateFactory uniqueInstance = null;
        
        if (uniqueInstance == null){
        
            synchronized (ChocolateFactory.class){
            
                if (uniqueInstance == null){
                
                    uniqueInstance = new ChocolateFactory();
                    
                }
                
            }
            
        }
        
