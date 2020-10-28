package SampleGroovyPackage

import java.awt.GraphicsDevice
import java.lang.invoke.SwitchPoint
import java.text.BreakIterator

import org.codehaus.groovy.ast.stmt.CaseStatement

import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter
import groovyjarjarantlr4.v4.runtime.tree.pattern.ParseTreePatternMatcher.StartRuleDoesNotConsumeFullPattern

class Activity2 {
	
	static main(args)
	{
		def marks=[61,75,82,96,45]
		
		def sum=0
		
		
		for(int i=0;i< marks.size();i++)
		{
			sum=sum+marks[i]		
		}
		
		//printing the average of marks arrray
		println("The average is : "+(sum/marks.size()))
		
		//maximum marks obtained
		println("The max marks is : "+marks.max())
		
		//minimum marks obtained
		println("The max marks is : "+marks.min())

			def grade
		switch(sum/marks.size() as Integer)
		{
			case 0..50 :grade="F"
						break 
			case 50..69:grade="D"
						break
			case 70..79:grade="c"
						break
			case 80..89:grade="B"
						break
			case 90..100:grade="A"
						 break
			default:grade="invalid"
					break
			
		}
		
		println("The grade is: $grade")
		
						
				
	}
}


