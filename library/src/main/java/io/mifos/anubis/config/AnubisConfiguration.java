/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.anubis.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.mifos.core.cassandra.config.EnableCassandra;
import io.mifos.core.lang.config.EnableApplicationName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.mifos.anubis.config.AnubisConstants.LOGGER_NAME;

/**
 * @author Myrle Krantz
 */
@Configuration
@EnableApplicationName
@EnableCassandra
@EnableConfigurationProperties(AnubisProperties.class)
public class AnubisConfiguration {

  @Bean(name = LOGGER_NAME)
  public Logger logger() {
    return LoggerFactory.getLogger(LOGGER_NAME);
  }

  @Bean()
  public Gson anubisGson()
  {
    return new GsonBuilder().create();
  }
}
