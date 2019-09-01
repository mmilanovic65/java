package com.bootstrapwithspringboot.webapp.service;

import com.bootstrapwithspringboot.webapp.domain.Notes;

import java.util.List;
import java.util.Optional;

/**
 * Created by abraun on 23/11/2017.
 */
public interface NotesService {

    List<Notes> findAll();

    Optional<Notes> findOne(Long id);

    Notes saveNotes(Notes notes);

    void deleteNotes(Long id);

}
