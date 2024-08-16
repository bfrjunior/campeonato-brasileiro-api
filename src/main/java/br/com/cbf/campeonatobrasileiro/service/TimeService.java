package br.com.cbf.campeonatobrasileiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;

@Service
public class TimeService {

    @Autowired
    private TimeRepository repository;

    public void cadastrarTime(Time time) {
        repository.save(time);
    }

    public List<Time> listarTimes() {
        return repository.findAll();
    }
}
