# Train Schedule Sample Application

## Introduction

The generation of the executable jar file can be performed by issuing the following command

    mvn clean package

This will create an executable jar file **trainSchedule.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/trainSchedule.jar
    
Run in debug mode    

    java -Xdebug -agentlib:jdwp=transport=dt_socket,address=9999,server=y,suspend=n -jar target\trainSchedule.jar

Postgres

    docker run -d --name pg-train-schedule -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=train_schedule -p 5432:5432 postgres:latest

Consul

    docker run -d --name consul -p 8500:8500 -p 8600:8600 consul
    