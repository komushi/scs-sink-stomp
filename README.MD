
## Test with http source and geocoding processor
```
java -jar time-source-rabbit-1.3.0.RELEASE.jar --server.port=7070 --spring.cloud.stream.bindings.output.destination=ticktock

java -jar target/scs-sink-stomp-1.0.0-RELEASE.jar --spring.cloud.stream.defaultBinder=rabbit --spring.cloud.stream.bindings.input.destination=ticktock --logging.level.info.cloudnative=TRACE --stomp.topic=toproute --stomp.withsockjs=true

```