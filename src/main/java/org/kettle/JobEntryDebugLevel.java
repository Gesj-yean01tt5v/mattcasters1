package org.kettle;

import org.pentaho.di.core.Condition;
import org.pentaho.di.core.logging.LogLevel;

public class JobEntryDebugLevel implements Cloneable {
  private LogLevel logLevel;

  private boolean loggingResult;
  private boolean loggingVariables;
  private boolean loggingResultRows;
  private boolean loggingResultFiles;

  public JobEntryDebugLevel() {
    logLevel=LogLevel.DEBUG;
    loggingResult=false;
    loggingVariables=false;
    loggingResultRows=false;
    loggingResultFiles=false;
  }

  public JobEntryDebugLevel( LogLevel logLevel ) {
    this();
    this.logLevel = logLevel;
  }

  public JobEntryDebugLevel( LogLevel logLevel, boolean loggingResult, boolean loggingVariables, boolean loggingResultRows, boolean loggingResultFiles) {
    this(logLevel);
    this.loggingResult = loggingResult;
    this.loggingVariables = loggingVariables;
    this.loggingResultRows = loggingResultRows;
    this.loggingResultFiles = loggingResultFiles;
  }

  @Override public JobEntryDebugLevel clone() {
    return new JobEntryDebugLevel(logLevel, loggingResult, loggingVariables, loggingResultRows, loggingResultFiles );
  }


  /**
   * Gets logLevel
   *
   * @return value of logLevel
   */
  public LogLevel getLogLevel() {
    return logLevel;
  }

  /**
   * @param logLevel The logLevel to set
   */
  public void setLogLevel( LogLevel logLevel ) {
    this.logLevel = logLevel;
  }

  /**
   * Gets loggingResult
   *
   * @return value of loggingResult
   */
  public boolean isLoggingResult() {
    return loggingResult;
  }

  /**
   * @param loggingResult The loggingResult to set
   */
  public void setLoggingResult( boolean loggingResult ) {
    this.loggingResult = loggingResult;
  }

  /**
   * Gets loggingVariables
   *
   * @return value of loggingVariables
   */
  public boolean isLoggingVariables() {
    return loggingVariables;
  }

  /**
   * @param loggingVariables The loggingVariables to set
   */
  public void setLoggingVariables( boolean loggingVariables ) {
    this.loggingVariables = loggingVariables;
  }

  /**
   * Gets loggingResultRows
   *
   * @return value of loggingResultRows
   */
  public boolean isLoggingResultRows() {
    return loggingResultRows;
  }

  /**
   * @param loggingResultRows The loggingResultRows to set
   */
  public void setLoggingResultRows( boolean loggingResultRows ) {
    this.loggingResultRows = loggingResultRows;
  }

  /**
   * Gets loggingResultFiles
   *
   * @return value of loggingResultFiles
   */
  public boolean isLoggingResultFiles() {
    return loggingResultFiles;
  }

  /**
   * @param loggingResultFiles The loggingResultFiles to set
   */
  public void setLoggingResultFiles( boolean loggingResultFiles ) {
    this.loggingResultFiles = loggingResultFiles;
  }
}
