package br.com.jonyfs.spring.websocket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Message implements Serializable {

    private static final long serialVersionUID = -8890086320576401765L;
    private String name;
}
