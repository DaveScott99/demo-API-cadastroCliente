package com.praticando.democadastrocliente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praticando.democadastrocliente.model.Cliente;
import com.praticando.democadastrocliente.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /**
     * Método para retornar uma lista de clientes.
     * @return Retorna lista de clientes.
     */
    public List<Cliente> obterTodos(){
        // Colocar regra de negócio aqui caso tenha...
        return clienteRepository.obterTodos();
    }

    /**
     * Método que retorna o cliente encontrado pelo seu id.
     * @param id do cliente que será localizado.
     * @return Retorna um cliente caso tenha sido encontrado.
     */
    public Optional<Cliente> obterPorId(Integer id){
        return clienteRepository.obterPorId(id);
    }

    /**
     * Método para adicionar clientes na lista.
     * @param cliente que será adicionado.
     * @return Retorna o cliente que foi adicionado na lista.
     */
    public Cliente adicionar(Cliente cliente){
        // Poderia ter alguma lógica de negócio para validar o produto.
        return clienteRepository.adicionar(cliente);
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Integer id){
        // Aqui poderia ter alguma lógica de validação.
        clienteRepository.deletar(id);
    }
    
    /**
     * Método para atualizar o cliente na lista.
     * @param Id do cliente.
     * @param cliente que será atualizado.
     * @return Retorna o produto após atualizar a lista.
     */
    public Cliente atualizar(Integer Id, Cliente cliente){

        // Poderia ter alguma lógica de validação no ID.
        cliente.setId(Id);

        return clienteRepository.atualizar(cliente);
    }
}
