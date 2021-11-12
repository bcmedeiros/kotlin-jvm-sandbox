h1. Bug reproduction

https://github.com/open-telemetry/opentelemetry-java-instrumentation/issues/4629

1. Run th server
```shell
./gradlew :server:run
```

2. Download OTEL
```shell
echo "Downloading otel..."
wget https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.7.2/opentelemetry-javaagent-all.jar -O opentelemetry-javaagent-all.jar

```
3. Run the client
```shell
./gradlew run
```

