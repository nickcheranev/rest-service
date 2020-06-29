package com.example.restservice;

import org.springframework.core.style.ToStringCreator;

/**
 * @author Cheranev N.
 * created on 24.06.2020.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", id).append("content", content).toString();
    }
}
