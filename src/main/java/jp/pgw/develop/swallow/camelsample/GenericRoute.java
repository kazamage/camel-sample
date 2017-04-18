package jp.pgw.develop.swallow.camelsample;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by kazamage on 2017/04/18.
 */
public class GenericRoute extends RouteBuilder {

    protected final RouteDef routeDef;

    public GenericRoute(final RouteDef routeDef) {
        this.routeDef = routeDef;
    }

    @Override
    public void configure() throws Exception {
        routeDef.configure(this);
    }

    public Processor stopProcess() {
        return exchange ->
            getContext().createProducerTemplate().asyncSendBody("seda:stop", "stop");
    }

}
