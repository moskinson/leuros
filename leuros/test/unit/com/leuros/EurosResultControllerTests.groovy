package com.leuros



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EurosResultController)
class EurosResultControllerTests {

    void testloadData() {
       	   
	   List results = controller.findAll()
	   assert results.size() != 0
    }
}
