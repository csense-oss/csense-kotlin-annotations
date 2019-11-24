# 0.0.8
- added "InAny"
    (reason: you might want to bail out of the InUiContext / InBackgroundContext for certain methods, where the threading does not matter; this is the annotation for that)
 
# 0.0.7
- renamed InUIContext to InUiContext 
     
# 0.0.6
- InUiContext & InBackgroundContext added.
- further renamed BackgroundThread to InBackground, as the concept is not directly "thread" but more of concept.
    - also aligns with the "InUi" name.
    
- Changed retention to be binary, so for libraries it will be persisted, thus we can analyze those as well (usage of).

# 0.0.5
- renamed AnyThread to BackgroundThread as all "code" is regularly "any" thread, but the specialities are UI / background (IO)

# 0.0.4
- changed scope for threading. 

# 0.0.3
- renamed ranges to limit to avoid confusion with kotlin ranges. 
    (and it does signalize better the idea that it is a "limit").
    
# 0.0.2

# 0.0.1
initial setup and simple annotations added.