package br.com.cbf.campeonatobrasileiro.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbf.campeonatobrasileiro.dto.NovoTimeDTO;
import br.com.cbf.campeonatobrasileiro.dto.TimeDTO;

import br.com.cbf.campeonatobrasileiro.service.TimeService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/times")
public class TimeRestController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public ResponseEntity<List<TimeDTO>> getTimes() {
        return ResponseEntity.ok().body(timeService.getTimes());
    }

    @PostMapping
    public ResponseEntity<TimeDTO> adicionarTime(@Valid @RequestBody NovoTimeDTO novoTimeDTO) throws Exception {
        return ResponseEntity.ok().body(timeService.adicionarTime(novoTimeDTO));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TimeDTO> atualizarTime(@RequestParam(value = "id", required = true) Integer id,
            @Valid @RequestBody NovoTimeDTO novoTimeDTO) throws Exception {
        return ResponseEntity.ok().body(timeService.atualizarTime(id, novoTimeDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarTime(@PathVariable Integer id) throws Exception {
        timeService.deletarTime(id);
        return ResponseEntity.ok().build();
    }
}
