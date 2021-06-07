#!/bin/bash

up() {
  docker-compose up
}

build() {
  # docker-compose up db &>/dev/null &
  # Build Maven
  # /bin/sh ./mvnw clean package -DskipTests
  # docker-compose up api --force-recreate --build -d
  up
}

down() {
  docker-compose down
}

# Remover container/image
clean() {
  down
  docker-compose rm
  # docker rmi api
  docker image prune -f
}

case $1 in
"build")
  build
  ;;
"up")
  up
  ;;
"down")
  down
  ;;
"clean")
  clean
  ;;
*) echo "./build.sh up, down, build, clean" ;;
esac
