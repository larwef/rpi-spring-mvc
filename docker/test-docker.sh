#!/bin/bash

printf "\nBuilding docker image..."
docker build -t rpi-spring-mvc .
printf "\nRunning docker image...\n"
docker run -it --rm -p 8087:8087 rpi-spring-mvc
