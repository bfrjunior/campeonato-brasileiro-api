package br.com.cbf.campeonatobrasileiro.dto;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class ClassificacaoDTO {
    private List<ClassificacaoTimeDTO> times = new ArrayList<>();
}
