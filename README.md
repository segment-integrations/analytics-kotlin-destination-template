// add badges and stuff here

# Destination

## Getting Started

1. Create repo from this template. The name of the repo should follow this pattern `project-language-destination`. For example `analytics-kotlin-firebase`
2. In `settings.gralde.kts`, change `rootProject.name` to match your repo name.
3. In `gradle.properties`, update the fields with `<>` brackets
4. Delete `com.segment.analytics.kotlin.destinations.Destination.kt`
5. Create a directory with the destination name under `com.segment.analytics.kotlin.destinations`. For example Firebase, `com.segment.analytics.kotlin.destinations.firebase`
6. Create your destination class under the directory created in step 5. For example Firebase, `com.segment.analytics.kotlin.destinations.firebase.Firebase.kt`
7. update Android manifest with your package name. For example Firebase
   ```xml
    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.segment.analytics.kotlin.destinations.firebase">
   ```
8. Implement destination
9. Add tests


## License
```
MIT License

Copyright (c) 2021 Segment

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
