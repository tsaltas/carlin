Overview
========
Simple stub Dropwizard App

How-to compile
==============
You can compile using the gradle wrapper or the native gradle
```
gradle clean fatJar
```

or
```
./gradlew clean fatJar
```

How-to run
==========
```
./deploy.sh
```

You may have to grant executable rights `chmod a+x deploy.sh`
Configuration
=============

Change port
-----------
### Command Line
main port: `-Ddw.http.port=9090`
admin port: `-Ddw.http.adminPort=9091`

### Config File
```
http:
	port: 9090
	adminPort:9091
