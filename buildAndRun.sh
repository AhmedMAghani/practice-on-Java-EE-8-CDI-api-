#!/bin/sh
mvn clean package && docker build -t org.example/ScoopesJakartaEE8 .
docker rm -f ScoopesJakartaEE8 || true && docker run -d -p 8080:8080 -p 4848:4848 --name ScoopesJakartaEE8 org.example/ScoopesJakartaEE8 
