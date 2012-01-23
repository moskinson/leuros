package com.leuros



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(EurosResultService)
class EurosResultServiceTests {

    void testReadFile() {
        service.readFile();
		
		assert service.resultados != null
		assert service.resultados.size() != 0
		
		assert service.resultadosEuromillon.size() != 0
		assert service.resultadosEuromillon[6].season != 0
		assert service.resultadosEuromillon[6].date != ""
		assert service.resultadosEuromillon[6].day != ""
		assert service.resultadosEuromillon[6].ball1 < 50
		assert service.resultadosEuromillon[6].ball2 > 0
		assert service.resultadosEuromillon[6].star1 < 10
		assert service.resultadosEuromillon[6].star1 > 0
    }
	
	
	
}
