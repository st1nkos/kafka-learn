package ru.zhdanov.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhdanov.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Integer> {
}
