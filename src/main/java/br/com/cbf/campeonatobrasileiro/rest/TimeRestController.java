package br.com.cbf.campeonatobrasileiro.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/times")
public class TimeRestController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public ResponseEntity<List<Time>> getTimes() {
        return ResponseEntity.ok().body(timeService.listarTimes());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Time> getTime(@PathVariable Integer id) {
        return ResponseEntity.ok().body(timeService.obterTime(id));
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarTime(Time time) {
        timeService.cadastrarTime(time);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
