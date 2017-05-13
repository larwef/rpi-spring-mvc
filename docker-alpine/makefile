all: build run

build:
	@printf "\nBuilding...\n"
	(cd ../; gradle shadowjar)
	@cp -p $(shell ls ../build/libs/*SNAPSHOT*.jar | grep -v /orig | head -1) toRoot/app.jar
	docker build -t rpi-spring-mvc .
run:
	@printf "\nRunning...\n"
	docker run -it --rm -p 9094:9094 rpi-spring-mvc
