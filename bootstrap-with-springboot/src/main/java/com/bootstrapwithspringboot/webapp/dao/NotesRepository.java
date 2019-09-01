package com.bootstrapwithspringboot.webapp.dao;

import com.bootstrapwithspringboot.webapp.domain.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abraun on 23/11/2017.
 */
@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
}
