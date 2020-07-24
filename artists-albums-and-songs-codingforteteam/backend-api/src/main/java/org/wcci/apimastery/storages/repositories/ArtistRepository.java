package org.wcci.apimastery.storages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.entities.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}