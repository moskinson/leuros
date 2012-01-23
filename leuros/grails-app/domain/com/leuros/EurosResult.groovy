package com.leuros

class EurosResult {

	
	/*
	 * 
	 * static mapping = {
		version false		
		table name: "games", schema: "games_data"
	}
	 */
	
	Integer season
	String date
	String day
	Integer ball1
	Integer ball2
	Integer ball3
	Integer ball4
	Integer ball5
	Integer star1
	Integer star2
	
	
    static constraints = {
		ball1(maxSize:50, minSize:1)
		ball2(maxSize:50, minSize:1)
		ball3(maxSize:50, minSize:1)
		ball4(maxSize:50, minSize:1)
		ball5(maxSize:50, minSize:1)
		star1(maxSize:11, minSize:1)
		star2(maxSize:11, minSize:1)
    }
}
