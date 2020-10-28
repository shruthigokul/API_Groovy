package SampleGroovyPackage

import groovy.io.LineColumnReader

class Activity7 {
	
	
	static void main(args) {
		File file = new File("resources/sample.txt");
		file.createNewFile();
		
		file.write("A Quick Brown Fox Jumped Over The Lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfu51ng")
		
		//print the line that has cow at the end of line
		file.eachLine { line ->if(line=~/^*Cow$/)
			println(line)
		}
		
		//print the line that has cow at the end of line
		file.eachLine { line ->if(line=~/^J.*$/)
			println(line)
		}
		
		//Print the line that has two numbers one after the other
		file.eachLine { line ->if(line=~/^.*\d\d.*$/)
			println(line)
		}
		
		//Print the string(s) that match the pattern '\S+er'
	
        def match1 = file.getText() =~ /\S+er/
        println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
        
        def match2 = file.getText() =~ /\S*\d\W/
        println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
		//Print the string(s) that match the patter '\S*\d\W'
		
		
	}
}


