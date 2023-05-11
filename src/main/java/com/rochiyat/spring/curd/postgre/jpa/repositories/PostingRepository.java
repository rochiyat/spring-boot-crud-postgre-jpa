package com.rochiyat.spring.curd.postgre.jpa.repositories;

import com.rochiyat.spring.curd.postgre.jpa.models.Posting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostingRepository extends JpaRepository<Posting, Long> {

    List<Posting> findByPublished(boolean published);
    List<Posting> findByTittleContaining(String tittle);

}
