all: build run

build:
	@printf "\nBuilding docker image..."
	docker build -t rpi-spring-mvc .
run:
	@printf "\nRunning docker image...\n"
	docker run -it --rm -p 9094:9094 rpi-spring-mvc
