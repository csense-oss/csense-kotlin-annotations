# Considerations
**Other annotations**
- String lengths  
- array lengths (also lists / collections)
- for testing only ?

**Range**
- added external annotations from within regular code (eg when selecting external code in your own project rather than having to navigate first.)
- do the range annotations from csense as the range annotation from jetbrains is. (so the dialog that pops up have range(s) in it.)

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

The idea is that the "InSelector" (or what name might be choosen) specifies a "known" parameter as the "selector" for what kind of threading this is.
this is essentially who coroutines are "encoded" in code as of writing.