package SampleGroovyPackage

import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter

class Activity4 {
	
	static main(args)
	{
		def str="This is a Groovy Language"
		
		//print the string in reverse
		println(str.reverse())
		
		//print the substring Groovy Language
		println(str.substring(10))
		
		//Split the string into separate words : [This, is, a, Groovy, Language]
		println(str.split(" "))
		
		//Remove words from the given string : This is a  Language
		println(str-"Groovy")
		
		//Convert the given string toLowerCase and toUpperCase : this is a groovy language/THIS IS A GROOVY LANGUAGE
		println(str.toLowerCase())
		println(str.toUpperCase())
		
		//REGEX OPERATIONS
		//matches()
		def matchStatus = str.matches("(.*)Groovy(.*)")
		if(matchStatus) { println "String matches" }
		
		//replaceAll()
		def replaceWith = "very Groovy"
		println(str.replaceAll("Groovy", replaceWith))
		//Notice that the original string is not changed
		println str
		
		
		
						
				
	}
}
