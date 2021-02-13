package test;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.PublishSubject;

class JavaTest {
    public static void main(String[] args) {
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtExce..................вption(Thread t, Throwable e) {
//                System.out.println("Globaal");
//            }
//        });
        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                System.out.println("RX");
            }
        });
        PublishSubject<String> subject = PublishSubject.create();
        subject.onErrorReturn(new Function<Throwable, String>() {
            @Override
            public String apply(@NonNull Throwable throwable) throws Exception {
                System.out.println("reutn");
                return "Defult";
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                System.out.println("error");
            }
        });
        subject.onNext("F");
        subject.onNext(null);
        subject.onNext("S");
    }
}