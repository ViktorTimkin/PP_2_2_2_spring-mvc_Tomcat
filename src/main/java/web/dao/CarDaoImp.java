package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Dodge Viper", "Red"));
        cars.add(new Car(2, "Chevrolet Impala", "Black"));
        cars.add(new Car(3, "Porche 911", "Yellow"));
        cars.add(new Car(4, "Какая то там", "Какой то там"));
        cars.add(new Car(5, "Не важно", "Да пофиг"));
    }

    @Override
    public List<Car> cars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
