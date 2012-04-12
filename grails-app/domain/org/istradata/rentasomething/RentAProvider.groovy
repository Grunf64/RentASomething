package org.istradata.rentasomething

class RentAProvider extends RentASeller {

	static hasMany = [rentAReseller: RentAReseller, rentObjects: RentingObject, excursionTickets: ExcursionTicket]
	
    static constraints = {
    }
}
