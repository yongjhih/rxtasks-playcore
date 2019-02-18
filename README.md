# RxTasks for PlayCore

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RxTasks-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5599)
[![CircleCI](https://circleci.com/gh/yongjhih/rxtasks-playcore.svg?style=shield)](https://circleci.com/gh/yongjhih/rxtasks-playcore)
[![codecov](https://codecov.io/gh/yongjhih/rxtasks-playcore/branch/master/graph/badge.svg)](https://codecov.io/gh/yongjhih/rxtasks-playcore)

## Usage

```java

RxTasks.completes(() -> splitInstallManager.deferredInstall(modules)).subscribe();
```

```java
RxTasks.single(() -> splitInstallManager.startInstall(request)).subscribe();
```


## Installation

```gradle
compile 'com.github.yongjhih.rxtasks-playcore:rxtasks:-SNAPSHOT'
compile 'com.github.yongjhih.rxtasks-playcore:rxtasks-kotlin:-SNAPSHOT' // optional

compile 'com.github.yongjhih.rxtasks-playcore:cotasks:-SNAPSHOT' // for kotlin coroutines
```

## License

```
Copyright 2019 Andrew Chen

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
