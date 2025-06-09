# 1.0.0
- kotlin 2.1.21
- rename package (for maven central)
- added
  - InIOContext
  - MustImplementEquals
  - UseSingletonInstance

- first version of "UnitSystem"
- updated namespaces for "in" (threading), "size" (collection) limit (numbers)
- added "ColoredCode"
- added InIO (akin to inBackground / inUI)

# 0.0.63

- fixed targets for CatchesException(s) & RethrowsExceptions
- renamed CatchesException to CatchesExceptions and changed parameter to be a KClass<Throwable> (and removed Type
  parameter)

# 0.0.62

- same as 0.0.61 targets instead java 11 (unfortunately 0.0.61 was without a target which caused it to use java 19
  bytecode)

# 0.0.61

- now available on tier 1 & tier 2 targets + mingw

# 0.0.60

- kotlin 1.8.10
    - ios/macos targets added
- added
- updated
    - InAny, InBackground, InUi to work on functional types
    - NoEscape to work on local variable

# 0.0.50

- kotlin 1.6.0
- DiscardableResult added
- InSelector added
- InAnyContext added for consistency
- improved doc

# 0.0.42

- kotlin 1.4.32
- gradle 7.0

# 0.0.41

- added NumberLimit
- kotlin 1.4.31

# 0.0.40

- use kotlin 1.4 (useful for double& float Limit)
    - {Double, Float}Limit have only 1 annotation now (with defaults)

- UnitSystem annotation added
- kotlin explicit library mode enabled & enforced
- Guided implementation annotation added

# 0.0.18

- added AnnotationTargets.Type as a workaround for the inability to annotate functional parameters.

# 0.0.17

- CalledFromConstructor was not preserved in binary
- collectionSize & variants added.

# 0.0.16

- propertyMustBeConstant added
- CalledFromConstructor added

# 0.0.15

- parameterLessConstructorRequired
- minor doc updated for superCallRequired

# 0.0.14

- limits on fields.

# 0.0.13

- suppress unused
- double & float limit have more variants (to avoid non constant upper limit / lower limits)

# 0.0.12

- updated targets further

# 0.0.11

- updated targets for threading annotations and NoEscape.

# 0.0.10

- updated scope for "NoEscape"

# 0.0.9

- added "NoEscape"

# 0.0.8

- added "InAny"
  (reason: you might want to bail out of the InUiContext / InBackgroundContext for certain methods, where the threading
  does not matter; this is the annotation for that)

# 0.0.7

- renamed InUIContext to InUiContext

# 0.0.6

- InUiContext & InBackgroundContext added.
- further renamed BackgroundThread to InBackground, as the concept is not directly "thread" but more of concept.
    - also aligns with the "InUi" name.

- Changed retention to be binary, so for libraries it will be persisted, thus we can analyze those as well (usage of).

# 0.0.5

- renamed AnyThread to BackgroundThread as all "code" is regularly "any" thread, but the specialities are UI /
  background (IO)

# 0.0.4

- changed scope for threading.

# 0.0.3

- renamed ranges to limit to avoid confusion with kotlin ranges.
  (and it does signalize better the idea that it is a "limit").

# 0.0.2

# 0.0.1

initial setup and simple annotations added.