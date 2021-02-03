package com.killpackoff.simulation.core

import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.BiFunction
import io.reactivex.observables.ConnectableObservable
import io.reactivex.plugins.RxJavaPlugins


/**
 * @author ma.kolpakov
 */
fun main() {
//    val mainTest = MainTest()
//    mainTest.start()
//    Thread.sleep(5_000)
//    mainTest.stop()

    println("_Start_")
    Thread.currentThread().uncaughtExceptionHandler = Thread.UncaughtExceptionHandler { p0, p1 ->
        println("UncaughtExceptionHandler")
    }

//    throw Exception()

    val observable = ConnectableObservable.just(1)
    observable.subscribe { println(it) }
    observable
        .publish()
        .connect()
//
//    val observable1 = Observable.error<Int>(Exception())
//    val observable2 = Observable.error<Int>(Exception())
//    val zipper = BiFunction<Int, Int, String> { one, two -> "$one - $two" }
//    val subscribe = observable1.zipWith(observable2, zipper)
//        .subscribe(
//            { println(it) },
//            { println("asd") }
//        )
//    subscribe.dispose()


}

class MainTest {
    private val disposables = CompositeDisposable()
    var callable: MyCallBack = object : MyCallBack {
        override fun exequte(s: String) {
            println("Callback result - $s")
        }
    }

    fun start() {
        println("<<<<<<<<<<<<<---Start--->>>>>>>>>>>>>>")
//        val observable = serverDownloadObservable
        val observable = Observable.fromCallable { runRequest() }.blockingSingle()

//        val disposable1 = observable.subscribeOn(Schedulers.io()).subscribe {
//            println(" " + it + " " + Thread.currentThread().name)
//        }
        ////
        println(observable)

//        disposables.add(disposable1)
    }

    fun stop() {
        println("<<<<<<<<<<<<<---End--->>>>>>>>>>>>>>")
        disposables.dispose()
    }

    fun runRequest(): String {
        Thread.sleep(1000) // simulate delay
        callable.exequte("complite")
        return "addd"
    }

    val serverDownloadObservable = Observable.create { emitter: ObservableEmitter<Int?> ->
        for (i in 1..10) {
            emitter.onNext(i)
            Thread.sleep(500) // simulate delay
        }
        emitter.onComplete()
    }
}

interface MyCallBack {
    fun exequte(s: String)
}

