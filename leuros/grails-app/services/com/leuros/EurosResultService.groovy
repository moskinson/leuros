package com.leuros

class EurosResultService {

	def List resultados
	def List resultadosEuromillon

	
	def readFile() {
		def reading = new readFile();
		resultados = reading.pintaLineas();
		
		resultadosEuromillon = []
		List bolas
		boolean primeraLinea = true;
		
		resultados.each {

			if (!primeraLinea){
				def separaDatos
				bolas = []
				separaDatos = it.split(';').toList()
				
				int cuantos = separaDatos[10].split(' ').size()
				if (cuantos == 5){
					
					separaDatos[10].split(' ').toList().each {
						bolas.add(it.toInteger())
					}
					
					separaDatos[14].split(' ').toList().each {
						bolas.add(it.toInteger())
					}
					def Results = new EurosResult(season : separaDatos[2].toInteger(),
							date : separaDatos[3],
							day : separaDatos[6],
							ball1 : bolas.get(0),
							ball2 : bolas.get(1),
							ball3 : bolas.get(2),
							ball4 : bolas.get(3),
							ball5 : bolas.get(4),

							star1 : bolas.get(5),
							star2 : bolas.get(6))
					Results.save()
					resultadosEuromillon.add(Results)
				}
			}else primeraLinea = false;
		}

	}
	
	def counts(Integer seasonSearch) {
		Map collectResults = [:]
		int value
		if (seasonSearch == 0){
		for (i in 1..50){
			def query = EurosResult.where {
				ball1 == i || ball2 == i || ball3 == i || ball4 == i || ball5 == i
			 }
			 value = query.count()
			collectResults.put(i, value)
		}
		}
		else {
			for (i in 1..50){
				def query = EurosResult.where {
					season == seasonSearch && (ball1 == i || ball2 == i || ball3 == i || ball4 == i || ball5 == i)
				 }
				 value = query.count()
				collectResults.put(i, value)
			}
		}
		return collectResults
	}
	
}
