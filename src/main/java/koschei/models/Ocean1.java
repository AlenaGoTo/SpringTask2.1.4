package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    //Океан связан с островом через поле с @Autowired,
    // которая подтянет бин Island2 через бин-метод getIsland() в классе AppConfig.
    // т.к. сам класс острова не объявлен бином
    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
