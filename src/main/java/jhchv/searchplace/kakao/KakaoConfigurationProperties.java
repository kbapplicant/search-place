package jhchv.searchplace.kakao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("kakao")
public class KakaoConfigurationProperties {

    private String restApiKey;

    private String javaScriptKey;

    private String searchPlaceByKeywordUrl;

}