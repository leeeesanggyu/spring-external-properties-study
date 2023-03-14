package hello.datasource;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV1 {

    private String url;
    private String userName;
    private String password;
    private Etc etc;

    @Data
    public static class Etc {
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();
    }
}
