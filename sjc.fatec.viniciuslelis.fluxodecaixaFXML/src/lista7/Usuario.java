package lista7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius Lelis
 */
public class Usuario {
    private String nome;
    private String email;
    private String user;
    private String password;
    private boolean privilegio;

    Usuario(String nome, String email, String user, String password, boolean privilegio) {
        this.nome = nome;
        this.email = email;
        this.user = user;
        this.password = password;
        this.privilegio = privilegio;
    }
    public boolean getPrivilegio() {
        return privilegio;
    }
    public void setPrivilegio(boolean privilegio) {
        this.privilegio = privilegio;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    }

