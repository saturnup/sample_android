# sample_android
Sample Android appliation demonstrating the Saturnup SDK

## Integration Quick Start

Add the Saturnup maven repository to your build.gradle:
```Gradle
repositories {
    ...
    maven { url 'http://maven.saturnup.com' }
}
```

Add the Saturnup SDK as a dependency:
```Gradle
dependencies {
    ...
    compile 'com.saturnup:sdk:0.1.0'
    ...
}
```

Add the INTERNET permission to your AndroidManifest.xml, inside the `<manifest>`
tag but outside the `<application>` tag:

```XML
<uses-permission android:name="android.permission.INTERNET" />
```

Register `QuestionActivity` as an activity inside your `<application>` tag:
```XML
<activity android:name="com.saturnup.sdk.question.QuestionAdActivity" />
```
