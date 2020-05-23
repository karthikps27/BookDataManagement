package org.karthikps.bookdata.repository;

import org.karthikps.bookdata.models.BookDataItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDataAccessRepository extends JpaRepository<BookDataItems, String> {
	
}
