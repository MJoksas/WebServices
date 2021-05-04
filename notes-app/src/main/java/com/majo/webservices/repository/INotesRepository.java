package com.majo.webservices.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.majo.webservices.entity.Note;

@Repository
@Qualifier("notesRepository")
public interface INotesRepository extends JpaRepository<Note, Long> {


}
