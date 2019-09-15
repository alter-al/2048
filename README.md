Purpose
------------

I took an app [Android-2048](https://github.com/veryyoung/2048) as a sample to show how [AndroidScreenshotTestCase](https://github.com/facebook/screenshot-tests-for-android) works.

Prerequisites
------------

    $ pip install mock
    $ pip install Pillow

Usage
------------

#### Recording tests
    $ ./gradlew recordDebugAndroidTestScreenshotTest
    $ ./gradlew executeScreenshotTests -Precord

#### Executing tests
    $ ./gradlew verifyDebugAndroidTestScreenshotTest
    $ ./gradlew executeScreenshotTests
