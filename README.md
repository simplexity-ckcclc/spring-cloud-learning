# Spring cloud
demo code of [史上最简单的 SpringCloud 教程 | 终章](http://blog.csdn.net/forezp/article/details/70148833)

### Port
- eureka-server : 9000
- eureka-client : 9001
- ribbon : 9010
- feign : 9011
- zuul : 9020
- zipkin : 9040
- config-server : 9030

### Link
- eureka-server : http://localhost:${eureka-server.port} 
- zipkin : http://localhost:${zipkin.port}/

### Step
1. config-center修改值后刷新config-client的值. POST HTTP http://${ip}:${port}/refresh. 本项目config-client为Feign module
