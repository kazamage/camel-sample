package groovy

import jp.pgw.develop.swallow.camelsample.GenericRoute

beans {
    routes(GenericRoute, { GenericRoute builder ->
    } as jp.pgw.develop.swallow.camelsample.RouteDef)
}
