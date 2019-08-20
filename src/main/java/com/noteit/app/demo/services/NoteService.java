package com.noteit.app.demo.services;

import com.noteit.app.demo.models.Note;
import com.noteit.app.demo.repositories.NoteRepository;
import com.noteit.app.demo.utils.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService implements GenericDAO<Note> {

    private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note saveOrUpdate(Note entity) {
        return noteRepository.save(entity);
    }

    @Override
    public Note findById(Long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        noteRepository.deleteById(id);
        return true;
    }
}
