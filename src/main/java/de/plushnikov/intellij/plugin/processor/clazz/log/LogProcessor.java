package de.plushnikov.intellij.plugin.processor.clazz.log;

import com.intellij.openapi.components.Service;
import de.plushnikov.intellij.plugin.LombokClassNames;

/**
 * @author Plushnikov Michail
 */
@Service
public final class LogProcessor extends AbstractTopicSupportingSimpleLogProcessor {

  private static final String LOGGER_TYPE = "java.util.logging.Logger";
  private static final String LOGGER_INITIALIZER = "java.util.logging.Logger.getLogger(%s)";

  public LogProcessor() {
    super(LombokClassNames.JAVA_LOG, LOGGER_TYPE, LOGGER_INITIALIZER, LoggerInitializerParameter.NAME);
  }
}
