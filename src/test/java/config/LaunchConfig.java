package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${environment}.properties")
public interface LaunchConfig extends Config {
    @Key("remote.url")
    String webDriverUrl();

    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("video.storage")
    String videoStorage();
}