package com.github.cleitonestefenon.fichatormentaapi.interfaces.rest;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.Pessoa;
import com.github.cleitonestefenon.fichatormentaapi.domain.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiOperation(value = "Cadastro de novas pessoas")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success method return")
})
@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping(path = "/cadastrar")
    public void cadastrarPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.salvar(pessoa);
    }

}
