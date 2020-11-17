package com.xxt.entity;

public class SysLog {

    private Long id;

    private String username;

    private String operation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
