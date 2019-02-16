# spring-cloud project
Spring Cloud related projects

####Maven commands
```
mvn clean package
mvn clean install
mvn spring-boot:run
mvn clean compile
mvn compile jib:build
mvn compile jib:dockerBuild
mvn compile jib:buildTar
     docker load -i target/jib-image.tar
```

####GIT Feature Branch Workflow example
```
Create new local branch feature1
	git checkout -b feature1
Create new file feature1.txt
	touch feature1.txt
Add created file to local git stage
	git add feature1.txt
Commit new file to local branch
	git commit -m "Added feature1.txt file"
Create remote feature1 branch and push local branch to new remote one.
	git push -u origin feature1 
Checkout master branch
	git checkout master
Get latest changes from remote master
	git pull
Merge locally feature1 branch to local master
	git merge feature1
Push local master to remote master
	git push
```

####Spring Cloud Config Server
```
git repo
     https://github.com/macuein/config-repo.git
Test URLs
     http://127.0.0.1:8888/config-client/dev/master
     http://127.0.0.1:8086/limit
     http://127.0.0.1:8086/actuator/refresh
```

####Spring Cloud Eureka
```
Test URLs
     http://127.0.0.1:8761/
     http://127.0.0.1:9090/hello-world/pepe
```


####Spring Cloud Zipkin
```


```




