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

(defmacro supplier [& args] `(supplier* (fn ~@args)))

(defn function*
  ^Function
  [f]
  (reify Function
    (apply [_ x] (f x))))

(defmacro function [& args] `(function* (fn ~@args)))

(defn bifunction*
  ^BiFunction
  [f]
  (reify BiFunction
    (apply [_ x y]
      (f x y))))

(defmacro bifunction [& args] `(bifunction* (fn ~@args)))

(defn consumer*
  ^Consumer
  [f]
  (reify Consumer
    (accept [_ x] (f x))))

(defmacro consumer [& args] `(consumer* (fn ~@args)))

(defn biconsumer*
  ^BiConsumer
  [f]
  (reify BiConsumer
    (accept [_ x y]
      (f x y))))

(defmacro biconsumer [& args] `(biconsumer* (fn ~@args)))

(defn long-consumer*
  ^LongConsumer
  [f]
  (reify LongConsumer
    (accept [_ x] (f x))))

(defmacro long-consumer [& args] `(long-consumer* (fn ~@args)))

(defn double-consumer*
  ^DoubleConsumer
  [f]
  (reify DoubleConsumer
    (accept [_ x] (f x))))

(defmacro double-consumer [& args] `(double-consumer* (fn ~@args)))

(defn runnable*
  ^Runnable
  [f]
  (reify Runnable
    (run [_] (f))))

(defmacro runnable [& args] `(runnable* (fn ~@args)))
