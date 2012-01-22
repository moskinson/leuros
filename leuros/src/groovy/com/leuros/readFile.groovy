package com.leuros

class readFile {

	def File myFile
	def myFileDirectory = "\\Users\\Mosca\\desarrollo\\euromillon\\leuros\\ficheros-resultados"
	def myFileName = "resultadosSorteos.txt"
	
	
	def pintaLineas(){
		myFile = new File(myFileDirectory + myFileName)
		printFileLine = { println "File line: " + it }
		
		myFile.eachLine( printFileLine )
	}

	
}
