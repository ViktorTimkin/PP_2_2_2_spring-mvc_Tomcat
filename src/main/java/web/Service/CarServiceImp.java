package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Dodge Viper", "Red"));
        cars.add(new Car(2, "Chevrolet Impala", "Black"));
        cars.add(new Car(3, "Porche 911", "Yellow"));
        cars.add(new Car(4, "Какая то там", "Какой то там"));
        cars.add(new Car(5, "Не важно", "Да пофиг"));
    }

    @Override
    public List<Car> list(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
