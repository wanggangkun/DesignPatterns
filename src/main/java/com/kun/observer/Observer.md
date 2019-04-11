Internet气象站项目：
    提供温度、气压和湿度的接口
    测量数据更新时需实时通知给第三方
    需要设计开放型API，便于其他第三方公司也能接入气象站获取数据

1.观察者模式就像订牛奶业务
    1）奶站，Subject
    2）用户，Observer
2.Subject：登记注册、移除和通知
3.Observer：接受输入
4.观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为Subject，依赖的对象为Observer，Subject通知Observer变化

Java内置的观察者
    Observable
    Observer