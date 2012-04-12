package org.istradata.rentasomething

class RentAReseller extends RentASeller {
	
	static belongsTo = [rentAProvider: RentAProvider]
	static hasMany = [rentAProvider: RentAProvider]
	
    static constraints = {
    }
}
