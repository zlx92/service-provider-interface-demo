# service-provider-interface-demo
改项目是service-provider-interface的demo
具体实现:
 定义一个接口或者抽象类
 提供该接口或抽象类的实现类
 在resources目录下先创建META-INF/services  以接口或者抽象类的全路径当作文件名，文件内容是实现类的全路径，每一个实现类单独一行
 调用:ServiceLoader.load(接口或者抽象类)
