package com.mundodisney.challengebackend.services;

import com.mundodisney.challengebackend.entities.Character;

import java.util.List;

public interface CharacteService extends BaseService <Character, Long>{
    List<Character> search(String name) throws Exception;
}
