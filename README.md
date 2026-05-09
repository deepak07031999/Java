##  Java

Java Basic concepts

### File Structure
*  Data Structure
   * List
     * List 
     * Map Reduce
   * Map
     * MapInt
   * String
     * String literal vs String class object
     * use of .intern() to ensure 2 String object reference the String Pool object
   * Type Casting
     * Primitive Data Type Casting
       * Int -> byte (down casting)
       * Int -> float(up casting)
     * Class type casting
       * Child -> Parent (up casting)
       * Parent -> child (down casting)
   * Enum
     * constructor in enum
     * enum.valueOf() -> from enum, get one group of object.
* User Input
  * System.in.read() reads a single byte of input from the console and returns it as an integer representing the ASCII code of the character.
  * Using BufferedReader, BufferedReader's constructor takes InputStreamReader object as argument. InputStreamReader's constructor takes InputStream object in constructor args() we can pass System.in).
* FileHandling
  * Create File
  * Read From File
  * Write to a File
* Optionals
  * initialization
    * Optional.of(); 
    * Optional.empty();
    * Optional.ofNullable();
  * Checking
    * input1.isPresent()
    * input2.isEmpty()
  * Access
    * input1.get()
    * input2.orElse()
    * input2.orElseGet(()->);
  * IfPresent
  * Transform
    * OptionalClass::getOutput
    * OptionalClass::getOutputOpt
* Serialization And Deserialization
  * Gson
    * fromJson
    * toJson
  * Jackson
    * JsonProperty: this act as setter, have higher priority over JsonAlias 
    * JsonAlias: Can have multiple values, used to fill value for one variable
    * ObjectMapper.readValue
    * ObjectMapper.writeValueAsString()
* Stream
  * Intermediate operations - map, flatMap, filter, distint, sorted() with custom Comperator (customComperator return 1 if input1 and input2 needs to be swapped)
  * Terminal Operations - collect, ForEach, toList,  count, min, max, findFirst, findAny, allMatch, anyMatch, noneMatch
* Threads
  * ByExtendingThreadClass
    * We can use Thread by extending Thread class and implementing run function, and use start() function to start it on a thread.
  * ByImplementingRunnable
  * We can use priority
    * getPriority()
    * setPriority
  * sleep(10): To pause thread, function argument are in milli seconds
  * Thread.join(): this use to pause the execution of the current thread until the thread on which it is called completes.
  * Daemon thread: runs in background and does not stop JVM from exiting when all user threads complete.
    * setDaemon(true) must be called before start()
  * Thread.getAllStackTraces(): returns a map of all live threads with their stack traces.
  * synchronized keyword is used to handle thread synchronization by controlling access to shared resources
  * CountDownLatch: makes one thread wait until other ExecutorService tasks call countDown(); use await(timeout) to avoid waiting forever.
  * CyclicBarrier: makes multiple threads wait at a common point; barrier opens when all threads call await().
  * Exchanger: lets two threads meet and swap data with each other using exchange().
  * Thread states - New, Runnable, Running, Waiting, Dead
  * Executor
    * newSingleThreadExecutor(): executes submitted tasks one by one using a single worker thread.
    * newFixedThreadPool(3): executes submitted tasks using a fixed number of worker threads.
    * newScheduledThreadPool(1): creates a scheduled executor that can run tasks after a delay or repeatedly.
    * scheduleWithFixedDelay(new Task(0), 2, 1, TimeUnit.SECONDS): starts after 2 seconds, then waits 1 second after each task completion before running again.
    * Callable: similar to Runnable, but it can return a value and throw checked exceptions.
    * submit(new CallableTask(1)): submits a Callable task to ExecutorService and returns a Future.
    * Future.get(): waits for the Callable task to complete and returns its result.
* XML
  * DTD
  * XSD
* Logger
  * Level : Debug < Info < warn < error < fatal
  * created logger using: Logger log = LogManager.getLogger();
  * log4j2.xml
    * Configuration
      *  internal logging level of Log4j itself
    * Appenders
      * Console Appender
      * File Appender
    * slf4j
* utilities
  * Base64 Encoding
