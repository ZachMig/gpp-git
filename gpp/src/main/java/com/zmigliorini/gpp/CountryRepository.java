package com.zmigliorini.gpp;
import org.springframework.data.repository.CrudRepository;


/**
 * Spring CrudRepository which can retrieve a single Country object from the conencted database.
 * @author zmigliorini@gmail.com
 *
 */
public interface CountryRepository extends CrudRepository<Country, Integer> {
	
	/**
	 * Returns a single Country object with matching name.
	 * @param name the country name exactly as it appears in the database.
	 * @return Country object representing the matched record.
	 */
	Country findByName(String name);
	
}
