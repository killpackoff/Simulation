package test

import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observables.ConnectableObservable
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject


/**
 * @author ma.kolpakov
 */
fun main() {
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

