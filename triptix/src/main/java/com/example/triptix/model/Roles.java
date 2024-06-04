package com.example.triptix.model;

public enum Roles {
    USER("ROLE_USER", "user:read, user:write, event:create, event:update"),
    ADMIN("ROLE_ADMIN", "user:read, user:write, event:create, event:update"),
    DRIVER("ROLE_DRIVER", "user:read, user:write, event:create, event:update"),
    SUPER_ADMIN("ROLE_SUPER_ADMIN", "user:read, user:write, event:create, event:update");


    private final String roleName;
    private final String authorities;

    Roles(String roleName, String authorities) {
        this.roleName = roleName;
        this.authorities = authorities;
    }
}

