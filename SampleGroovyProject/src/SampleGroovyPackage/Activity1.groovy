package SampleGroovyPackage

import groovy.beans.ListenerList
import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter

class Activity1 {
	
	static main(args)
	{
		def x;
		int y;
		
		
		//declare array
		def arr= [1,2.0,"Saahil",true,x,y]
		
		arr.each { println "Value is:" +it+ ".Data"+it.getClass() }
		
				
	}
}
