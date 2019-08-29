package lom;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
// @EqualsAndHashCode(callSuper=true)
public class Child extends Parent {
  private String second;
}
