CLASSPATH=lib:/*:.

MarkdownParse.class: MarkdownParse.java
	javac -cp ${CLASSPATH} MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp ${CLASSPATH} MarkdownParseTest.java

test: MarkdownParse.class MarkdownParseTest.class
	java -cp ${CLASSPATH} MarkdownParseTest

