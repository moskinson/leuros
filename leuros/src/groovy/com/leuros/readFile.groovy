package com.leuros

class readFile {

	File myFile
	def myFileDirectory =  System.getProperty("user.dir") + "//ficheros-resultados//"
	def myFileName = "resultadosSorteos.txt"

	def pintaLineas() {
		myFile = new File(myFileDirectory + myFileName)
		def List lineas = []
		def FileLine = { lineas.add(it) }
		
		myFile.each( FileLine )
		return lineas
	}

	
}
