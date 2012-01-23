package com.leuros

class EurosResultController {

   def EurosResultService

  def index() { 
	  
	  render view: "/eurosResult/list", model: [InstanceResult: EurosResult.all]	
	  
  }
  

   def loadData() {
		
		EurosResultService.readFile()
		render view: "/eurosResult/list", model: [InstanceResult: EurosResult.all]
	
   }
   def listAllResults() {
	   
	   return EurosResult.all
   }
} 
