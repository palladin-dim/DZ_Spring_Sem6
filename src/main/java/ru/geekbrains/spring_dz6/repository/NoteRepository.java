package ru.geekbrains.spring_dz6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.spring_dz6.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
