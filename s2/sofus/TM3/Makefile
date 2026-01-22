SOURCE =  testlibg.java graphics/*.java   

all: cmp

cmp:
	javac -d bin $(SOURCE)

clean:
	rm bin/*.class

run: cmp
	java -cp bin testlibg

