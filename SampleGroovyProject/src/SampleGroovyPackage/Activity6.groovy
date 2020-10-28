package SampleGroovyPackage

import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter

class Activity6 {
	static main(args)
	{
		def animalMap=[1:"Cats", 2:"Dogs", 3:"Wolves", 4:"Horses", 5:"Donkeys"]
		def addAnimalMap=[6:"Lions", 7:"Hyenas",9:"Tigers", 8:"Bear"]
		
		//print all key value pairs
		println(animalMap)
		
		//add new map to old maps
		def newAnimalMap=animalMap.plus(addAnimalMap)
		
		println(newAnimalMap)
		
		//print only values form new map in the ascending order
		println((newAnimalMap.minus(animalMap)).sort{it.value.length()})
		
		
		
		
				
	}
}
