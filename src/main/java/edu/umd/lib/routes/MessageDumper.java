package edu.umd.lib.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;

public class MessageDumper implements Processor {
  private static Logger log = Logger.getLogger(MessageDumper.class);
  protected ProducerTemplate producer;
  static int messageCount = 0;

  @Override
  public void process(Exchange exchange) throws Exception {

    producer = exchange.getContext().createProducerTemplate();
    exchange.getIn().setBody("Message count " + messageCount);
    exchange.getIn().setHeader("action", "action1");
    log.info("------ MessageDumper action1 send ------");
    this.producer.send("direct:actions", exchange);
    messageCount++;

    producer = exchange.getContext().createProducerTemplate();
    exchange.getIn().setBody("Message count " + messageCount);
    exchange.getIn().setHeader("action", "action2");
    log.info("------ MessageDumper action2 send ------");
    this.producer.send("direct:actions", exchange);
    messageCount++;

  }

}