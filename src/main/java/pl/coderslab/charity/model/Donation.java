package pl.coderslab.charity.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@NotNull
public class Donation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Setter(AccessLevel.NONE) Long id;

  private Integer quantity;

  @OneToMany(mappedBy = "")
  private List<Category> categories = new ArrayList<>();

  @OneToOne
  @JoinColumn
  private Institution institution = new Institution();

  private String street;

  private String city;

  private String zipCode;

  private LocalDate pickUpDate;

  private LocalTime pickUpTime;

  private String pickUpComment;
  //TODO if save as ''
}
