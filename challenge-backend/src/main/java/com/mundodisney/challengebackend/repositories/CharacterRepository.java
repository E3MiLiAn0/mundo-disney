package com.mundodisney.challengebackend.repositories;

import com.mundodisney.challengebackend.entities.Character;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends BaseRepository<Character,Long> {

    List<Character> findByNombreContaining (String nombre);

}
