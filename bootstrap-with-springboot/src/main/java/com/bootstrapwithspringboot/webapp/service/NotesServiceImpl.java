package com.bootstrapwithspringboot.webapp.service;

import com.bootstrapwithspringboot.webapp.dao.NotesRepository;
import com.bootstrapwithspringboot.webapp.domain.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by abraun on 23/11/2017.
 */
@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public List<Notes> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public Optional<Notes> findOne(Long id) {
        return notesRepository.findById(id);
    }

    @Override
    public Notes saveNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public void deleteNotes(Long id) {
        notesRepository.deleteById(id);
    }
}
