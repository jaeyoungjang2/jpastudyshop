package jpastudybook.jpastudyshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
// 구현체를 가질 것이기 때문에 추상클래스로 만들 것임
public abstract class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    private List<Categories> categories = new ArrayList<>();
}
