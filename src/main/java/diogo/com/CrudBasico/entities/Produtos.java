package diogo.com.CrudBasico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
@Entity
@Table
public class Produtos {
    @Id
    @Column(unique = true)
    private Long id;
    private String name;
    private BigDecimal preco;
}
