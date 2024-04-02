package koschei.config;

import koschei.models.Deth8;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    // методами создаются Бин острова и иглы (POJO-классов)
    // Обратите внимание, что данный метод обозначен аннотацией @Bean, что автоматически подтягивает
    // аргументы в метод. В качестве аргумента выступает бин Wood3. (связь острова и леса)
    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Needle7 getNeedle(Deth8 deth) {
        return new Needle7(deth);
    }
}
