# ZoomableImageView

This is a custom component for Android to zoom images using touch gestures.

## Features

- Fluid enlargement and reduction of images.
- Image scrolling with touch gestures.

## Requeriments

- API 24 or more.

## Setup dependencies

### Gradle

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
    implementation 'com.github.dgqdev:ImageZoom:1.0.0'
}
```

### Maven

```xml
<!-- <repositories> section of pom.xml -->
<repository>
    <id>jitpack.io</id>
   <url>https://jitpack.io</url>
</repository>
```

```xml
<!-- <dependencies> section of pom.xml -->
<dependency>
    <groupId>com.github.dgqdev</groupId>
    <artifactId>ImageZoom</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```xml
<com.dgqdev.imagezoom.ZoomableImageView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:srcCompat="@drawable/your_image" />
```
