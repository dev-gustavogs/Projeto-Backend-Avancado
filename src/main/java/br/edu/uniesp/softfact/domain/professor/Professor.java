package br.edu.uniesp.softfact.domain.professor;

import br.edu.uniesp.softfact.zo.old.stack.StackTecnologia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professor {

    private Long id;
    private String nome;
    private String email;

    private Set<StackTecnologia> stacks = new HashSet<>();
}
