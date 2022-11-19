package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal1;
    private Animal animal2;

    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal1,
                       @Qualifier("dog") Animal animal2, Timer time) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString() + " " + animal2.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
    // Сначала не создал геттер, выдавало ошибку в тесте, додумался создать геттер и заработало.
    // Не понимаю суть теста. В тесте получается выдает одинаковое время выполнения, потому как таймер один и тот же.
    // А в мэйне время разное потому как создаем таймер каждый раз.
}
