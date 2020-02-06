# generator-java-jackson

> jsoncodegen JSON to Java code generator for Jackson.

Interfaces are converted to POJOs for Jackson JSON. The POJOs exhibit the builder pattern. They should be instantiated like this:

```java
MyObject myObject = new MyObject(
  MyObject.Builder.create()
    .withName("Budapest")
    .withFlag(true)
    .withCount(3)
);
```

The order of the `with...` calls is not fixed.

The Builder will display a compile-time error if any of the required parameters is missing. This is ensured by generics. The error message can be a bit overwhelming:

```
[ERROR] Test.java:[20,39] constructor MyObject in class MyObject cannot be applied to given types;
[ERROR]   required: MyObject.Builder<MyObject.__OK__, ...>
[ERROR]   found: MyObject.Builder<MyObject.__MISSING_flag__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__,MyObject.__OK__>
[ERROR]   reason: actual argument MyObject.Builder<MyObject.__MISSING_flag__, ...> cannot be converted to MyObject.Builder<MyObject.__OK__, ...> by method invocation conversion
```

You should look for `MyObject.__MISSING_foo__` where `foo` will be the name of the missing field – meaning you should add a call to `.withFoo(...)`. All other generic parameters should have a value of `MyObject.__OK__`.

Enums are mapped to Java enums.

Numbers are mapped to `Double`.

Nullability is enforced by calls to `org.apache.commons.lang.Validate.notNull()`. If `null` is given, it will throw a `java.lang.IllegalArgumentException: Argument 'foo' must not be null.`

## Install

```
npm i -D jsoncodegen-generator-java-jackson
```

The generated code depends on:

```xml
<dependency>
  <groupId>commons-lang</groupId>
  <artifactId>commons-lang</artifactId>
  <version>2.6</version>
</dependency>
```

## Configure

Configuration can be put in jsoncodegen-generator-java-jackson.config.js and passed to jsoncodegen in the config parameter:

```
jsoncodegen --generator java-jackson --config jsoncodegen-generator-java-jackson.config.js ...
```

**jsoncodegen-generator-java-jackson.config.js**

```js
module.exports = {
  package: 'com.example'
}
```

### `package?: string`

The name of the target package. All generated classes will be in this package. Example: `"com.example"`

## License

MIT

## History

1.0.0 Initial version.
