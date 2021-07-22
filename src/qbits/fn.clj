(ns qbits.fn
  (:import (java.util.function Function
                               BiFunction
                               BiConsumer
                               Supplier
                               Consumer
                               Predicate
                               LongConsumer
                               DoubleConsumer)))

(defn supplier*
  ^Supplier
  [f]
  (reify Supplier
    (get [_] (f))))

(defmacro supplier
  {:style/indent 1}
  [& args]
  `(supplier* (fn ~@args)))

(defn function*
  ^Function
  [f]
  (reify Function
    (apply [_ x] (f x))))

(defmacro function
  {:style/indent 1}
  [& args]
  `(function* (fn ~@args)))

(defn bifunction*
  ^BiFunction
  [f]
  (reify BiFunction
    (apply [_ x y]
      (f x y))))

(defmacro bifunction
  {:style/indent 1}
  [& args]
  `(bifunction* (fn ~@args)))

(defn consumer*
  ^Consumer
  [f]
  (reify Consumer
    (accept [_ x] (f x))))

(defmacro consumer
  {:style/indent 1}
  [& args]
  `(consumer* (fn ~@args)))

(defn biconsumer*
  ^BiConsumer
  [f]
  (reify BiConsumer
    (accept [_ x y]
      (f x y))))

(defmacro biconsumer
  {:style/indent 1}
  [& args] `(biconsumer* (fn ~@args)))

(defn long-consumer*
  ^LongConsumer
  [f]
  (reify LongConsumer
    (accept [_ x] (f x))))

(defmacro long-consumer
  {:style/indent 1}
  [& args] `(long-consumer* (fn ~@args)))

(defn double-consumer*
  ^DoubleConsumer
  [f]
  (reify DoubleConsumer
    (accept [_ x] (f x))))

(defmacro double-consumer
  {:style/indent 1}
  [& args] `(double-consumer* (fn ~@args)))

(defn runnable*
  ^Runnable
  [f]
  (reify Runnable
    (run [_] (f))))

(defmacro runnable
  {:style/indent 1}
  [& args] `(runnable* (fn ~@args)))
