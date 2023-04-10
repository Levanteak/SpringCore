package org.levanteak.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.levanteak.springCourse")
@PropertySource("AnimeSerialShow.properties")
public class SpringConfig {
}
