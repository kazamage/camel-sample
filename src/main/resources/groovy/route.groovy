package groovy

import jp.pgw.develop.swallow.camelsample.GenericRoute

beans {
    routes(GenericRoute, { GenericRoute builder ->
        builder.from('file://path/send?fileName=test.txt')
                .to('sftp://host/receive?username=user&password=password')
        builder.from('sftp://host/receive?username=user&password=password&fileName=test.txt&delete=true')
                .log('${file:name}')
                .process(builder.stopProcess())
    } as jp.pgw.develop.swallow.camelsample.RouteDef)
}
