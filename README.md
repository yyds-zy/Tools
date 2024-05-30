# Tools

- Remarkable 在ubuntu上的安装
```
1、安装需要的软件
sudo apt-get install gdebi-core
2、下载源码生成安装包
git clone https://github.com/seiferteric/remarkable_debfix.git
cd remarkable_debfix/
dpkg-deb -Z xz -b old_deb remarkable_1.87_all.deb
3、安装
sudo gdebi remarkable_1.87_all.deb 
```
