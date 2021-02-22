package com.killpackoff.simulation.app
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.killpackoff.fight.FightFragment
import javax.inject.Inject
import javax.inject.Provider

/**
 * @author ma.kolpakov
 */
class MainFragmentFactory @Inject constructor(

) : FragmentFactory() {
    // вот это вообще за гранью добра FightFragment  из другого копонента вообще не связанного с AppComponent как оно тут доступно?
    // Более того внутренняя зависимоть Core модуля прокидывается ив файт и в фёст
    @Inject
    lateinit var fightFragment: Provider<FightFragment>

    @Inject
    lateinit var firstFragment: Provider<FirstFragment>

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            FightFragment::class.qualifiedName -> fightFragment.get()
            FirstFragment::class.qualifiedName -> firstFragment.get()
            else -> {
                 super.instantiate(classLoader, className)
            }
        }
    }
}