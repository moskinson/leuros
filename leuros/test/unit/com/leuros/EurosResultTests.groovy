package com.leuros



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(EurosResult)
class EurosResultTests {

    void testOne() {
       
		def euroResults = new EurosResult(season: 2012, 
									date : '20/11/2012',
									day :'Friday',
									ball1 : 1,
									ball2 : 2,
									ball3 : 3,
									ball4 : 4,
									ball5 : 5,
									star1 : 6,
									star2 : 7)

		assert euroResults.date == '20/11/2012'
		assert euroResults.ball3 == 3
		
    }
}
