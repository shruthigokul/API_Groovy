package SampleGroovyPackage

import javax.net.ssl.ExtendedSSLSession
import javax.swing.event.InternalFrameListener

import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter

class Activity5 {
	static main(args)
	{
			def mixList=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
			def intList=[]
			def strList=[]
			
			mixList.each {
				println(it)
				if(it==~/[A-Z][a-z]+/)
			{
				strList.add(it)
			}
			else 
			{ 
				intList.add(it)
			
			}
			}
			println (intList)
			println (strList)
			
	}
}
