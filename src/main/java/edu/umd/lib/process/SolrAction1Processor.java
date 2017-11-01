package edu.umd.lib.process;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

/**
 * @author audani
 */

public class SolrAction1Processor extends EventProcessor {

  private Map<String, String> config;
  private static Logger log = Logger.getLogger(SolrAction1Processor.class);

  public SolrAction1Processor(Map<String, String> config) {
    this.config = config;
  }

  /**
   * Deletes a file or a folder and its children, specified by header
   * "source_path" and constructs a JSON string for Solr deletion.
   */
  @Override
  public void process(Exchange exchange) throws Exception {
    log.info("    SolrAction 1 Start");
    log.info("      Body: " + exchange.getIn().getBody());
    Thread.sleep(500);
    log.info("    SolrAction 1 End");
  }

}
