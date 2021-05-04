package com.majo.webservices.controller;

import java.util.Collection;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.majo.webservices.entity.Note;
import com.majo.webservices.error.NotesNotFoundException;
import com.majo.webservices.repository.INotesRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping("notes-app")
public class NotesAppController {
	private static final Logger log = LoggerFactory.getLogger(NotesAppController.class);

	@Autowired
	private INotesRepository notesRepository;

	@GetMapping("/test")
	public String test() {
		log.debug("Test Webservice");
		return "notes-app is running: " + new Date();
	}

	@GetMapping("/notes")
	public Collection<Note> notes() {
		log.debug("Returning all Notes");
		return notesRepository.findAll();
	}

	@GetMapping(path = "/{noteId}")
	public Note find(@PathVariable("noteId") Long noteId) {
		if (notesRepository.existsById(noteId)) {
			return notesRepository.findById(noteId).get();
		} else throw new NotesNotFoundException(noteId);
	}

	@PostMapping(consumes = "application/json")
	public Note create(@RequestBody Note user) {
		return notesRepository.save(user);
	}

	@DeleteMapping(path = "/{noteId}")
	public void delete(@PathVariable("noteId") Long noteId) {
		if (notesRepository.existsById(noteId)) {
			notesRepository.deleteById(noteId);
		} else throw new NotesNotFoundException(noteId);
	}

	@PutMapping(path = "/{noteId}")
	public Note update(@PathVariable("noteId") Long noteId, @RequestBody Note note) throws BadHttpRequest {
		if (notesRepository.existsById(noteId)) {
			note.setId(noteId);
			return notesRepository.save(note);
		} else {
			throw new BadHttpRequest();
		}
	}

}