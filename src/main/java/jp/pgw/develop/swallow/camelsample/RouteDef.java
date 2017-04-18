package jp.pgw.develop.swallow.camelsample;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by kazamage on 2017/04/18.
 */
@FunctionalInterface
public interface RouteDef {

    void configure(GenericRoute builder) throws Exception;

}
