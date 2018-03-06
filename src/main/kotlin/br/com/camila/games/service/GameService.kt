package br.com.camila.games.service

import br.com.camila.games.model.Game
import br.com.camila.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameService {

    @Autowired
    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game>{
        return gameRepository.findAll()
    }

    fun salvar(game: Game){
        gameRepository.save(game)
    }

    fun buscarPor(nome: String) : List<Game>{
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }

}