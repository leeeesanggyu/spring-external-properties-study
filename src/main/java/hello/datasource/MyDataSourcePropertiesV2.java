package hello.datasource;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV2 {

    private String url;
    private String userName;
    private String password;
    private Etc etc;

    public MyDataSourcePropertiesV2(String url, String userName, String password, Etc etc) {
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.etc = etc;
    }

    @Getter
    public static class Etc {
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();

        public Etc(int maxConnection, Duration timeout, @DefaultValue("default") List<String> options) {
            this.maxConnection = maxConnection;
            this.timeout = timeout;
            this.options = options;
        }
    }
}
