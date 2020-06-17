# Considerations
**Other annotations**
- String lengths  
- array lengths (also lists / collections)
- for testing only ?
  
**Units**
- other names ?
    - value unit
    - value type ?
    
   
```kotlin
//android example
fun usePx(@Dimension(unit = Dimension.PX) a:Int){}

fun wrongUsage () {  
    @Dimension(unit = Dimension.DP)
    val dp = 42
    usePx(dp) //does not get highlighted in AS
}

```

**Range**
- added external annotations from within regular code (eg when selecting external code in your own project rather than having to navigate first.)

**Treading selector**
```kotlin
private fun <T, U> CoroutineScope.loadAndTransform(
        dispatcher: CoroutineDispatcher,
        @InBackground loader: suspend () -> T,
        @InSelector("dispatcher") transformer: suspend (T) -> U //this is threaded dependent on the "dispatcher".
): Deferred<U> = asyncIO {
    val loaded = loader()
    withContext(dispatcher) {
        transformer(loaded)
    }
}

annotation class InSelector(val value: String)
```

The idea is that the "InSelector" (or what name) specifies a "known" parameter as the "selector" for what kind of threading this is.
this is essentially who coroutines are "encoded" in code as of writing.