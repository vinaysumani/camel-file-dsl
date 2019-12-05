package com.vks;

import java.time.LocalDateTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.log4j.Logger;

import us.gov.dot.faa.atm.tfm.tfmdataservice.TfmDataService;

public class SimpleRouteBuilder extends RouteBuilder {

	private static final Logger LOGGER = Logger.getLogger(SimpleRouteBuilder.class);
	static int i = 0;

	@Override
	public void configure() throws Exception {

		DataFormat jaxb = new JaxbDataFormat("us.gov.dot.faa.atm.tfm.tfmdataservice");

		from("file:C:/check/input1?delete=true")
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String str = exchange.getIn().getBody(String.class);

				if (str.contains("<ns12:tmiFlightDataList>")) {

					exchange.setProperty("PRESENTa", true);
				} else {
					exchange.setProperty("PRESENTa", false);
				}

			}
		})
		.choice()
			.when(simple("${exchangeProperty[PRESENTa]} == 'true'"))
				.unmarshal(jaxb).process(new Processor() {
				public void process(Exchange exchange) throws Exception {
					TfmDataService tfm = exchange.getIn().getBody(TfmDataService.class);
					String str = tfm.getFiOutput().getFiMessage().getTmiFlightDataList().getFlightData().get(0).getFlight()
							.getAircraftId();
					System.out.println("*************************" + str);
				}
				})
				.log("Success------------comp---------------- ${file:name}")
			.otherwise()
				.log("Failure------------ss---------------- ${file:name}.  number ${exchangeProperty[count]} ------"
						+ LocalDateTime.now() + "-----------" + Thread.currentThread().getId())
		.end();


	}

}
