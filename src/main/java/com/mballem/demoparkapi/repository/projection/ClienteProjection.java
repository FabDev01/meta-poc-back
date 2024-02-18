package com.mballem.demoparkapi.repository.projection;

import com.mballem.demoparkapi.entity.Usuario;

public interface ClienteProjection {
    Long getId();

    String getNome();

    String getCpf();

    Usuario getUsuario();


}
