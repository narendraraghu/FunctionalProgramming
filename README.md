Basically there are 4 category of functional interface to remember

Consumer	T →             Single Argument No result
  void accept(T t)

Predicate	T → boolean     return boolean
  boolean test(T t)

Supplier	→ T             No arg, return single result
  T get()

Function<T, R>	T → R       single arg, returns result
  R apply(T t)
