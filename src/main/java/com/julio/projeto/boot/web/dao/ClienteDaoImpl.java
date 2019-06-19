package com.julio.projeto.boot.web.dao;

import org.springframework.stereotype.Repository;

import com.julio.projeto.boot.web.model.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao{

}
