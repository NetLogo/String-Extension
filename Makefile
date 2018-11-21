.PHONY: default test

default: src/*.scala
	sbt compile

test: src/*.scala
	sbt test
