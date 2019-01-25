package br.com.jonyfs.spring.websocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Greeting implements Serializable {

    private static final long serialVersionUID = 7063967184864879453L;
    private String content;
}
