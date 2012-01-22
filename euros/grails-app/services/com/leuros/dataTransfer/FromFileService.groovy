package com.leuros.dataTransfer

class FromFileService {

    def readingFile {
		
		myFileDirectory = "\\Users\\Mosca\\desarrollo\\euromillon\\euros\\result-files"
		myFileName = "resultadosSorteos.txt"
		myFile = new File(myFileDirectory + myFileName)
		
		printFileLine = { println "File line: " + it }
		
		myFile.eachLine( printFileLine )
		
    }
}
