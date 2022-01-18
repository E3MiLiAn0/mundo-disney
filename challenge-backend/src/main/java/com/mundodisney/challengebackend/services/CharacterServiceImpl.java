package com.mundodisney.challengebackend.services;

import com.mundodisney.challengebackend.entities.Character;
import com.mundodisney.challengebackend.repositories.BaseRepository;
import com.mundodisney.challengebackend.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl extends BaseServiceImpl<Character,Long> implements CharacteService {

    @Autowired
    private CharacterRepository characterRepository;

    public CharacterServiceImpl(BaseRepository repository, BaseRepository<Character, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Character> search(String filtro) throws Exception {
        try {
            List<Character> character = characterRepository.findByNombreContaining(filtro);
            return character;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
