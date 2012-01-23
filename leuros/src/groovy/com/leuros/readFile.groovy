package com.leuros

class readFile {

	File myFile
	def myFileDirectory =  System.getProperty("user.dir") + "//ficheros-resultados//"
	def myFileName = "resultadosSorteos.txt"

	def pintaLineas() {
		myFile = new File(myFileDirectory + myFileName)
		def List lineas = []
		def printFileLine = { 
			//system.println("File line: " + it)
			lineas.add(it)
		 }
		
		myFile.each( printFileLine )
		return lineas
	}

	
}
