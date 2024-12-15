##  Java

Java Basic concepts

### File Structure
*  Data Structure
   * List
     * List 
     * Map Reduce
   * Map
     * MapInt
* FileHandling
  * Create File
  * Read From File
  * Write to a File
* Optionals
  * initialization
    * Optional.of(); 
    * Optional.empty();
    * Optional.ofNullable("Optional value");
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
  * Intermediate operations - map, flatMap, filter, distint, sorted() with custom Comperator (customComperator return -1 if input1 needs to be before input2.)
  * Terminal Operations - collect, ForEach, toList,  count, min, max, findFirst, findAny, allMatch, anyMatch, noneMatch
* utilities
  * Base64 Encoding
