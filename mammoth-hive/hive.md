# docker方式安装hive
## 下载镜像
docker pull teradatalabs/cdh5-hive
## 启动docker镜像
docker run -d --name hadoop-master -P -h hadoop-master teradatalabs/cdh5-hive
## 端口
10000 为hive的实际访问端口