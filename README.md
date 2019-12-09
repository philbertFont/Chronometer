                                                      CHRONOMETER

Chronometer is aclass that implements atimer which can be used to count time up or down from a point of time. Android Chronometer can be used with certain functions SystemClock.elapsedRealtime, getBase(), setBase(),getformat(), setFormat(), start(), stop(), setOnChronometerTickListener(), isCountDown(), setCountDown(), isTheFinalCountDown(), getContentDescriptionThe major functions needed for a chronometer are start(), stop(), getBase() and setBase(); these are needed to start the counting of the timer, stops the timer, retrieve the current time of the chronometer and also set the time (or day) to continue counting, respectively. The chronometer was introduced in android API level 1 with the basic instructions get base, set base, get format, set format,start, stop. Later, in API level 3 the set and get of on tick listener wasadded. Visibility change entered at API level 8, the set countdown and isCountDown is introduced at level 24 finally is final count down in API level 26.



first: find chronometer id and save it in a variable to be used
second: declare buttons to be used with chronometer so it can be adjusted 
third: a start button can be used to start the chronometer time which counts up automatically in seconds using chronometer.start();
forth: a second button is used to stop the timer by calling the chronometer.stop();  
