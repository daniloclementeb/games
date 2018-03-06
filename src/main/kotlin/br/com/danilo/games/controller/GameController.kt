package br.com.danilo.games.controller

import br.com.danilo.games.model.Game
import br.com.danilo.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/game")
class GameController {

    @Autowired
    lateinit var gameService: GameService

    @GetMapping
    fun buscarTodos(): List<Game>{
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game){
        gameService.salvar(game)
    }

    @GetMapping("/titulo/{titulo}")
    fun busca(@PathVariable("titulo") titulo: String) :List<Game> {
        return gameService.buscarPor(titulo)
    }

    @DeleteMapping("/{id}")
    fun apagar(@PathVariable("id") id: String) {
        return gameService.apagar(id)
    }

}