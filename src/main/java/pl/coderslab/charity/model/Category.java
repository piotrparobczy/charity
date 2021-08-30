package pl.coderslab.charity.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@NotNull
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Setter(AccessLevel.NONE) Long id;

  private String name;
}
