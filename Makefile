
build:
	./mvnw clean package

docker:
	docker build -t geograph:develop .

run:
	docker run -p 8080:8080 -t geograph:develop
