package org.istradata.rentasomething

class RentASomething {

	static hasMany = [providers: RentAProvider, resellers: RentAReseller]
	
    static constraints = {
    }
}
