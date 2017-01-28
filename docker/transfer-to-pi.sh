#!/bin/bash

PI_IP="192.168.1.31"
PI_USER="pi"

cp -p "$(ls ../build/libs/*SNAPSHOT.jar | grep -v /orig | head -1)" toRoot/app.jar

rsync -r ../docker/ . $PI_USER@$PI_IP:rpi-spring-mvc/
