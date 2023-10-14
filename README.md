# This application implements the functionality of creating short links from the presented ones in **REACTIVE** format.
+ A short link is three characters generated from the base character set.
+ The database stores links that are currently busy.
+ The link has a life timeout, after which it is deleted from the database and becomes free again.
+ Redis is used as a database.
+ A bash script test.sh has been written that allows you to simulate the load on the server.