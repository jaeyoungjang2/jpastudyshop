package jpastudybook.jpastudyshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//JPA 내장타입이라는 것이기 떄문에
//어디에든 내장될 수 있다는 annotation
@Embeddable
@Getter
public class Address {
    @Id @GeneratedValue
    @Column(name = "city_id")
    private String city;
    private String street;
    private String zipcode;
}
