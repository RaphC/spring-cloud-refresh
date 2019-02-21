# spring-cloud-refresh

The app demonstrate how to reproduce the bug about refresh. Here is a way to reproduce :

I launch my app

```
mvn spring-boot:run
```

 Once started I invoke http://localhost:8080/mylist endpoint. So the application returns

``` 
 ["A","H","P"]
```

So then, I change my src/test/resources/application.yml file with the following content

```
example:
myList:
- H
- P
```

... and call POST http://localhost:8080/admin/refresh endpoint. Everything seems fine :

```
["example.myList[0]","example.myList[2]","example.myList[1]"]
```

... finally a call again http://localhost:8080/mylist endpoint and the application returns

```
 ["H","P","P"]
```
